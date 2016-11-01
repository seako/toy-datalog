(ns toy-datalog.core
  (require [instaparse.core :as i]))

;; Grammar from https://docs.racket-lang.org/datalog/datalog.html
(def parse
  (i/parser (clojure.java.io/resource "datalog.bnf"), :output-format :hiccup))
