#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@LoginTest
Feature: Login Functionality - Valid Credentials

  @validcreds
  Scenario: User logs in with valid credentials
    Given the user is on the login page
    When the user enters valid username "your_username" and valid password "your_password"
    And the user clicks the login button
    Then the user should be redirected to the dashboard
    And the dashboard should be displayed
    
  @invalidcreds
  Scenario: User logs in with invalid credentials
    Given the user is on the login page
    When the user enters invalid username "invalid_username" and invalid password "invalid_password"
    And the user clicks the login button
    Then an error message should be displayed
    And the user should stay on the login page

