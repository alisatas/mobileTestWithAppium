
Feature: Other Page

  Scenario: Other Page Get Title
    Given Go To Other Page
    Then Other Page Get Title "Diğerleri"

  Scenario: Contact Us
    Given Go To Other Page
    And Click Contact Us Button
    Then Open Contact Us Page
    And Click Write To Us Button
    And Name Field is Filled "Test User"
    And Email Field is Filled "test@gmail.com"
    And Topic is Selected
    And Write To Message "Test Message"
    And Screen Down Swipe
    And Click Submit Button
    Then Send Message Successfully "Teşekkürler"

  Scenario: Change Language
    Given Go To Other Page
    And Click App Language Button
    And Select English
    Then Change App Language English
    And Second Click App Language Button
    And List Vertical Swipe
    And Select Turkish
    Then Change App Language Turkish





