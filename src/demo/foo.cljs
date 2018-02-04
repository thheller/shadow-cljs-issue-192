(ns demo.foo
  (:require ["path" :as path]
            ["fs" :as fs]
            ["md5" :as md5]))

(defn start! []
  "start")

(defn stop! []
  "stop")

(defn ^:export main [name]
  (str "hi" name))

(js/console.log fs)
;; => undefined
(js/console.log md5)
;; => undefined
