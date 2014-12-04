(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot!"))

(defn params
  ([x]
   (str "I take one param: " x " is it a string?"))
  ([x y]
   (str "I take two params: " x y " are they strings?")))

(defn tell-x-y
  [{x :x y :y}]
  (list x y))
