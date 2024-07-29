(ns camp.lambda.components.markdown
  (:require
    ["react-markdown" :default ReactMarkdown]
    [helix.core :refer [$ defnc]]))

(defnc markdown [{:keys [content]}]
  ($ ReactMarkdown 
     {:children content}))
