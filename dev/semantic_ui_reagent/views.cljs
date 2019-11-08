(ns semantic-ui-reagent.views
  (:require [semantic-ui-reagent.core :as c]))

(defn Card []
  [:div.examples
   [c/Header {:as :h2} "Card"]
   [:div.ex
    [c/Card
     [c/Image {:src "http://semantic-ui.com/images/avatar2/large/matthew.png"}]
     [c/CardContent
      [c/CardHeader "Matthew"]
      [c/CardMeta [:span {:class-name "date"} "Joined in 2015"]]
      [c/CardDescription "Matthew is a musician living in Nashville."]]
     [c/CardContent {:extra true}
      [:a [c/Icon {:name "user"}] "22 Friends"]]]]
   [:div.ex
    [c/CardGroup
     [c/Card
      [c/CardContent
       [c/Image {:floated :left :size :mini :src "http://semantic-ui.com/images/avatar/large/steve.jpg"}]
       [c/CardHeader "Steve Sanders"]
       [c/CardMeta "Friends of Elliot"]
       [c/CardDescription "Steve wants to add you to the group " [:strong "best friends"]]]
      [c/CardContent {:extra true}
       [:div {:class-name "ui two buttons"}
        [c/Button {:basic true :color :green} "Approve"]
        [c/Button {:basic true :color :red} "Decline"]]]]
     [c/Card
      [c/CardContent
       [c/Image {:floated :left :size :mini :src "http://semantic-ui.com/images/avatar2/large/molly.png"}]
       [c/CardHeader "Molly Thomas"]
       [c/CardMeta "New User"]
       [c/CardDescription " Molly wants to add you to the group " [:strong "musicians"]]]
      [c/CardContent {:extra true}
       [:div {:class-name "ui two buttons"}
        [c/Button {:basic true :color :green} "Approve"]
        [c/Button {:basic true :color :red} "Decline"]]]]
     [c/Card
      [c/CardContent
       [c/Image {:floated :left :size :mini :src "http://semantic-ui.com/images/avatar/large/jenny.jpg"}]
       [c/CardHeader "Jenny Lawrence"]
       [c/CardMeta "New User"]
       [c/CardDescription "Jenny requested permission to view your contact details"]]
      [c/CardContent {:extra true}
       [:div {:class-name "ui two buttons"}
        [c/Button {:basic true :color :green} "Approve"]
        [c/Button {:basic true :color :red} "Decline"]]]]]]])

(defn Comment []
  [:div.examples
   [c/Header {:as :h2} "Comment"]
   [:div.ex
    [c/CommentGroup
     [c/Header {:as :h3 :dividing true} "Comments"]
     [c/Comment
      [c/CommentAvatar {:src "http://semantic-ui.com/images/avatar/small/matt.jpg"}]
      [c/CommentContent
       [c/CommentAuthor {:as :a} "Matt"]
       [c/CommentMetadata [:div "Today at 5:42PM"]]
       [c/CommentText "How artistic!"]
       [c/CommentActions [c/CommentAction "Reply"]]]]
     [c/Comment
      [c/CommentAvatar {:src "http://semantic-ui.com/images/avatar/small/elliot.jpg"}]
      [c/CommentContent
       [c/CommentAuthor {:as :a} "Elliot Fu"]
       [c/CommentMetadata [:div "Yesterday at 12:30AM"]]
       [c/CommentText [:p "This has been very useful for my research. Thanks as well!"]]
       [c/CommentActions [c/CommentAction "Reply"]]]
      [c/CommentGroup
       [c/Comment
        [c/CommentAvatar {:src "http://semantic-ui.com/images/avatar/small/jenny.jpg"}]
        [c/CommentContent
         [c/CommentAuthor {:as :a} "Jenny Hess"]
         [c/CommentMetadata [:div "Just now"]]
         [c/CommentText "Elliot you are always so right :)"]
         [c/CommentActions [c/CommentAction "Reply"]]]]]]
     [c/Comment
      [c/CommentAvatar {:src "http://semantic-ui.com/images/avatar/small/joe.jpg"}]
      [c/CommentContent
       [c/CommentAuthor {:as :a} "Joe Henderson"]
       [c/CommentMetadata [:div "5 days ago"]]
       [c/CommentText "Dude, this is awesome. Thanks so much"]
       [c/CommentActions [c/CommentAction "Reply"]]]]
     [c/Form {:reply true :on-submit (fn [evt] (.preventDefault evt))}
      [c/FormTextArea]
      [c/Button {:content "Add Reply" :label-position :left :icon "edit" :primary true}]]]]])

(defn Feed []
  [:div.examples
   [c/Header {:as :h2} "Feed"]
   [:div.ex
    [c/Feed
     [c/FeedEvent
      [c/FeedLabel [:img {:src "http://semantic-ui.com/images/avatar/small/elliot.jpg"}]]
      [c/FeedContent "You added Elliot Fu to the group" [:a "Coworkers"]]]]]
   [:div.ex
    [c/Feed
     [c/FeedEvent
      [c/FeedLabel {:image "http://semantic-ui.com/images/avatar/small/jenny.jpg"}]
      [c/FeedContent
       [c/FeedDate "3 days ago"]
       [c/FeedSummary "You added " [:a "Jenny Hess"] " to your " [:a "coworker"] " group"]]]]]])

(defn Item []
  [:div.examples
   [c/Header {:as :h2} "Item"]
   [:div.ex
    [c/ItemGroup
     [c/Item
      [c/ItemImage {:size :tiny :src "http://semantic-ui.com/images/wireframe/image.png"}]
      [c/ItemContent
       [c/ItemHeader {:as :a} "Header"]
       [c/ItemMeta "Description"]
       [c/ItemDescription [c/Image {:src "http://semantic-ui.com/images/wireframe/short-paragraph.png"}]]
       [c/ItemExtra "Additional Details"]]]]]
   [:div.ex
    [c/ItemGroup
     [c/Item
      [c/ItemImage {:size :tiny :src "http://semantic-ui.com/images/wireframe/image.png"}]
      [c/ItemContent
       [c/ItemHeader "Arrowhead Valley Camp"]
       [c/ItemMeta
        [:span {:class-name "price"} "$1200"]
        [:span {:class-name "stay"} "1 Month"]]
       [c/ItemDescription [c/Image {:src "http://semantic-ui.com/images/wireframe/short-paragraph.png"}]]]]
     [c/Item
      [c/ItemImage {:size :tiny :src "http://semantic-ui.com/images/wireframe/image.png"}]
      [c/ItemContent
       [c/ItemHeader "Buck's Homebrew Stayaway"]
       [c/ItemMeta {:content "$1000 2 Weeks"}]
       [c/ItemDescription [c/Image {:src "http://semantic-ui.com/images/wireframe/short-paragraph.png"}]]]]
     [c/Item
      [c/ItemImage {:size :tiny :src "http://semantic-ui.com/images/wireframe/image.png"}]
      [c/ItemContent {:header "Arrowhead Valley Camp" :meta "$1200 1 Month"}]]]]])

(defn Statistic []
  [:div.examples
   [c/Header {:as :h2} "Statistic"]
   [:div.ex
    [c/Statistic
     [c/StatisticValue "5,550"]
     [c/StatisticLabel "Downloads"]]
    [c/Statistic {:value "5,500" :label "Downloads"}]]
   [:div.ex
    [c/StatisticGroup
     [c/Statistic
      [c/StatisticValue "22"]
      [c/StatisticLabel "Saves"]]
     [c/Statistic
      [c/StatisticValue {:text true} "Three" [:br] "Thousand"]
      [c/StatisticLabel "Signups"]]
     [c/Statistic
      [c/StatisticValue
       [c/Icon {:name "plane"} "5"]]
      [c/StatisticLabel "Flights"]]
     [c/Statistic
      [c/StatisticValue
       [c/Image {:src "http://semantic-ui.com/images/avatar/small/joe.jpg"
                 :inline true
                 :shape :circular}]
       "42"]
      [c/StatisticLabel "Team Members"]]]]])
