(ns lant.core)

;positions with following position for left and right side of an ant
(def dirs {:north [:west :east]
           :east [:north :south] 
           :south [:east :west] 
           :west [:south :north]})

(def dir-vector {:north [0 -1] :east [1 0] :south [0 1] :west [-1 0]})

(defn make-ant 
  ([] {:pos [0 0] :dir :north})
  ([x y dir] {:pos [x y] :dir dir}))

(defn- rotate
  [{[x y] :pos dir :dir} idx]
  (make-ant x y ((dir dirs) idx)))

(defn rotate-left
  [ant] (rotate ant 0))

(defn rotate-right
  [ant] (rotate ant 1))

(defn forward
  [{[x y] :pos dir :dir}]
  (let [movement (dir-vector dir)
        new-pos (mapv + [x y] movement)]
    (make-ant (new-pos 0) (new-pos 1) dir)))
