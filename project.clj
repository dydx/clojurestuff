(defproject demo "0.1.0-SNAPSHOT"
  :description "demo app with leinengin"
  :url "https://github.com/dydx/clojurestuff"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot demo.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
