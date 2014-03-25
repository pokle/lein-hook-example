(ns a-project.core
	(:require [pallet.stevedore :refer [script with-script-language]]
			  [pallet.stevedore.bash]))

(defn foo
  "I don't do a whole lot."
  [x]
  (with-script-language :pallet.stevedore.bash/bash
  (script
    ("ls"))))
