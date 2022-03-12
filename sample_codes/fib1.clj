(defn fib1[n]
  (cond (= n 1) [1] 
    :else 
    (loop　[li [1 1]]
      (if (>= (count li) n) 
        li
        (let [[n1 n2] (reverse li)]
    (recur (conj li (+ n1 n2))))))))
  

 (println (fib1 1))

 (println (fib1 10))

(let [[n1 n2] [2 3]] ( println (+ n1 n2)))
