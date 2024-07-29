(ns camp.lambda.features.content.view
  (:require-macros [camp.lambda.utils.macros :refer [inline-resource]])
  (:require
    [camp.lambda.components.markdown :refer [markdown]]
    [camp.lambda.sections.header :refer [header]]
    [camp.lambda.sections.footer :refer [footer]]
    [kitchen-async.promise :as p]
    [lambdaisland.fetch :as fetch]
    [helix.core :refer [$ defnc]]
    [helix.dom :as d]
    [helix.hooks :as hh]
    [refx.alpha :as refx]))

(defnc view [{:keys [_]}]
  (let [current-route (refx/use-sub [:current-route])
        content-name (get-in current-route [:parameters :path :content-name])
        content (refx/use-sub [:content])]
    (hh/use-effect 
      []
      (p/try
        (p/let [resp (fetch/get
                       (str "/md/" content-name ".mdx"))]
          (refx/dispatch [:set-content (:body resp)]))
        (p/catch :default e
          (prn :error e))))

    (d/div
      ($ header {})
      (d/article
        {:className "prose md:container md:mx-auto py-10"}
        ($ markdown {:content content}))
      ($ footer {})))) 
