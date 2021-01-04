Feature: Actemra patient enrollment test feature

  @tag1
  Scenario: Actemra patient enrollment scenario
    Given I open Actemra site
    And Click on apply now button
    And Apply as Patient
    And Apply the eligibility QN
    When I complete the patient info
    And Insurance Info
    And Doctor information
    Then I verified the info
    And click on confirm button
