(ns camp.lambda.utils.macros
  (:require [clojure.java.io :as io]))

(defmacro inline-resource [resource-path]
  (slurp (io/resource resource-path)))
