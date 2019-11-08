(ns semantic-ui-reagent.radio
  (:require [semantic-ui-reagent.core :as c]))

(defn radio []
  [c/Grid
   [c/GridRow
    [c/Header {:as :h1} "Radio"]]
   [c/GridRow
    [c/Radio {:label "Make my profile visible"}]]
   [c/GridRow
    [c/Radio {:toggle true}]]
   [c/GridRow
    [c/Radio {:slider true}]]])
