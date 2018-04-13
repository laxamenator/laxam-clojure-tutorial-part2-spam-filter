(ns laxam-clojure-tutorial-part2-spam-filter.core
  (:require [clojure.string :as str])
  (:gen-class))

(def spam-word "ICO")

(def messages
  '("Hi, it's me, Ronald. Let's go bowling?"
    "@richhickey approved your Pull Request."
    "New promising startup works on a perpetual motion machine. Participate in ICO now!"
    "Hi, it's Greg, are you up for a beer tonight?"))

(defn spam?
  "Takes one message as an argument and returns true if it is spam, otherwise false"
  [message]
  (contains? (set (str/split message #"\W+")) spam-word))

(defn -main
  [& args]
  (doall (map println (remove spam? messages))))
