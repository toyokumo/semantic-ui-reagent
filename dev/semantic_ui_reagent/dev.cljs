(ns semantic-ui-reagent.dev
  (:require [reagent.dom :as rd]
            [semantic-ui-reagent.elements :as e]
            [semantic-ui-reagent.collections :as co]
            [semantic-ui-reagent.views :as v]
            [semantic-ui-reagent.modules :as m]
            [semantic-ui-reagent.addons :as a]
            [semantic-ui-reagent.core :as c]))

(defn- main-component []
  [c/Container
   [c/Header {:as :h1} "Addons"]
   [c/Divider]
   [a/Confirm]
   [a/Radio]
   [a/Select]
   [a/TextArea]

   [c/Header {:as :h1} "Collections"]
   [c/Divider]
   [co/Breadcrumb]
   [co/Form]
   [co/Grid]
   [co/Menu-1]
   [co/Menu-2]
   [co/Menu-3]
   [co/Message]
   [co/Table]

   [c/Header {:as :h1} "Elements"]
   [c/Divider]
   [e/Button]
   [e/Container]
   [e/Divider]
   [e/Flag]
   [e/Header]
   [e/Icon]
   [e/Image]
   [e/Input]
   [e/Label]
   [e/List]
   [e/Loader]
   [e/Rail]
   [e/Reveal]
   [e/Segment]
   [e/Step]
   [e/Placeholder]

   [c/Header {:as :h1} "Modules"]
   [c/Divider]
   [m/Accordion]
   [m/Checkbox]
   [m/Dimmer-1]
   [m/Dimmer-2]
   [m/Dropdown]
   [m/Embed]
   [m/Modal]
   [m/Popup]
   [m/Progress]
   [m/Rating]
   [m/Sidebar-1]
   [m/Sidebar-2]

   [c/Header {:as :h1} "Views"]
   [c/Divider]
   [v/Card]
   [v/Comment]
   [v/Feed]
   [v/Item]
   [v/Statistic]])

(defn ^:dev/after-load start []
  (js/console.log "start")
  (rd/render [main-component]
             (.getElementById js/document "app")))

(defn ^:export init []
  (js/console.log "init")
  (start))

(defn ^:dev/before-load stop []
  (js/console.log "stop"))
