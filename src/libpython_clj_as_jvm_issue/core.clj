(ns libpython-clj-as-jvm-issue.core
  (:require [libpython-clj2.python :as py]
            [cheshire.core :as json])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (py/initialize!)
  (py/import-as "simple" simple)
  ;; this one works
  (println "Just something interesting from Python:"
           (-> (py/py. simple a_map)
               py/as-jvm
               json/generate-string))
  ;; below two don't
  (println "Just something interesting from Python:"
           (-> (py/py. simple a_list)
               py/as-list
               json/generate-string))
  (println "Just something interesting from Python:"
           (-> (py/py. simple a_list)
               py/as-jvm
               json/generate-string)))
