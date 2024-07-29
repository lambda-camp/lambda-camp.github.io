(ns camp.lambda.components.browser
  (:require
   [helix.core :refer [defnc]]
   [helix.dom :as d]))

(defnc browser [{:keys [title content]}]
  (d/div
    {:className "mockup-browser bg-base-300 border"}
    (d/div
      {:className "mockup-browser-toolbar"}
      (d/div
        {:className "input"}
        title))
    (d/div
      {:className "bg-base-200 flex justify-center px-4 py-16"}
      content)))
