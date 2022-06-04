;https://atcoder.jp/contests/abc081/tasks/abc081_a
(defn odd_or_even [a b]
  (if (even? (* a b)) "Even" "Odd"))
(println (odd_or_even 3 1))


;https://atcoder.jp/contests/abc081/tasks/abc081_a
(defn count_1 [s] (count (filter #(= \1 %) s)))

(println(count_1 "101"))

;false
;char型とstring型の違い
(println (= "1" \1))

;true
(println (char? \1))

;true
(println (string? "1"))

