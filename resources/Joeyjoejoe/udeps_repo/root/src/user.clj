(ns user
  (:require [udeps.core :as udeps]
            [udeps.tools :as utools]))

;; Use defdep instead of defn enables users to export deps from
;; functions defined in the repl. #'udeps/defdep is identical to
;; #'clojure.core/defn except it add extra meta data to defined
;; function var which are used to generate deps files.
(def ^:macro defn #'utools/defdep)
