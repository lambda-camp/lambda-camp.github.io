(ns camp.lambda.core
  (:require
   ["react" :as react]
   ["react-dom/client" :as react-dom-client]
   [helix.core :refer [$]]
   [refx.alpha :as refx]
   [camp.lambda.sections.body :refer [body]]))

(enable-console-print!)

(defonce app-root
  (-> js/document
      (.getElementById "app")
      react-dom-client/createRoot))

(defn render []
  (->> ($ body)
       ($ react/StrictMode)
       (.render app-root)))

(defn ^:dev/after-load clear-cache-and-render! []
  (refx/clear-subscription-cache!)
  (render))

(defn ^:export init []
  #_(refx/dispatch [:initialize-db])
  (render))
