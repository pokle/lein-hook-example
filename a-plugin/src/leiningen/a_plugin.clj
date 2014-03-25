(ns leiningen.a-plugin
  (:use [clojure.java.io]
        [leiningen.clean :only (clean)]
        [leiningen.uberjar :only (uberjar)]))

(defn make-directories-in [base & children]
		(doseq [child children] 
      (.mkdirs (file base child))))
		
(defn dist [project]
  "Creates the distribution dir - target/dist - that will be packaged up"
  (let [uberjar-file (file (uberjar project))
        dist-dir (file (:target-path project) "dist")]
    (make-directories-in dist-dir "bin" "lib" "conf" "logs")
    (copy uberjar-file (file dist-dir "lib" "application.jar"))))

(defn package [project]
  "Packages up the target/dist dir")

(defn a-plugin
  "Publishes your application"
  [project & args]

  (clean project)
  (dist project)
  (package project))