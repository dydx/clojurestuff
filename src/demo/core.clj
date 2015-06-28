(ns demo.core
  (:gen-class))

(defn -main [& args]
  (println (if true
    (do (println "Success!")
      "abra cadabra")
    (do (println "Failure :(")
      "hocus pocus"))))

; => Success!
; => abra cadabra