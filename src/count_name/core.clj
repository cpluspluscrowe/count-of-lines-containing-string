(ns count-name.core
  (:require [clojure.java.io :as io])
  (:require [clojure.string :as string])
  (:gen-class))

(defn get-text []
  (slurp "/home/ccrowe/Documents/github/count-name/src/count_name/file.txt"))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [text (get-text)
        lines (string/split text #"\n")
        with-name (filter #(string/includes? % "name") lines)]
    (println (count with-name))

    ))

