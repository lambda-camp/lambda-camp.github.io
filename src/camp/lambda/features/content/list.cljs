(ns camp.lambda.features.content.list
  (:require
    [kitchen-async.promise :as p]
    [lambdaisland.fetch :as fetch]
    [helix.core :refer [defnc]]
    [helix.dom :as d]
    [helix.hooks :as hh]
    [refx.alpha :as refx]))

(defnc content-list [{:keys [_]}]
  (let [content-list (refx/use-sub [:content-list])]

    (hh/use-effect 
      []
      (p/try
        (p/let [resp (fetch/get
                       "/json/data.json")]
          (refx/dispatch [:set-content-list (-> (:body resp)
                                                (js->clj :keywordize-keys true)
                                                (:data))]))
        (p/catch :default e
          (prn :error e))))

    (d/ul
      {:class "menu bg-base-200 rounded-box w-56 my-2"}
      (for [content content-list]
        (d/li
          {:key (:name content)}
          (d/a
            {:href (:url content)}
            (:name content)))))))
