(ns semantic-ui-reagent.dev
  (:require [reagent.core :as r]
            [semantic-ui-reagent.core :as c]
            [semantic-ui-reagent.confirm :refer [confirm]]
            [semantic-ui-reagent.radio :refer [radio]]
            [semantic-ui-reagent.select :refer [select]]
            [semantic-ui-reagent.textarea :refer [textarea]]))

(defn- main-component []
  [c/Container
   [confirm]
   [radio]
   [select]
   [textarea]])

;; start is called by init and after code reloading finishes
(defn ^:dev/after-load start []
  (js/console.log "start")
  (r/render [main-component]
            (.getElementById js/document "app")))

(defn ^:export init []
  ;; init is called ONCE when the page loads
  ;; this is called in the index.html and must be exported
  ;; so it is available even in :advanced release builds
  (js/console.log "init")
  (start))

;; this is called before any code is reloaded
(defn ^:dev/before-load stop []
  (js/console.log "stop"))
