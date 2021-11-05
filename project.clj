(defproject toyokumo/semantic-ui-reagent "0.2.0-SNAPSHOT"
  :description "A ClojureScript library for using Semantic UI React with Reagent on shadow-cljs."
  :url "https://github.com/toyokumo/semantic-ui-reagent"
  :license {:name "Apache, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :deploy-repositories [["releases" {:url "https://repo.clojars.org" :creds :gpg}]
                        ["snapshots" :clojars]]
  :source-paths ["src"]
  :dependencies [[reagent "1.1.0"]])
