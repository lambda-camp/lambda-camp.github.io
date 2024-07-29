(ns camp.lambda.features.content.view
  (:require-macros [camp.lambda.utils.macros :refer [inline-resource]])
  (:require
    [helix.core :refer [$ defnc]]
    [helix.dom :as d]
    [refx.alpha :as refx]))

(defnc view [{:keys [_]}]
  (let [current-route (refx/use-sub [:current-route])
        content-name (get-in current-route [:parameters :path :content-name])]
    (js/console.log (inline-resource "test.mdx")))
  (d/div "hello"))
