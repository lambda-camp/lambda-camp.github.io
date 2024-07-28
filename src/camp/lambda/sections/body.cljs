(ns camp.lambda.sections.body
  (:require
    [camp.lambda.sections.header :refer [header]]
    [camp.lambda.sections.footer :refer [footer]]
    [helix.core :refer [$ defnc <>]]
    [helix.dom :as d]
    [helix.hooks :as hh]
    [refx.alpha :as refx]))

(defnc body []
  (d/div
    {:class "container mx-auto"}
    ($ header {})
    "Hello, World!"
    ($ footer {})))
