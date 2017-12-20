Feature: Load Sky Sports Homepage
  As a Sky Sports user the Sky Sports UK portal will load in within 5 seconds.

  Scenario: I should be able to load the homepage without delay
    Given I navigate to skysports homepage to load
    Then the home page will load within 5 seconds
