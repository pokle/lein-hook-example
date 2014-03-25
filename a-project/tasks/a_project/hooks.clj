(ns a-project.hooks
  (:require [robert.hooke]
  			[leiningen.a-plugin]))

(defn mess-up-dist [f project]
     (println "Just before dist")
     (f project)
     (println "Just after dist")
     )

(defn activate []
  (robert.hooke/add-hook #'leiningen.a-plugin/dist
                         #'mess-up-dist))