(ns demo.core
  (:gen-class))

(def failed-protagonist-names
  ["Larry Potter"
   "Doreen the Explorer"
   "The Incredible Bulk"])

(defn -main [& args]
  (println (get failed-protagonist-names 1)))