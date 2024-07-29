(ns camp.lambda.sections.body
  (:require
    [camp.lambda.sections.header :refer [header]]
    [camp.lambda.sections.footer :refer [footer]]
    [camp.lambda.components.accordion :refer [accordion]]
    [camp.lambda.components.browser :refer [browser]]
    [camp.lambda.features.content.list :refer [content-list]]
    [helix.core :refer [$ defnc]]
    [helix.dom :as d]))

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
      (d/div
        {:class "md:flex md:flex-row"}
        (d/div
          {:class "md:w-1/2 p-5"}
          (d/h2
            {:class "text-3xl font-bold"}
            "About us")
          (d/p
            {:class "py-3"} 
            "We are a comprehensive platform dedicated to providing high-quality content about programming in general. Whether you're a beginner taking your first steps in coding or an experienced developer looking to expand your knowledge, offers a wide range of resources to help you on your programming journey.")
          (d/p
            {:class "py-3"} 
            "Our mission is to make programming more accessible to everyone, regardless of their background or experience level. We believe that technology is for everyone, and we want to help you unlock your full potential by providing you with the tools and resources you need to succeed."))
        (d/div
          {:class "md:w-1/2 p-5"}
          ($ accordion 
             {:title "What we do?" 
              :content "We are a community that loves technology and we want to share our knowledge with you!"})
          ($ accordion 
             {:title "How we do it?" 
              :content "We create custom contents that are easy to understand and we distribute them to the community!"})
          ($ accordion
             {:title "Why we do it?" 
              :content "We believe that technology is for everyone and we want to make it accessible to everyone!"})
          ($ accordion
             {:title "When we do it?" 
              :content "We are always creating new contents and we are always looking for new contributors!"})))

      ($ browser
         {:title "How can access?"
          :content "You can access our contents by visiting our website and browsing through the different categories!"})

      (d/div
        {:class "md:flex md:flex-row"}
        (d/div
          {:class "md:w-1/2 p-5"}
          (d/p
            {:class "py-3"}
            "You can try out our contents by visiting our website and browsing through the different categories. We have a wide range of resources available to help you learn more about programming, including tutorials, articles, and videos. Whether you're a beginner or an experienced developer, we have something for everyone!"))
        (d/div
          {:class "md:w-1/2 p-5"}
          (d/h2
            {:class "text-3xl font-bold"}
            "Contents")
          ($ content-list {})))) 

    ($ footer {})))
