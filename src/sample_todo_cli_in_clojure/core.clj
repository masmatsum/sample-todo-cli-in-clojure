(ns sample-todo-cli-in-clojure.core
  (:gen-class))

(def usage
  "Usage:
  - add {task-name}
  - list
  - finish {item-id}
  - unfinish {item-id}")

(defn add-todo
  [[task-name]]
  ;; TODO:
  (println (str "Added task \"" task-name "\".")))

;; TODO:
(defn list-todo
  [arg-list])

;; TODO:
(defn finish-todo
  [arg-list])

;; TODO:
(defn unfinish-todo
  [arg-list])

(defn -main
  [& args]
  (let [[subcommand & arg-list] args]
    (case subcommand
      "add" (add-todo arg-list)
      "list" (list-todo arg-list)
      "finish" (finish-todo arg-list)
      "unfinish" (unfinish-todo arg-list)
      nil (do
            (println "Please specify subcommand.")
            (println usage))
      (do
        (println (str "Invalid subcommand: " subcommand))
        (println usage)))))
