(ns demo.core
  (:gen-class))

(defn -main [& args]
  (println (when true?
    (println "Success!")
    "abra cadabra")))

; => Success!
; => abra cadabra