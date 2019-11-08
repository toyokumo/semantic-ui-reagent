# semantic-ui-reagent

A ClojureScript library for using [Semantic UI React](http://react.semantic-ui.com) with [Reagent](http://reagent-project.github.io/) .

This is mostly a port of [malesch/semantic-reagent](https://github.com/malesch/semantic-reagent) but can work on [shadow-cljs](https://github.com/thheller/shadow-cljs).

[![Clojars Project](https://img.shields.io/clojars/v/toyokumo/semantic-ui-reagent.svg)](https://clojars.org/toyokumo/semantic-ui-reagent)
[![cljdoc badge](https://cljdoc.org/badge/toyokumo/semantic-ui-reagent)](https://cljdoc.org/d/toyokumo/semantic-ui-reagent/CURRENT)

## Usage

```clojure
;; Work on shadow-cljs

(:require '[reagent.core :as r]
          '["semantic-ui-react" :as sur]
          '[semantic-ui-reagent.core :as sui])

(defn- sidebar []
  (let [visible (r/atom false)
        on-click (fn [_] (reset! visible (not @visible)))]
    (fn []
      [:div
       [sui/Button {:on-click on-click} "Toggle"]
       [sui/SidebarPushable {:as sur/Segment}
        [sui/Sidebar {:as sur/Menu
                      :animation "push"
                      :icon "labeled"
                      :inverted true
                      :visible @visible
                      :vertical true
                      :width "thin"}
         [sui/MenuItem {:as "a"}
          [sui/Icon {:name "home"}]
          "HOME"]
         [sui/MenuItem {:as "a"}
          [sui/Icon {:name "gamepad"}]
          "Games"]]
        [sui/SidebarPusher
         [sui/Segment {:basic true}
          [sui/Header {:as "h3"} "Content"]
          [sui/Image {:src "https://react.semantic-ui.com/images/wireframe/paragraph.png"}]]]]])))

(defn- main-component []
  [sui/Container
   [sidebar]]])

(defn main []
  (r/render [main-component] (.getElementById js/document "app")))
```

There area more usage in [dev/semantic_ui_reagent/dev.cljs](dev/semantic_ui_reagent/dev.cljs).

## License

Copyright 2019 TOYOKUMO,Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
