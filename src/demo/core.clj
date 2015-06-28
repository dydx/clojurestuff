(ns demo.core
  (:gen-class))

(defn -main [& args]
  (if true
    (do (println "Success!")
      "abra cadabra")
    (do (println "Failure :(")
      "hocus pocus")))