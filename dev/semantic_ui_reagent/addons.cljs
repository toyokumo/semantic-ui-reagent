(ns semantic-ui-reagent.addons
  (:require [reagent.core :as r]
            [semantic-ui-reagent.core :as c]))

(defn Confirm []
  (let [state (r/atom {:open false})]
    (fn []
      [:div.examples
       [c/Header {:as :h2} "Confirm"]
       [:div.ex
        [c/Button {:on-click #(swap! state update :open not)} "Show"]
        [c/Confirm {:open (:open @state)
                    :on-confirm #(swap! state assoc :open false :selection :confirm)
                    :on-cancel #(swap! state assoc :open false :selection :cancel)}]]])))

(defn Radio []
  [:div.examples
   [c/Header {:as :h2} "Radio"]
   [:div.ex
    [c/Radio {:label "Make my profile visible"}]]
   [:div.ex
    [c/Radio {:toggle true}]]
   [:div.ex
    [c/Radio {:slider true}]]])

(defn Select []
  [:div.examples
   [c/Header {:as :h2} "Select"]
   [:div.ex
    [c/Select {:placeholder "Select your country"
               :options [{:key "at" :value "at" :flag "at" :text "Austria"}
                         {:key "fr" :value "fr" :flag "fr" :text "France"}
                         {:key "de" :value "de" :flag "de" :text "Germany"}
                         {:key "it" :value "it" :flag "it" :text "Italy"}
                         {:key "ch" :value "ch" :flag "ch" :text "Switzerland"}]}]]])

(defn TextArea []
  [:div.examples
   [c/Header {:as :h2} "TextArea"]
   [:div.ex
    [c/Form
     [c/TextArea {:placeholder "Tell us more"}]]]
   [:div.ex
    [c/Form
     [c/TextArea {:placeholder "Try adding multiple lines" :rows 3}]]]])
