(ns toy-datalog.core
  (require [instaparse.core :as i]))

;; Grammar from https://docs.racket-lang.org/datalog/datalog.html
(def parse
  (i/parser (clojure.java.io/resource "datalog.bnf"), :output-format :hiccup))

(def test-program
  "edge(a, b). edge(b, c). edge(c, d). edge(d, a).
   path(X, Y) :- edge(X, Y).
   path(X, Y) :- edge(X, Z), path(Z, Y).
   path(X, Y)?")
