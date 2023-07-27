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
@LoginROPortal
Feature:I want to login of retailer

  @RetailerLogin
  Scenario:Login
    Given First open the Google
    Then hit the url
    And then enter the user name with preeti id
    And then enter the password
    And then hit on the submit button 
    But other user want to login with amit malu id
    Then again enter the user name of amit malu
    And  enter the password
    When hit on Login button
    Then land on the home page