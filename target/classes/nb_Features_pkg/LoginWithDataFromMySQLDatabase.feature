# On Saturday, July 30, 2023, BDD class 3, sess 3 with MS Islam

@DatabaseLoginFeature @Regression
Feature: n  Techfios billing login page functionality validation

  Background: 
    Given User is on the techfios login page

     
@DbLoginScenario1
  Scenario: User should be able to login with valid credentials
    When User enters "username" from mysqldb database
    When User enters "password" from mysqldb database
    When User clicks on sign in button
    Then User should land on dashboard page
 #   When User enters "password" from mysqldb database
    



 