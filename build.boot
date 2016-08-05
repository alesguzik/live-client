#!/usr/bin/env boot

(println "Setting initial env.")
(set-env! :resource-paths #{"src"})

(println "Loading tasks.")
(require '[live-client.build.tasks :refer :all])

(println "Loading tasks complete.\n")
