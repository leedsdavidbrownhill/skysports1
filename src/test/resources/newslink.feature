Feature: Sky Sports News Link 
As a Sky Sports user, I should be able to visit the Sky Sports news links.
  
  Scenario: I should be able to navigate to news links from the home page
    Given I navigate to skysports homepage for news
    When I click on a news link
    Then the page will be identified by "News"

