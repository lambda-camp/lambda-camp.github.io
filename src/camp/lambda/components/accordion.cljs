(ns camp.lambda.components.accordion
  (:require
   [helix.core :refer [defnc]]
   [helix.dom :as d]))

(defnc accordion [{:keys [title content]}]
  (d/div
    {:className "collapse collapse-arrow bg-base-200 my-2"}
    (d/input
      {:type "radio"
       :name "accordion"})
    (d/div
      {:className "collapse-title text-xl font-medium"}
      title)
    (d/div
      {:className "collapse-content"}
      content)))
