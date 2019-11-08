(ns semantic-ui-reagent.collections
  (:require [reagent.core :as r]
            [semantic-ui-reagent.core :as c]))

(defn Breadcrumb []
  [:div.examples
   [c/Header {:as :h2} "Breadcrumb"]
   [:div.ex
    [c/Breadcrumb
     [c/BreadcrumbSection {:link true} "Home"]
     [c/BreadcrumbDivider {:icon "right angle"}]
     [c/BreadcrumbSection {:link true} "Store"]
     [c/BreadcrumbDivider {:icon "right angle"}]
     [c/BreadcrumbSection {:link true} "T-Shirt"]]]
   [:div.ex
    [c/Breadcrumb
     [c/BreadcrumbSection {:link true} "Home"]
     [c/BreadcrumbDivider "/"]
     [c/BreadcrumbSection {:link true} "Store"]
     [c/BreadcrumbDivider {:icon "right angle"}]
     [c/BreadcrumbSection {:active true} "Search for:" [:a {:href "#"} "paper towels"]]]]])

(defn Form []
  (let [state (r/atom {})]
    (fn []
      [:div.examples
       [c/Header {:as :h2} "Form"]
       [:div.ex
        [c/Form {:on-submit (fn [evt form]
                              (.preventDefault evt)
                              (reset! state (get (js->clj form) "formData")))}
         [c/FormGroup {:widths :equal}
          [c/FormInput {:label "Name" :name "name" :placeholder "Name"}]
          [c/FormSelect {:label "Gender" :name "Gender" :placeholder "Gender"
                         :options [{:key "m" :text "Male" :value "male"}
                                   {:key "f" :text "Female" :value "female"}]}]]
         [c/FormSelect {:label "Products" :name "products" :placeholder "Search..." :search true :multiple true
                        :options [{:key "hat" :text "Hat" :value "hat"}
                                  {:key "scarf" :text "Scarf" :value "scarf"}
                                  {:key "jacket" :text "Jacket" :value "jacket"}
                                  {:key "t_shirt" :text "T-Shirt" :value "t_shirt"}
                                  {:key "gloves" :text "Gloves" :value "gloves"}
                                  {:key "watch" :text "Watch" :value "watch"}
                                  {:key "belt" :text "Belt" :value "belt"}
                                  {:key "pants" :text "Pants" :value "pants"}
                                  {:key "shoes" :text "Shoes" :value "shoes"}
                                  {:key "socks" :text "Socks" :value "socks"}]}]
         [c/FormGroup {:widths 2}
          [c/FormField
           [:label "Plan"]
           [c/FormGroup {:inline true}
            [c/FormRadio {:label "A" :name "plan" :value "a"}]
            [c/FormRadio {:label "B" :name "plan" :value "a"}]
            [c/FormRadio {:label "C" :name "plan" :value "a"}]]]
          [c/FormField
           [:label "Shipping Options"]
           [c/FormGroup {:inline true}
            [c/FormCheckbox {:label "Expedite" :name "shippingOptions" :value "expedite"}]
            [c/FormCheckbox {:label "Gift Wrap" :name "shippingOptions" :value "giftWrap"}]
            [c/FormCheckbox {:label "C.O.D" :name "shippingOptions" :value "cod"}]]]]
         [c/FormTextArea {:name "details" :label "Details" :placeholder "Anything else we should know?" :rows 3}]
         [c/FormCheckbox {:name "terms" :label "I agree to the Terms and Conditions"}]
         [c/Button {:primary true :type :submit} "Submit"]]
        [:br]]])))

(defn Grid []
  [:div.examples
   [c/Header {:as :h2} "Grid"]
   [:div.ex
    [c/Grid
     (for [i (range 16)]
       ^{:key i}
       [c/GridColumn
        [c/Image {:src "http://semantic-ui.com/images/wireframe/image.png"}]])]]
   [:div.ex
    [:span.title "Divided"]
    [c/Grid {:columns 3 :divided true}
     [c/GridRow
      [c/GridColumn [c/Image {:src "http://semantic-ui.com/images/wireframe/media-paragraph.png"}]]
      [c/GridColumn [c/Image {:src "http://semantic-ui.com/images/wireframe/media-paragraph.png"}]]
      [c/GridColumn [c/Image {:src "http://semantic-ui.com/images/wireframe/media-paragraph.png"}]]]
     [c/GridRow
      [c/GridColumn [c/Image {:src "http://semantic-ui.com/images/wireframe/media-paragraph.png"}]]
      [c/GridColumn [c/Image {:src "http://semantic-ui.com/images/wireframe/media-paragraph.png"}]]
      [c/GridColumn [c/Image {:src "http://semantic-ui.com/images/wireframe/media-paragraph.png"}]]]]]
   [:div.ex
    [:span.title "Celled"]
    [c/Grid {:celled true}
     [c/GridRow
      [c/GridColumn {:width 3} [c/Image {:src "http://semantic-ui.com/images/wireframe/image.png"}]]
      [c/GridColumn {:width 13} [c/Image {:src "http://semantic-ui.com/images/wireframe/centered-paragraph.png"}]]]
     [c/GridRow
      [c/GridColumn {:width 3} [c/Image {:src "http://semantic-ui.com/images/wireframe/image.png"}]]
      [c/GridColumn {:width 10} [c/Image {:src "http://semantic-ui.com/images/wireframe/paragraph.png"}]]
      [c/GridColumn {:width 3} [c/Image {:src "http://semantic-ui.com/images/wireframe/image.png"}]]]]]])

(defn Menu-1 []
  (let [active-item (r/atom nil)]
    (fn []
      (let [handle-item-click (fn [_ data] (reset! active-item (aget data "name")))]
        [:div.examples
         [c/Header {:as :h2} "Menu 1"]
         [:div.ex
          [:span.title "Simple Menu"]
          [c/Menu
           [c/MenuItem {:name "editorials"
                        :active (= @active-item "editorials")
                        :on-click handle-item-click}]
           [c/MenuItem {:name "reviews"
                        :active (= @active-item "reviews")
                        :on-click handle-item-click}]
           [c/MenuItem {:name "upcomingEvents"
                        :active (= @active-item "upcomingEvents")
                        :on-click handle-item-click}]]]]))))

(defn Menu-2 []
  (let [active-item (r/atom nil)]
    (fn []
      (let [handle-item-click (fn [_ data] (reset! active-item (aget data "name")))]
        [:div.examples
         [c/Header {:as :h2} "Menu 2"]
         [:div.ex
          [:span.title "Menu Tabular"]
          [c/Menu {:tabular true}
           [c/MenuItem {:name "bio"
                        :active (= @active-item "bio")
                        :on-click handle-item-click}]
           [c/MenuItem {:name "photos"
                        :active (= @active-item "photos")
                        :on-click handle-item-click}]]]]))))

(defn Menu-3 []
  (let [active-item (r/atom nil)]
    (fn []
      (let [handle-item-click (fn [_ data] (reset! active-item (aget data "name")))]
        [:div.examples
         [c/Header {:as :h2} "Menu 3"]
         [:div.ex
          [:span.title "Menu Vertical"]
          [c/Menu {:vertical true}
           [c/MenuItem {:name "inbox"
                        :active (= @active-item "inbox")
                        :on-click handle-item-click}
            [c/Label {:color :teal} "1"]
            "Inbox"]
           [c/MenuItem {:name "spam"
                        :active (= @active-item "spam")
                        :on-click handle-item-click}
            [c/Label "51"]
            "Spam"]
           [c/MenuItem {:name "updates"
                        :active (= @active-item "updates")
                        :on-click handle-item-click}
            [c/Label "1"]
            "Updates"]
           [c/MenuItem
            [c/Input {:icon "search" :placeholder "Search mail..."}]]]]]))))

(defn Message []
  [:div.examples
   [c/Header {:as :h2} "Message"]
   [:div.ex
    [c/Message
     [c/MessageHeader "Changes in Service"]
     [:p "We updated our privacy policy here to better service our customers. We recommend reviewing the changes."]]]
   [:div.ex
    [c/Message {:icon true}
     [c/Icon {:name "circle notched" :loading true}]
     [c/MessageContent
      [c/MessageHeader "Just one second"]
      "We are fetching that content for you."]]]
   [:div.ex
    [c/Message {:error true :header "There was some errors with your submission"
                :list ["You must include both a upper and lower case letters in your password."
                       "You need to select your home country."]}]]])

(defn Table []
  [:div.examples
   [c/Header {:as :h2} "Table"]
   [:div.ex
    [c/Table {:celled true :padded true}
     [c/TableHeader
      [c/TableRow
       [c/TableHeaderCell {:single-line true} "Evidence Rating"]
       [c/TableHeaderCell "Effect"]
       [c/TableHeaderCell "Efficacy"]
       [c/TableHeaderCell "Consensus"]
       [c/TableHeaderCell "Comments"]]]
     [c/TableBody
      [c/TableRow
       [c/TableCell [c/Header {:as :h2 :text-align :center} "A"]]
       [c/TableCell {:single-line true} "Power Output"]
       [c/TableCell [c/Rating {:icon :star :default-rating 3 :max-rating 3}]]
       [c/TableCell {:text-align :right} "80%" [:br] [:a {:href "#"} "18 studies"]]
       [c/TableCell "Creatine supplementation is the reference compound for increasing muscular creatine levels; there is\nvariability in this increase, however, with some nonresponders."]]
      [c/TableRow
       [c/TableCell [c/Header {:as :h2 :text-align :center} "A"]]
       [c/TableCell {:single-line true} "Weight"]
       [c/TableCell [c/Rating {:icon :star :default-rating 2 :max-rating 3}]]
       [c/TableCell {:text-align :right} "100%" [:br] [:a {:href "#"} "65 studies"]]
       [c/TableCell "Creatine is the reference compound for power improvement, with numbers from one meta-analysis to assess\npotency"]]]]]
   [:div.ex
    [c/Table {:compact true :celled true :definition true}
     [c/TableHeader
      [c/TableRow
       [c/TableHeaderCell]
       [c/TableHeaderCell "Name"]
       [c/TableHeaderCell "Registration Date"]
       [c/TableHeaderCell "E-mail address"]
       [c/TableHeaderCell "Premium Plan"]]]
     [c/TableBody
      [c/TableRow
       [c/TableCell {:collapsing true} [c/Checkbox {:slider true}]]
       [c/TableCell "John Lilki"]
       [c/TableCell "September 14, 2013"]
       [c/TableCell "jhlilk22@yahoo.com"]
       [c/TableCell "No"]]
      [c/TableRow
       [c/TableCell {:collapsing true} [c/Checkbox {:slider true}]]
       [c/TableCell "Jamie Harington"]
       [c/TableCell "January 11, 2014"]
       [c/TableCell "jamieharingonton@yahoo.com"]
       [c/TableCell "Yes"]]
      [c/TableRow
       [c/TableCell {:collapsing true} [c/Checkbox {:slider true}]]
       [c/TableCell "Jill Lewis"]
       [c/TableCell "May 11, 2014"]
       [c/TableCell "jilsewris22@yahoo.com"]
       [c/TableCell "Yes"]]]
     [c/TableFooter {:full-width true}
      [c/TableRow
       [c/TableHeaderCell]
       [c/TableHeaderCell {:col-span 4}
        [c/Button {:floated :right :icon true :label-position :left
                   :primary true :size :small}
         [c/Icon {:name "user"}] "Add User"]
        [c/Button {:size :small} "Approve"]
        [c/Button {:disabled true :size :small} "Approve All"]]]]]]])
