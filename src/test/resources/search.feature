Feature: Search Sky Sports Site
  As a Sky Sports user I want to search the site for details based on a textual input.

  Scenario: I should be able to see relevant results for a requested search
    Given I navigate to skysports homepage to search
    When I search for the string "FOOTBALL"
    Then the top result will contain the text "Football"