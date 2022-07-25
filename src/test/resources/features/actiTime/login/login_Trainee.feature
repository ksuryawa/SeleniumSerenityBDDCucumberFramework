
Feature: ActiTime Login feature01
  In order to login to ActiTime application
  As a user
  I want to login to ActiTime application
  So that I can use it

  Scenario: Login and Logout to ActiTime application as a trainee
    Given I am on the ActiTime login page
    When I enter "trainee" into the username field
    And I enter "trainee" into the password field
    And I click on the login button
    Then I should be logged in to ActiTime application