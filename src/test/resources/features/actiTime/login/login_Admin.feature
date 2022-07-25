@driver:chrome
Feature: ActiTime Login feature
  In order to login to ActiTime application
  As a user
  I want to login to ActiTime application
  So that I can use it

  Scenario: Login and Logout to ActiTime application as a manager
    Given I am on the ActiTime login page
    When I enter "admin" into the username field
    And I enter "manager" into the password field
    And I click on the login button
    Then I should be logged in to ActiTime application