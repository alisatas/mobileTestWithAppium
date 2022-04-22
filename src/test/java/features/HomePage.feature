Feature: Home Page

  Scenario Outline: Home Page Slider Detail Page and Picture Detail
    Given Home Page Start
    And Slider Image Click
    Then Page Swipe "<startPercentage>" "<endPercentage>" "<anchorPercentage>"
    And Click Picture
    And Color Picture Detail
    And Back To Categories Page
    Then Back To Home Page
    Examples: | startPercentage | endPercentage | anchorPercentage |
    | 0.6             | 0.3           | 0.5              |


  Scenario Outline: Home Page Picture Detail
    Given Home Page Start
    And Page Swipe "<startPercentage>" "<endPercentage>" "<anchorPercentage>"
    And Tap On Coordinates
    Then Open Picture Detail
    And Back To Categories Page
    Examples: | startPercentage | endPercentage | anchorPercentage |
    | 0.9             | 0.3           | 0.5              |




