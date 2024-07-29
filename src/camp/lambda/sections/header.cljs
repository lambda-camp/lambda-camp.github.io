(ns camp.lambda.sections.header
  (:require
   [helix.core :refer [defnc]]
   [helix.dom :as d]))

(defnc header [{:keys [_]}]
  (d/div
    {:className "navbar bg-base-100"}
    (d/a
      {:className "btn btn-ghost text-xl"
       :href "/#/"}
      (d/img
        {:src "https://upload.wikimedia.org/wikipedia/commons/3/39/Lambda_lc.svg"
         :width "20"
         :alt "Lambda logo"})
      "Lambda Camp")))
