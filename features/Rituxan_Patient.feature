Feature: Test rituxan patient enrollment

  @tag2
  Scenario: Test rituxan enrollemnt scenario
    Given I open rituxan patinet site
    And click on apply now
    When I select LAP
    And fillup the eligibility qn
    And enter the LAP info
    And enter Patient info
    And insurnce info
    And doctor info
    Then I verify the info
    And select the check box
    And submit for enrollment
