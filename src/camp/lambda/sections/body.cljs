(ns camp.lambda.sections.body
  (:require-macros [camp.lambda.utils.macros :refer [inline-resource]])
  (:require
    [camp.lambda.sections.header :refer [header]]
    [camp.lambda.sections.footer :refer [footer]]
    [camp.lambda.components.markdown :refer [markdown]]
    [helix.core :refer [$ defnc <>]]
    [helix.dom :as d]
    [helix.hooks :as hh]
    [refx.alpha :as refx]))

(defnc body []
  (d/div
    {:class "mx-auto"}
    ($ header {})
    (d/div
      {:className "hero bg-base-200 min-h-screen"}
      (d/div
        {:className "hero-content text-center"}
        (d/div
          {:className "max-w-md"}
          (d/h1
            {:className "text-5xl font-bold"}
            "Hello there 👋")
          (d/p
            {:className "py-6"}
            "Welcome to Lambda Camp, a place to learn about technology in general with custom contents that community builds, mantain and distribute!")
          (d/button
            {:className "btn btn-primary"}
            "Get Started"))))

    (d/div
      {:className "md:container md:mx-auto py-10"}
      (d/article
        {:className "prose"}
        ($ markdown {:content (inline-resource "home.mdx")})
        )) 

    ($ footer {})))
