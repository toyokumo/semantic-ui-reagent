(ns semantic-ui-reagent.elements
  (:refer-clojure :exclude [List])
  (:require [reagent.core :as r]
            [semantic-ui-reagent.core :as c]))

(defn Button []
  [:div.examples
   [c/Header {:as :h2} "Button"]
   [:div.ex
    [c/Button "Click here"]]
   [:div.ex
    [c/Button {:primary true} "Primary"]
    [c/Button {:secondary true} "Secondary"]]
   [:div.ex
    [c/Button {:animated true}
     [c/ButtonContent {:visible true} "Next"]
     [c/ButtonContent {:hidden true} "Previous"]]
    [c/Button {:animated :fade}
     [c/ButtonContent {:visible true} "Sign-up for a Pro account"]
     [c/ButtonContent {:hidden true} "$12.99 a month"]]]
   [:div.ex
    [c/Button {:content "Pause"
               :icon :pause
               :label-position :left}]
    [c/Button {:content "Next"
               :icon "right arrow"
               :label-position :right}]]
   [:div.ex
    [c/ButtonGroup
     [c/Button {:icon "align left"}]
     [c/Button {:icon "align center"}]
     [c/Button {:icon "align right"}]
     [c/Button {:icon "align justify"}]]
    " "
    [c/ButtonGroup
     [c/Button {:icon :bold}]
     [c/Button {:icon :underline}]
     [c/Button {:icon "text width"}]]]
   [:div.ex
    [c/ButtonGroup
     [c/Button "Cancel"]
     [c/ButtonOr]
     [c/Button {:positive true} "Save"]]]
   [:div.ex
    [c/Button {:color :red :content "Like" :icon :heart
               :label (r/as-element [c/Label {:basic true :color :red :pointing :left :content "2,048"}])}]]])

(defn Container []
  [:div.examples
   [c/Header {:as :h2} "Contaner"]
   [:div.ex
    [c/Container
     [:p "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa strong. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede link mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi."]]]
   [:div.ex
    [c/Container {:text true}
     [c/Header {:as :h2} "Header"]
     [:p "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa strong. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede link mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi."]
     [:p "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa strong. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede link mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi."]]]
   [:div.ex
    [c/Container {:fluid true}
     [c/Header {:as :h2} "Dogs Roles with Humans"]
     [:p "Domestic dogs inherited complex behaviors, such as bite inhibition, from their wolf ancestors, which would have been pack hunters with complex body language. These sophisticated forms of social cognition and communication may account for their trainability, playfulness, and ability to fit into human households and social situations, and these attributes have given dogs a relationship with humans that has enabled them to become one of the most successful species on the planet today."]
     [:p "The dogs' value to early human hunter-gatherers led to them quickly becoming ubiquitous across world cultures. Dogs perform many roles for people, such as hunting, herding, pulling loads, protection, assisting police and military, companionship, and, more recently, aiding handicapped individuals. This impact on human society has given them the nickname \"man's best friend\" in the Western world. In some cultures, however, dogs are also a source of meat."]]]])

(defn Divider []
  [:div.examples
   [c/Header {:as :h2} "Divider"]
   [:div.ex
    [c/Divider]]
   [:div.ex
    [c/Segment
     [c/Grid {:columns 2 :relaxed :very}
      [c/GridColumn
       [:p "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec odio."]]
      [c/GridColumn
       [:p "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec odio."]]]
     [c/Divider {:vertical true} "And"]]]
   [:div.ex
    [c/Segment {:placeholder true}
     [c/Grid {:columns 2 :relaxed :very :stackable true}
      [c/GridColumn
       [c/Form
        [c/FormInput {:icon :user :icon-position :left
                      :label "Username" :placeholder "Usename"}]
        [c/FormInput {:icon :lock :icon-position :left
                      :label "Password" :type :password}]
        [c/Button {:content "Login" :primary true}]]]
      [c/GridColumn {:vertical-align :middle}
       [c/Button {:content "Sign up" :icon :signup :size :big}]]]
     [c/Divider {:vertical true} "Or"]]]])

(defn Flag []
  [:div.examples
   [c/Header {:as :h2} "Flag"]
   [:div.ex
    [c/Segment
     [c/Flag {:name :ae}]
     [c/Flag {:name :france}]
     [c/Flag {:name "myanmar"}]]]])

(defn Header []
  [:div.examples
   [c/Header {:as :h2} "Header"]
   [:div.ex
    [c/Header {:as :h1} "First Header"]
    [c/Header {:as "h2"} "Second Header"]
    [c/Header {:as :h3} "Third Header"]
    [c/Header {:as :h4} "Forth Header"]
    [c/Header {:as "h5"} "Fifth Header"]
    [c/Header {:as :h6} "Sixth Header"]]
   [:div.ex
    [c/Header {:as :h2
               :icon true
               :text-align :center}
     [c/Icon {:name "users" :circular true}]
     [c/HeaderContent
      "Friends"]
     [c/Image {:centered true
               :size :large
               :src "http://semantic-ui.com/images/wireframe/centered-paragraph.png"}]]]
   [:div.ex
    [c/Header {:sub true} "Price"]
    [:span "$10.99"]]
   [:div.ex
    [c/Header {:as :h2}
     [c/Image {:shape :circular
               :src "http://semantic-ui.com/images/avatar2/large/patrick.png"}]]]
   [:div.ex
    [c/IconGroup {:size :huge}
     [c/Icon {:size :big :color :red :name "dont"}]
     [c/Icon {:color :black :name "user"}]]
    [c/IconGroup {:size :huge}
     [c/Icon {:loading true :size :big :name "sun"}]
     [c/Icon {:name "user"}]]]])

(defn Icon []
  [:div.examples
   [c/Header {:as :h2} "Icon"]
   [:div.ex
    [c/Icon {:disabled true :name "users"}]]
   [:div.ex
    [c/Icon {:loading true :name "spinner"}]
    [c/Icon {:loading true :name "certificate"}]
    [c/Icon {:loading true :name "asterisk"}]]])

(defn Image []
  [:div.examples
   [c/Header {:as :h2} "Image"]
   [:div.ex
    [c/Image {:size :small
              :src "https://react.semantic-ui.com/images/wireframe/image.png"}]]
   [:div.ex
    [c/Image {:size :medium
              :rounded true
              :src "https://react.semantic-ui.com/images/wireframe/image.png"}]]])

(defn Input []
  [:div.examples
   [c/Header {:as :h2} "Input"]
   [:div.ex
    [c/Input {:focus true :placeholder "Search..."}]]
   [:div.ex
    [c/Input {:loading true :icon "user" :placeholder "Search..."}]]
   [:div.ex
    [c/Input {:disabled true :placeholder "Search..."}]]
   [:div.ex
    [c/Input {:error true :placeholder "Search..."}]]
   [:div.ex
    [c/Input {:icon "users" :icon-position :left :placeholder "Searching..."}]]
   [:div.ex
    [c/Input {:icon (r/as-element [c/Icon {:name "search" :inverted true :circular true :link true}])
              :placeholder "Search..."}]]
   [:div.ex
    [c/Input {:label "http://" :placeholder "mysite.com"}]]
   [:div.ex
    [c/Input {:label (r/as-element
                      [c/Dropdown {:defaultValue ".com"
                                   :options [{:key ".com" :text ".com" :value ".com"}
                                             {:key ".net" :text ".net" :value ".net"}
                                             {:key ".org" :text ".org" :value ".org"}]}])
              :label-position :right
              :placeholder "Find domain"}]]
   [:div.ex
    [c/Input {:label (r/as-element [c/Label {:icon "asterisk"}])
              :label-position "right corner"
              :placeholder "Search..."}]]])

(defn Label []
  [:div.examples
   [c/Header {:as :h2} "Label"]
   [:div.ex
    [c/Label
     [c/Icon {:name "mail"}] "23"]]
   [:div.ex
    [c/Label {:as :a :image true}
     [:img {:src "http://semantic-ui.com/images/avatar/small/joe.jpg"}] "Joe"]
    [c/Label {:as :a :image true}
     [:img {:src "http://semantic-ui.com/images/avatar/small/elliot.jpg"}] "Elliot"]
    [c/Label {:as :a :image true}
     [:img {:src "http://semantic-ui.com/images/avatar/small/stevie.jpg"}] "Stevie"]]
   [:div.ex
    [c/Label {:as :a :color :blue :image true}
     [:img {:src "http://semantic-ui.com/images/avatar/small/veronika.jpg"}] "Veronika"
     [c/LabelDetail "Friend"]]
    [c/Label {:as :a :color :teal :image true}
     [:img {:src "http://semantic-ui.com/images/avatar/small/jenny.jpg"}] "Veronika"
     [c/LabelDetail "Friend"]]
    [c/Label {:as :a :color :yellow :image true}
     [:img {:src "http://semantic-ui.com/images/avatar/small/christian.jpg"}] "Helen"
     [c/LabelDetail "Co-worker"]]]
   [:div.ex
    [c/Label {:image true}
     [:img {:src "http://semantic-ui.com/images/avatar/small/ade.jpg"}] "Adrienne"
     [c/Icon {:name "delete"}]]
    [c/Label {:image true}
     [:img {:src "http://semantic-ui.com/images/avatar/small/zoe.jpg"}] "Zoe"
     [c/Icon {:name "delete"}]]
    [c/Label {:image true}
     [:img {:src "http://semantic-ui.com/images/avatar/small/nan.jpg"}] "Nan"
     [c/Icon {:name "delete"}]]]
   [:div.ex
    [c/Form
     [c/FormField
      [:input {:type "text" :placeholder "First name"}]
      [c/Label {:pointing true} "Please enter a value"]]
     [c/Divider]
     [c/FormField
      [c/Label {:pointing :below} "Please enter a value"]
      [:input {:type "text" :placeholder "Last Name"}]]
     [c/Divider]
     [c/FormField {:inline true}
      [:input {:type "text" :placeholder "Username"}]
      [c/Label {:pointing :left} "That name is taken!"]]
     [c/Divider]
     [c/FormField {:inline true}
      [c/Label {:pointing :right} "Your password must be 6 character or more"]
      [:input {:type "password" :placeholder "Password"}]]]]
   [:div.ex
    [c/Form
     [c/FormField
      [:input {:type "text" :placeholder "First name"}]
      [c/Label {:basic true :color :red :pointing true} "Please enter a value"]]]]
   [:div.ex
    [c/Image {:src "http://semantic-ui.com/images/avatar2/small/patrick.png"
              :label (r/as-element [c/Label {:as :a
                                             :color :red
                                             :corner :right
                                             :icon "heart"}])}]]
   [:div.ex
    [c/List {:divided true :selection true}
     [c/ListItem
      [c/Label {:color :red :horizontal true} "Fruit"] "Kumquats"]
     [c/ListItem
      [c/Label {:color :purple :horizontal true} "Candy"] "Ice Cream"]
     [c/ListItem
      [c/Label {:color :red :horizontal true} "Fruit"] "Orange"]
     [c/ListItem
      [c/Label {:horizontal true} "Dog"] "Poodle"]]]])


(defn List []
  [:div.examples
   [c/Header {:as :h2} "List"]
   [:div.ex
    [c/List
     [c/ListItem "Apples"]
     [c/ListItem "Pears"]
     [c/ListItem "Oranges"]]]
   [:div.ex
    [c/List
     [c/ListItem
      [c/ListIcon {:name "user"}]
      [c/ListContent "Semantic UI"]]
     [c/ListItem
      [c/ListIcon {:name "marker"}]
      [c/ListContent "New York, NY"]]
     [c/ListItem
      [c/ListIcon {:name :mail}]
      [c/ListContent
       [:a {:href "mailto:jack@semantic-ui.com"} "jack@semantic-ui.com"]]]
     [c/ListItem
      [c/ListIcon {:name "linkify"}]
      [c/ListContent
       [:a {:href "http://www.semantic-ui.com"} "semantic-ui.com"]]]]]])

(defn Loader []
  [:div.examples
   [c/Header {:as :h2} "Loader"]
   [:div.ex
    [c/Segment
     [c/Dimmer {:active true}
      [c/Loader]]
     [c/Image {:src "http://semantic-ui.com/images/wireframe/short-paragraph.png"}]]]
   [:div.ex
    [c/Segment
     [c/Dimmer {:active true}
      [c/Loader "Loading"]]
     [c/Image {:src "http://semantic-ui.com/images/wireframe/short-paragraph.png"}]]
    [c/Segment
     [c/Dimmer {:active true :inverted true}
      [c/Loader {:inverted true} "Loading"]]
     [c/Image {:src "http://semantic-ui.com/images/wireframe/short-paragraph.png"}]]]
   [:div.ex
    [c/Segment
     [c/Dimmer {:active true}
      [c/Loader {:indeterminate true} "Preparing Files"]]
     [c/Image {:src "http://semantic-ui.com/images/wireframe/short-paragraph.png"}]]]
   [:div.ex
    [c/Segment
     [c/Loader {:active true}]
     [c/Image {:src "http://semantic-ui.com/images/wireframe/short-paragraph.png"}]]]])

(defn Rail []
  [:div.examples
   [c/Header {:as :h2} "Rail"]
   [:div.ex
    [c/Grid {:centered true :columns 3}
     [c/GridColumn
      [c/Segment
       [c/Image {:src "http://semantic-ui.com/images/wireframe/paragraph.png"}]
       [c/Rail {:position :left}
        [c/Segment "Left Rail Content"]]
       [c/Rail {:position :right}
        [c/Segment "Right Rail Content"]]]]]]
   [:div.ex
    [c/Segment {:text-align :center}
     [c/Image {:src "http://semantic-ui.com/images/wireframe/paragraph.png"}]
     [c/Rail {:internal true :position :left}
      [c/Segment "Left Rail Content"]]
     [c/Rail {:internal true :position :right}
      [c/Segment "Right Rail Content"]]]]
   [:div.ex
    [c/Grid {:centered true :columns 3}
     [c/GridColumn
      [c/Segment {:text-align :center}
       [c/Image {:src "http://semantic-ui.com/images/wireframe/paragraph.png"}]
       [c/Rail {:dividing true :position :left}
        [c/Segment "Left Rail Content"]]
       [c/Rail {:dividing true :position :right}
        [c/Segment "Right Rail Content"]]]]]]
   [:div.ex
    [c/Grid {:centered true :columns 3}
     [c/GridColumn
      [c/Segment {:text-align :center}
       [c/Image {:src "http://semantic-ui.com/images/wireframe/paragraph.png"}]
       [c/Rail {:attached true :position :left}
        [c/Segment "Left Rail Content"]]
       [c/Rail {:attached true :position :right}
        [c/Segment "Right Rail Content"]]]]]]
   [:div.ex
    [c/Segment
     [c/Image {:src "http://semantic-ui.com/images/wireframe/paragraph.png"}]
     [c/Rail {:attached true :internal true :position :left}
      [c/Segment "Left Rail Content"]]
     [c/Rail {:attached true :internal true :position :right}
      [c/Segment "Right Rail Content"]]]]])

(defn Reveal []
  [:div.examples
   [c/Header {:as :h2} "Reveal"]
   [:div.ex
    [c/Reveal {:animated :fade}
     [c/RevealContent {:visible true}
      [c/Image {:src "http://semantic-ui.com/images/wireframe/square-image.png" :size :small}]]
     [c/RevealContent {:hidden true}
      [c/Image {:src "http://semantic-ui.com/images/avatar/large/ade.jpg" :size :small}]]]]
   [:div.ex
    [c/Reveal {:animated :move}
     [c/RevealContent {:visible true}
      [c/Image {:src "http://semantic-ui.com/images/wireframe/square-image.png" :size :small}]]
     [c/RevealContent {:hidden true}
      [c/Image {:src "http://semantic-ui.com/images/avatar/large/chris.jpg" :size :small}]]]]
   [:div.ex
    [c/Reveal {:animated "move right"}
     [c/RevealContent {:visible true}
      [c/Image {:src "http://semantic-ui.com/images/wireframe/square-image.png" :size :small}]]
     [c/RevealContent {:hidden true}
      [c/Image {:src "http://semantic-ui.com/images/avatar/large/jenny.jpg" :size :small}]]]]
   [:div.ex
    [c/Reveal {:animated :rotate}
     [c/RevealContent {:visible true}
      [c/Image {:src "http://semantic-ui.com/images/wireframe/square-image.png" :shape :circular :size :small}]]
     [c/RevealContent {:hidden true}
      [c/Image {:src "http://semantic-ui.com/images/avatar/large/stevie.jpg" :shape :circular :size :small}]]]]
   [:div.ex
    [c/SegmentGroup
     [c/Segment "Top"]
     [c/SegmentGroup
      [c/Segment "Nested Top"]
      [c/Segment "Nested Middle"]
      [c/Segment "Nested Bottom"]]
     [c/SegmentGroup {:horizontal true}
      [c/Segment "Top"]
      [c/Segment "Middle"]
      [c/Segment "Bottom"]]
     [c/Segment "Bottom"]]]])

(defn Segment []
  [:div.examples
   [c/Header {:as :h2} "Segment"]
   [:div.ex
    [c/Segment "Pellentesque habitant morbi tristique senectus."]]
   [:div.ex
    [c/Segment {:stacked true} "Pellentesque habitant morbi tristique senectus."]]
   [:div.ex
    [c/Segment {:vertical true} "Te eum doming eirmod, nominati pertinacia argumentum ad his."]
    [c/Segment {:vertical true} "Pellentesque habitant morbi tristique senectus."]
    [c/Segment {:vertical true} "Eu quo homero blandit intellegebat. Incorrupte consequuntur mei id."]]])

(defn Step []
  [:div.examples
   [c/Header {:as :h2} "Step"]
   [:div.ex
    [c/StepGroup
     [c/Step "Shipping"]]]
   [:div.ex
    [c/StepGroup
     [c/Step
      [c/Icon {:name "truck"}]
      [c/StepContent
       [c/StepTitle "Shipping"]
       [c/StepDescription "Choose your shipping options"]]]
     [c/Step {:active true}
      [c/Icon {:name "payment"}]
      [c/StepContent {:title "Billing" :description "Enter billing information"}]]
     [c/Step {:disabled true :icon "info" :title "Confirm order"}]]
    [:br]
    [c/StepGroup {:items [{:key 1 :icon "truck" :title "Shhipping" :description "Choose your shipping options"}
                          {:key 2 :active true :icon "payment" :title "Billing" :description "Enter billing information"}
                          {:key 3 :disabled true :icon "info" :title "Confirm Order"}]}]]
   [:div.ex
    [c/StepGroup {:vertical true :items [{:key 1 :completed true :icon "truck" :title "Shipping" :description "Choose your shipping options"}
                                         {:key 2 :completed true :icon "credit card" :title "Billing" :description "Enter billing information"}
                                         {:key 3 :active true :icon "info" :title "Confirm Order" :description "Verify order details"}]}]]])

(defn Placeholder []
  [:div.examples
   [c/Header {:as :h2} "Placeholder"]
   [:div.ex
    [c/Placeholder
     [c/PlaceholderHeader {:image true}
      [c/PlaceholderLine]
      [c/PlaceholderLine]]
     [c/PlaceholderParagraph
      [c/PlaceholderLine]
      [c/PlaceholderLine]
      [c/PlaceholderLine]
      [c/PlaceholderLine]]]]])
