Feature: Landing Page Text Control And Skip Button

  Scenario: Landing Pages Get Title and Description
    Given Landing Page Start
    And First Page Get Title "Relax"
    And First Page Get Description "Take advantage of our numeruous picture collections, choose one of them and unwind with colors."
    And I expect "continue" button is displayed
    When First Page Skip Button
    Then Go To Second Page Get Title "Be Creative"
    And Second Page Get Description "Unleash your creativity! Share your paintings with your friends and get fans!"
    When Second Page Skip Button
    Then Go To Third Page Get Title "Fabulous Palettes"
    And Third Page Get Description "Discover our fabulous color palettes. Take your time and enjoy the world of iPaint."
    When Third Page Skip Button
    And Close Advertising
    Then Go To Home Page