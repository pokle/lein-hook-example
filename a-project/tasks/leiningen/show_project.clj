(ns leiningen.show-project
	"Shows you the project - an example of a lein task in your project"
	(:use [clojure.pprint :only (pprint)]))

(defn show-project [project & args]
	"Shows you the project"
	(pprint project))