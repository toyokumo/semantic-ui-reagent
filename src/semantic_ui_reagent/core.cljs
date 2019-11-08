(ns semantic-ui-reagent.core
  (:refer-clojure :exclude [List])
  (:require [reagent.core :as r]
            ["semantic-ui-react" :as sur]))

;;
;; Reagent components that area sorted same as index.js of Semantic-UI-React.
;;

(def Confirm (r/adapt-react-class sur/Confirm))
(def MountNode (r/adapt-react-class sur/MountNode))
(def Pagination (r/adapt-react-class sur/Pagination))
(def PaginationItem (r/adapt-react-class sur/PaginationItem))
(def Portal (r/adapt-react-class sur/Portal))
(def PortalInner (r/adapt-react-class sur/PortalInner))
(def Radio (r/adapt-react-class sur/Radio))
(def Responsive (r/adapt-react-class sur/Responsive))
(def Select (r/adapt-react-class sur/Select))
(def TextArea (r/adapt-react-class sur/TextArea))
(def TransitionablePortal (r/adapt-react-class sur/TransitionablePortal))

(def Visibility (r/adapt-react-class sur/Visibility))

(def Breadcrumb (r/adapt-react-class sur/Breadcrumb))
(def BreadcrumbDivider (r/adapt-react-class sur/BreadcrumbDivider))
(def BreadcrumbSection (r/adapt-react-class sur/BreadcrumbSection))

(def Form (r/adapt-react-class sur/Form))
(def FormButton (r/adapt-react-class sur/FormButton))
(def FormCheckbox (r/adapt-react-class sur/FormCheckbox))
(def FormDropdown (r/adapt-react-class sur/FormDropdown))
(def FormField (r/adapt-react-class sur/FormField))
(def FormGroup (r/adapt-react-class sur/FormGroup))
(def FormInput (r/adapt-react-class sur/FormInput))
(def FormRadio (r/adapt-react-class sur/FormRadio))
(def FormSelect (r/adapt-react-class sur/FormSelect))
(def FormTextArea (r/adapt-react-class sur/FormTextArea))

(def Grid (r/adapt-react-class sur/Grid))
(def GridColumn (r/adapt-react-class sur/GridColumn))
(def GridRow (r/adapt-react-class sur/GridRow))

(def Menu (r/adapt-react-class sur/Menu))
(def MenuHeader (r/adapt-react-class sur/MenuHeader))
(def MenuItem (r/adapt-react-class sur/MenuItem))
(def MenuMenu (r/adapt-react-class sur/MenuMenu))

(def Message (r/adapt-react-class sur/Message))
(def MessageContent (r/adapt-react-class sur/MessageContent))
(def MessageHeader (r/adapt-react-class sur/MessageHeader))
(def MessageItem (r/adapt-react-class sur/MessageItem))
(def MessageList (r/adapt-react-class sur/MessageList))

(def Table (r/adapt-react-class sur/Table))
(def TableBody (r/adapt-react-class sur/TableBody))
(def TableCell (r/adapt-react-class sur/TableCell))
(def TableFooter (r/adapt-react-class sur/TableFooter))
(def TableHeader (r/adapt-react-class sur/TableHeader))
(def TableHeaderCell (r/adapt-react-class sur/TableHeaderCell))
(def TableRow (r/adapt-react-class sur/TableRow))

(def Button (r/adapt-react-class sur/Button))
(def ButtonContent (r/adapt-react-class sur/ButtonContent))
(def ButtonGroup (r/adapt-react-class sur/ButtonGroup))
(def ButtonOr (r/adapt-react-class sur/ButtonOr))

(def Container (r/adapt-react-class sur/Container))

(def Divider (r/adapt-react-class sur/Divider))

(def Flag (r/adapt-react-class sur/Flag))

(def Header (r/adapt-react-class sur/Header))
(def HeaderContent (r/adapt-react-class sur/HeaderContent))
(def HeaderSubheader (r/adapt-react-class sur/HeaderSubheader))

(def Icon (r/adapt-react-class sur/Icon))
(def IconGroup (r/adapt-react-class sur/IconGroup))

(def Image (r/adapt-react-class sur/Image))
(def ImageGroup (r/adapt-react-class sur/ImageGroup))

(def Input (r/adapt-react-class sur/Input))

(def Label (r/adapt-react-class sur/Label))
(def LabelDetail (r/adapt-react-class sur/LabelDetail))
(def LabelGroup (r/adapt-react-class sur/LabelGroup))

(def List (r/adapt-react-class sur/List))
(def ListContent (r/adapt-react-class sur/ListContent))
(def ListDescription (r/adapt-react-class sur/ListDescription))
(def ListHeader (r/adapt-react-class sur/ListHeader))
(def ListIcon (r/adapt-react-class sur/ListIcon))
(def ListItem (r/adapt-react-class sur/ListItem))
(def ListList (r/adapt-react-class sur/ListList))

(def Loader (r/adapt-react-class sur/Loader))

(def Placeholder (r/adapt-react-class sur/Placeholder))
(def PlaceholderHeader (r/adapt-react-class sur/PlaceholderHeader))
(def PlaceholderImage (r/adapt-react-class sur/PlaceholderImage))
(def PlaceholderLine (r/adapt-react-class sur/PlaceholderLine))
(def PlaceholderParagraph (r/adapt-react-class sur/PlaceholderParagraph))

(def Rail (r/adapt-react-class sur/Rail))

(def Reveal (r/adapt-react-class sur/Reveal))
(def RevealContent (r/adapt-react-class sur/RevealContent))

(def Segment (r/adapt-react-class sur/Segment))
(def SegmentGroup (r/adapt-react-class sur/SegmentGroup))
(def SegmentInline (r/adapt-react-class sur/SegmentInline))

(def Step (r/adapt-react-class sur/Step))
(def StepContent (r/adapt-react-class sur/StepContent))
(def StepDescription (r/adapt-react-class sur/StepDescription))
(def StepGroup (r/adapt-react-class sur/StepGroup))
(def StepTitle (r/adapt-react-class sur/StepTitle))

(def Accordion (r/adapt-react-class sur/Accordion))
(def AccordionAccordion (r/adapt-react-class sur/AccordionAccordion))
(def AccordionContent (r/adapt-react-class sur/AccordionContent))
(def AccordionPanel (r/adapt-react-class sur/AccordionPanel))
(def AccordionTitle (r/adapt-react-class sur/AccordionTitle))

(def Checkbox (r/adapt-react-class sur/Checkbox))

(def Dimmer (r/adapt-react-class sur/Dimmer))
(def DimmerDimmable (r/adapt-react-class sur/DimmerDimmable))
(def DimmerInner (r/adapt-react-class sur/DimmerInner))

(def Dropdown (r/adapt-react-class sur/Dropdown))
(def DropdownDivider (r/adapt-react-class sur/DropdownDivider))
(def DropdownHeader (r/adapt-react-class sur/DropdownHeader))
(def DropdownItem (r/adapt-react-class sur/DropdownItem))
(def DropdownMenu (r/adapt-react-class sur/DropdownMenu))
(def DropdownSearchInput (r/adapt-react-class sur/DropdownSearchInput))

(def Embed (r/adapt-react-class sur/Embed))

(def Modal (r/adapt-react-class sur/Modal))
(def ModalActions (r/adapt-react-class sur/ModalActions))
(def ModalContent (r/adapt-react-class sur/ModalContent))
(def ModalDescription (r/adapt-react-class sur/ModalDescription))
(def ModalHeader (r/adapt-react-class sur/ModalHeader))

(def Popup (r/adapt-react-class sur/Popup))
(def PopupContent (r/adapt-react-class sur/PopupContent))
(def PopupHeader (r/adapt-react-class sur/PopupHeader))

(def Progress (r/adapt-react-class sur/Progress))

(def Rating (r/adapt-react-class sur/Rating))
(def RatingIcon (r/adapt-react-class sur/RatingIcon))

(def Search (r/adapt-react-class sur/Search))
(def SearchCategory (r/adapt-react-class sur/SearchCategory))
(def SearchResult (r/adapt-react-class sur/SearchResult))
(def SearchResults (r/adapt-react-class sur/SearchResults))

(def Sidebar (r/adapt-react-class sur/Sidebar))
(def SidebarPushable (r/adapt-react-class sur/SidebarPushable))
(def SidebarPusher (r/adapt-react-class sur/SidebarPusher))

(def Sticky (r/adapt-react-class sur/Sticky))

(def Tab (r/adapt-react-class sur/Tab))
(def TabPane (r/adapt-react-class sur/TabPane))

(def Transition (r/adapt-react-class sur/Transition))
(def TransitionGroup (r/adapt-react-class sur/TransitionGroup))

(def Advertisement (r/adapt-react-class sur/Advertisement))

(def Card (r/adapt-react-class sur/Card))
(def CardContent (r/adapt-react-class sur/CardContent))
(def CardDescription (r/adapt-react-class sur/CardDescription))
(def CardGroup (r/adapt-react-class sur/CardGroup))
(def CardHeader (r/adapt-react-class sur/CardHeader))
(def CardMeta (r/adapt-react-class sur/CardMeta))

(def Comment (r/adapt-react-class sur/Comment))
(def CommentAction (r/adapt-react-class sur/CommentAction))
(def CommentActions (r/adapt-react-class sur/CommentActions))
(def CommentAuthor (r/adapt-react-class sur/CommentAuthor))
(def CommentAvatar (r/adapt-react-class sur/CommentAvatar))
(def CommentContent (r/adapt-react-class sur/CommentContent))
(def CommentGroup (r/adapt-react-class sur/CommentGroup))
(def CommentMetadata (r/adapt-react-class sur/CommentMetadata))
(def CommentText (r/adapt-react-class sur/CommentText))

(def Feed (r/adapt-react-class sur/Feed))
(def FeedContent (r/adapt-react-class sur/FeedContent))
(def FeedDate (r/adapt-react-class sur/FeedDate))
(def FeedEvent (r/adapt-react-class sur/FeedEvent))
(def FeedExtra (r/adapt-react-class sur/FeedExtra))
(def FeedLabel (r/adapt-react-class sur/FeedLabel))
(def FeedLike (r/adapt-react-class sur/FeedLike))
(def FeedMeta (r/adapt-react-class sur/FeedMeta))
(def FeedSummary (r/adapt-react-class sur/FeedSummary))
(def FeedUser (r/adapt-react-class sur/FeedUser))

(def Item (r/adapt-react-class sur/Item))
(def ItemContent (r/adapt-react-class sur/ItemContent))
(def ItemDescription (r/adapt-react-class sur/ItemDescription))
(def ItemExtra (r/adapt-react-class sur/ItemExtra))
(def ItemGroup (r/adapt-react-class sur/ItemGroup))
(def ItemHeader (r/adapt-react-class sur/ItemHeader))
(def ItemImage (r/adapt-react-class sur/ItemImage))
(def ItemMeta (r/adapt-react-class sur/ItemMeta))

(def Statistic (r/adapt-react-class sur/Statistic))
(def StatisticGroup (r/adapt-react-class sur/StatisticGroup))
(def StatisticLabel (r/adapt-react-class sur/StatisticLabel))
(def StatisticValue (r/adapt-react-class sur/StatisticValue))
