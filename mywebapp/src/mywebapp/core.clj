(ns mywebapp.core
    (:require [compojure.core :refer :all]
            [org.httpkit.server :refer [run-server]]))

(defn myapp
  "Ispuje se html sadrzaj web stanice"
  []
  (println(slurp "http://clojure-doc.org/articles/content.html#tutorials-and-cookbooks")))

(defn -main []
(run-server myapp)) 
