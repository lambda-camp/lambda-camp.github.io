(ns camp.lambda.subs
  (:require 
    [refx.alpha :as refx]))

(refx/reg-sub
 :db
 (fn [db _] db))

(refx/reg-sub
 :session
 (fn [db _]
   (:session db)))

(refx/reg-sub
 :current-route
 (fn [db]
   (:current-route db)))
