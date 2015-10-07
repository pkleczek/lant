(ns lant.core-test
  (:require [clojure.test :refer :all]
            [lant.core :refer :all]))

(deftest ant-movement
  (testing "Ant is set :north by default"
    (is (= :north (:dir (make-ant)))))

  (testing "Ant can rotate left"
    (is (= :west (:dir (rotate-left (make-ant))))))

  (testing "Ant can rotate right"
    (is (= :east (:dir (rotate-right (make-ant))))))
)
