(defproject laxam-clojure-tutorial-part2-spam-filter "0.1.0-SNAPSHOT"
  :description "Sample project for Laxam's clojure tutorial, part two"
  :url "http://utopian.io/@laxam"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot laxam-clojure-tutorial-part2-spam-filter.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
