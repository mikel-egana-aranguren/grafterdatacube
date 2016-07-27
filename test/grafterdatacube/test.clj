(ns grafterdatacube.test
  (:require [clojure.test :refer :all]
            [grafterdatacube.core :refer :all])
  )

(deftest test-UDALARENIZENA 
  (testing "Value of UDALARENIZENA column for row 1 should be ATAUN"
           (is (= "ATAUN"
                  ; Not very idiomatic, I have to learn deconstructing properly!
                  (get
                    (nth
                      (:rows (convert-ataun-to-data "./data/ataun-2014-2015.csv"))
                      1)
                    "UDALARENIZENA")
                  )
               )
           )
  )

;(run-tests)


; -----------------------------------------------------

;(deftest test-fails
;  (testing "I fail."
;    (is (= 1 0))))

;(deftest test-passes
;  (testing "I pass."
;    (is (= 0 0))))
;
;(deftest add-x-to-y
;  (is (= 5 (add 2 3))))