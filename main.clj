(println "お久")



(defn fizzbuzz1 [x] 
  (filter (fn [n] (not=
    (cond
      (= (mod n 15) 0) "fizzbuzz"
      (= (mod n 5) 0) "fizz"
      (= (mod n 3) 0) "buzz"
      :else n) "fizz")) 
  (range 1 (inc x))
  )
)
(println (fizzbuzz1 15))

(defn output_prime [x] 
(filter
(fn [m]
  (let [li
  (map 
    (fn[n]
    (mod m n))
  (range 2 m)
)]
(if (not-any? zero? li) true false)))
(range 2 (inc x))))
          

(println (output_prime 100)) 
(assert (= '(2 3 5 7) (output_prime 10)))


(defn solve_quad_ex [a b c]
  (let [l (- (* b b) (* 4 a c))]
    (cond
      (< l 0) false
      (= l 0) [(/ (+ (* -1 b) (Math/pow l 0.5) ) (* 2 a))]
      :else 
      (let 
        [x1 (/ (+ (* -1 b) (Math/pow l 0.5) ) (* 2 a))
         x2 (/ (- (* -1 b) (Math/pow l 0.5) ) (* 2 a))]
      [x1 x2]
      )
    )
  )
)

(println (solve_quad_ex 1 2 1))


(defn count_1 [s] (count (filter (fn [n] (= \1 n)) s)))
(println(count_1 "101001"))

(defn divisible[a b] (if (= 0 (mod a b)) true (mod a b)))
(println (divisible 5 4))


(dotimes [i 3](println "hello"))

(dotimes [x 8]
  (print x)
  (dotimes [y x] (print (get (vec "Clojure") y))) 
  (newline)
)
(println "aaaa")

(doseq [a [1 2] b [3 4]] (println a b))

(doseq [a [1 2 5]] (println (- a 1)))

(dotimes [i 3](println (- 10 i)))

(println (take 5 (repeat "x")))

(defn sample1[n]
  (case n
    1 (str "n is " n)
    2 (str "n is " n)
    "n is other"
  ))

(println (reduce + (range 10)))
(println (reduce * (range 1 5)))

(println (filter (fn [n] (not= n 8)) (range 20) ))

