(ns lant.core)

(def dirs {:north [:west :east]
           :east [:north :south] 
           :south [:east :west] 
           :west [:south :north]})

(def dir-vector {:north [0 1] :east [1 0] :south [0 -1] :west [-1 0]})

(defn make-ant 
  ([] {:pos [0 0] :dir :north})
  ([x y dir] {:pos [x y] :dir dir}))

(defn rotate-left
  [ant] (rotate ant 0))

(defn rotate-right
  [ant] (rotate ant 1))

(defn- rotate
  [{{x :x y :y} :pos dir :dir} idx]
  (make-ant x y ((dir dirs) idx)))
