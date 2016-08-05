(ns live-client.core
  (:require
   [live-client.connection :as conn]
   [live-client.subscriptions :as sub]))

(defn enable! [live-endpoint-url & opts]
  (apply conn/connect! live-endpoint-url sub/on-msg sub/on-connected opts))
