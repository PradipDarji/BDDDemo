Feature: 
  Login Feature

  Scenario: 
    To verify login functionality with valid data.

    Given I launch the chrome browser
    And I enter username and password
    When I click on login button
    Then I redirect on dashboard page.
