(defproject docker-lein-issue "0.1.0-SNAPSHOT"
  :description ""
  :url "TODO"
  :license {:name "GNU Affero General Public Licence"
            :url "http://www.gnu.org/licenses/agpl-3.0.en.html"}
  :main com.kaborso.blackjack
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.stuartsierra/component "0.3.2"]]
  :profiles {:dev
              {:dependencies [[org.clojure/tools.namespace "0.2.11"]
                              [com.stuartsierra/component.repl "0.2.0"]]
               :source-paths ["dev"]}})
