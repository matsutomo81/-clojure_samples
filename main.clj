;https://atcoder.jp/contests/abc081/tasks/abc081_a
(defn count_1 [s] (count (filter #(= \1 %) s)))

(println(count_1 "101"))

;false
(println (= "1" \1))

;true
(println (char? \1))

;true
(println (string? "1"))
