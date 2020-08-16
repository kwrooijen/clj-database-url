(defproject kwrooijen/clj-database-url "0.0.1"
  :description "DATABASE_URL to JDBC_DATABASE_URL converter"
  :url "https://github.com/kwrooijen/clj-database-url"
  :license {:name "MIT"}
  :dependencies []
  :plugins [[lein-cloverage "1.1.2"]
            [lein-codox "0.10.7"]
            [lein-ancient "0.6.15"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.10.1"]
                                  [orchestra "2020.07.12-1"]
                                  [codox-theme-rdash "0.1.2"]]}
             :test {:dependencies [[orchestra "2020.07.12-1"]]}}
  :deploy-repositories [["releases" :clojars]])
