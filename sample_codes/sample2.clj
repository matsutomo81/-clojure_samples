;intに変換
(defn parse-int [s]
  (Integer. (re-find #"[0-9]*" s)))

;各桁の和を計算する
(defn total-sum[s]
  (loop [i 0 total 0] 
    (cond
      (= i 5) total
      :else 
        (recur (inc i) (+ total (Integer/parseInt (subs s i (inc i)))))
    )  
  )
)

(println(total-sum "12345"))

(println(string? "12345"))

(println(string? "1"))


;# Fibonacci Numbers

(defn fib [n]
  (cond
  (= n 1) [1]
  :else
  (loop [fib_seq [1 1]]
    (if (>= (count fib_seq) n)
      fib_seq
      (let [[n1 n2] fib_seq]
        (recur (conj fib_seq (+ n1 n2))))))))
        
(println (fib 10))
