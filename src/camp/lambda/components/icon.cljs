(ns camp.lambda.components.icon
  (:require
   [helix.core :refer [$ defnc <>]]
   [helix.dom :as d]
   [helix.hooks :as hh]
   [refx.alpha :as refx]))

(defnc icon [{:keys [width height viewBox className path-d]}]
  (d/svg
    {:xmlns "http://www.w3.org/2000/svg"
     :width width
     :height height
     :viewBox viewBox
     :className className}
    (d/path
      {:d path-d})))
