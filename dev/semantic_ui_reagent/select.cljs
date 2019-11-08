(ns semantic-ui-reagent.select
  (:require [semantic-ui-reagent.core :as c]))

(defn select []
  [c/Grid
   [c/GridRow
    [c/Header {:as :h1} "Select"]]
   [c/GridRow
    [c/Select {:placeholder "Select your country"
               :options [{:key "at" :value "at" :flag "at" :text "Austria"}
                         {:key "fr" :value "fr" :flag "fr" :text "France"}
                         {:key "de" :value "de" :flag "de" :text "Germany"}
                         {:key "it" :value "it" :flag "it" :text "Italy"}
                         {:key "ch" :value "ch" :flag "ch" :text "Switzerland"}]}]]])