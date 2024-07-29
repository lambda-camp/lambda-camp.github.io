(ns camp.lambda.routes
  (:require [camp.lambda.sections.body :refer [body]]
            [camp.lambda.sections.header :refer [header]]
            [camp.lambda.features.content.view :as content]))

(def routes
  ["/"
   [""
    {:name      ::home
     :view      body
     :link-text "Home"
     :controllers
     [{;; Do whatever initialization needed for home page
       ;; I.e (refx/dispatch [::events/load-something-with-ajax])
       ;; Teardown can be done here.
       }]}]
   
   ["test"
    {:name      ::test
     :view      header
     :link-text "Test"
     :controllers
     [{;; Do whatever initialization needed for test page
       ;; I.e (refx/dispatch [::events/load-something-with-ajax])
       ;; Teardown can be done here.
       }]}]

   ["content/:content-name"
    {:name      ::content
     :view      content/view
     :link-text "Test"
     :controllers
     [{;; Do whatever initialization needed for test page
       ;; I.e (refx/dispatch [::events/load-something-with-ajax])
       ;; Teardown can be done here.
       }]}]])
