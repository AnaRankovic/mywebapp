(ns mywebapp.core
  (:require [compojure.core :refer :all]
            [org.httpkit.server :refer [run-server]])) ; httpkit is a server

(defroutes myapp
  (GET "/" [] "Cao svete!"))

(defn -main []
  (run-server myapp {:port 5000}))