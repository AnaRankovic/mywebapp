(ns mywebapp.core
  (:require [compojure.core :refer :all]
            [hiccup.core :as hiccup]
            [ring.adapter.jetty :as jetty]))

(defroutes myapp
  (GET "/hello/:name" [name]
    (hiccup/html
      [:html
        [:body
          [:h1 {:class "title"}
            (str "Hello " name)]]])))

(defn -main []
  (jetty/run-jetty
    (fn [req] {:status 200 :body "Hello World"})
    {:port 5000}))