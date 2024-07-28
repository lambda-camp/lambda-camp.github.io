(ns camp.lambda.sections.header
  (:require
   [helix.core :refer [$ defnc <>]]
   [helix.dom :as d]
   [helix.hooks :as hh]
   [refx.alpha :as refx]))

(defnc header [{:keys [_]}]
  (d/div
    {:className "navbar bg-base-100 shadow-xl rounded-box"}
    (d/a
      {:className "btn btn-ghost text-xl"}
      (d/img
        {:src "https://upload.wikimedia.org/wikipedia/commons/3/39/Lambda_lc.svg"
         :width "20"
         :alt "Lambda Camp"})
      "Lambda Camp")))
