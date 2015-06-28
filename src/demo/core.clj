(ns demo.core
  (:gen-class))

(defn -main [& args]
  (println (when true?
    (println "Success!")
    "abra cadabra")))


(def failed-protagonist-names
  ["Larry Potter"
   "Doreen the Explorer"
   "The Incredible Bulk"])