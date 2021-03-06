(ns re-posh.db
  (:require [posh.reagent :as p]))

;; Basic store. This atom stores another atom
;; @store - datascript connection
;; @@store - datascript database
(def store (atom nil))

(defn connect!
  "Connect DataScript store to the re-frame event system"
  [conn]
  (p/posh! conn)
  (reset! store conn))
