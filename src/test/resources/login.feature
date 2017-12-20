Feature: Sky Sports Login
  As a Sky Sports user, I should be able to login to the Sky Sports UK portal.

  Scenario: I should be refused login at the homepage with an invalid account
    Given I navigate to skysports login with an invalid account
    When I enter "invalid-username" and "invalid-password"
    Then I should be refused access