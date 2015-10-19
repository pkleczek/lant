(ns lant.core-test
  (:require [clojure.test :refer :all]
            [lant.core :refer :all]))

(deftest ant-movement
  (testing "Ant is set :north by default in (0,0)"
    (is (= {:pos [0 0] :dir :north} (make-ant))))

  (testing "Ant can rotate left"
    (is (= (make-ant 0 0 :west) (rotate-left (make-ant)))))

  (testing "Ant can rotate right"
    (is (= (make-ant 0 0 :east) (rotate-right (make-ant)))))

  (testing "Ant can go forward"
    (is (= (make-ant 3 4 :west)(forward (make-ant 4 4 :west)))))
)
