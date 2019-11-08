(ns semantic-ui-reagent.confirm
  (:require [reagent.core :as r]
            [semantic-ui-reagent.core :as c]))

(defn confirm []
  (let [state (r/atom {:open false})]
    (fn []
      [c/Grid
       [c/GridRow
        [c/Header {:as :h1} "Confirm"]]
       [c/GridRow
        [c/Button {:on-click #(swap! state update :open not)} "Show"]
        [c/Confirm {:open (:open @state)
                    :on-confirm #(swap! state assoc :open false :selection :confirm)
                    :on-cancel #(swap! state assoc :open false :selection :cancel)}]]])))
