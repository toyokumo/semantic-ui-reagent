(ns semantic-ui-reagent.textarea
  (:require [semantic-ui-reagent.core :as c]))

(defn textarea []
  [c/Grid
   [c/GridRow
    [c/Header {:as :h1} "TextArea"]]
   [c/GridRow
    [c/Form
     [c/TextArea {:placeholder "Tell us more"}]]]
   [c/GridRow
    [c/Form
     [c/TextArea {:placeholder "Try adding multiple lines" :rows 3}]]]])

