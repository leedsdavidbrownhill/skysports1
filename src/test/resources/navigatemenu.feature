Feature: Homepage Menu Navigation
  As a Sky Sports user, I should be able to navigate menu choices.

  Scenario: I should be able to navigate to a sub menu
    Given I navigate to skysports homepage to select sub menu
    When I navigate to "games"
    Then I can see "Sky Sports Games"
