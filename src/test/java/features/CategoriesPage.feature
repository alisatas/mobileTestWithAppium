@CategoriesPage
Feature: Categories Page

  Scenario: Categories Page Get Title
    Given Click Navigation Bar To Categories
    Then Categories Page Get Title "Kategoriler"

  Scenario: Child Categories Detail in Categories Page
    Given Go To Categories Page With Navigation Bar
    And Child Categories Right Swipe
    And Child Categories Left Swipe
    And Categories Page Vertical Swipe
    And Click Animal Categories First Picture
    And Back To Categories
    And Categories Page Swipe Top




