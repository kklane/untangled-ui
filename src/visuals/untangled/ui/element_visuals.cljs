(ns untangled.ui.element-visuals
  (:require
    [devcards.core :as dc :refer-macros [defcard]]
    [om.dom :as dom]
    [om.next :as om :refer [defui]]
    [untangled.client.core :as uc]
    [untangled.ui.menu :as dropdowns :refer [menu menu-item]]
    [untangled.ui.elements :as e]
    [untangled.icons :refer [icon]]
    [untangled.i18n :as i :refer [tr trf]]))

(defcard buttons-visual-regression-testing
  (dom/div nil
    (for [shape #{:default :dense :round :wide}
          type #{:default :raised}
          colored #{false true}]
      (e/ui-button {:className "extra" :shape shape :type type :colored colored} (str shape " " type " " colored)))
    (e/ui-button {} "Label" (icon :arrow_forward))
    (e/ui-button {} (icon :arrow_back) "Label")))

(defcard badges-visual-regressions
  (dom/div nil
    (e/ui-button {} "Notifications " (e/ui-badge {} "8"))
    (e/ui-badge {:className "hello"} "7")
    (e/ui-badge {} (icon :arrow_back))
    (e/ui-badge {} (icon :arrow_back) (icon :arrow_forward))))

(defcard labels-visual-regressions
  (dom/div nil
    (e/ui-label {} "Default")
    (e/ui-label {:color :positive} "Positive")
    (e/ui-label {:color :informative} "Informative")
    (e/ui-label {:color :informative-alt} "Informative Alt")
    (e/ui-label {:color :neutral} "Neutral")
    (e/ui-label {:color :live} "Live")
    (e/ui-label {:color :alterable} "Alterable")
    (e/ui-label {:color :negative} "Negative")
    (e/ui-label {:color :positive} (icon :add) "Add")
    (e/ui-label {:color :negative} (icon :close) "Remove")))

(defcard field-visual-regressions
  (dom/div nil
    (e/ui-field {} "Default field")
    (e/ui-field {:size :small :state #{:required}} "Small required field")
    (e/ui-field {:size :medium :state #{:focus}} "Medium focused field")
    (e/ui-field {:size :large :state #{:invalid}} "Large invalid field")
    (e/ui-field {:state #{:error}} "Error field")))

(defcard messages-visual-regressions
  (dom/div nil
    (e/ui-message {} "This is default message.")
    (e/ui-message {:color :neutral} "This is neutral message.")
    (e/ui-message {:color :alert} "This is an alert message.")
    (e/ui-message {:color :success} "This is a success message.")
    (e/ui-message {:color :warning} "This is a warning message.")
    (e/ui-message {:color :warning} "This is a warning message with another child." (icon :arrow_forward))
    (e/ui-message {:className "h2"} "This is message using a standard H2 class name.")))
