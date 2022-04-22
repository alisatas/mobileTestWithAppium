
Feature: My Studies Page

  Scenario: My Studies Page Get Title
    Given Go To My Studies Page
    Then My Studies Page Get Title "Çalışmalarım"

  Scenario: My Studies Page In Categories Page
    Given Go To My Studies Page
    Given Click Start Painting Button
    Then Go To Categories Page