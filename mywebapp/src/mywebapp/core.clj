(ns mywebapp.core
  (:require [compojure.core :refer :all]
            [org.httpkit.server :refer [run-server]])) ; httpkit is a server

(defroutes myapp
  (GET "/" [] (fn [req] "Do something with req")))
(defn -main []
  (run-server mywebapp {:port 5000}))