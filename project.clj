(defproject carmine-demo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [com.taoensso/carmine "2.6.2"]]
  :main ^:skip-aot carmine-demo.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
