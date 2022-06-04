(println "Hello World!")



(defn add [x y z] (+ x y z))
(println (add 3 4 5))



(defn fizzbuzz[n]
  (map 
    (fn [n] 
    (cond
      (= (mod n 15) 0) "FizzBuzz"
      (= (mod n 5) 0) "Fizz"
      (= (mod n 3) 0) "Buzz"
       :else n))
  (range 1 (inc n))
  )
)

(println (fizzbuzz 60))



