(ns grafterdatacube.transform
  (:require 
    [clojure.string :as st]
    [grafterdatacube.prefix :refer [base-id base-graph base-vocab base-data base-domain]]
    )
  )

;;; You can specify transformation functions in this namespace for use
;;; within the pipeline.

(defn ->integer
  "An example transformation function that converts a string to an integer"
  [s]
  (Integer/parseInt s))

(defn urlify [sr] 
  (st/replace (st/trim sr) #"\(|\)|\s|\/|\." "-"))

(defn observation-uri [a b c d e] 
  (base-id 
    (str "Observation/" (urlify 
                         (str a "-" b "-" c "-" d "-" e)
                               )
         )
    )
  )

(def base-observation-location (base-domain "/property/observation_location"))

(def base-emakume-kopurua (base-domain "/property/emakume_kopurua"))

(def base-gizon-kopurua (base-domain "/property/gizon_kopurua"))
