(ns grafterdatacube.test

  (:require [clojure.test :refer :all]
            [grafterdatacube.core :refer :all])
  )

;(deftest test-fails
;  (testing "I fail."
;    (is (= 1 0))))

(deftest test-passes
  (testing "I pass."
    (is (= 0 0))))

(deftest add-x-to-y
  (is (= 5 (add 2 3))))

(run-tests)