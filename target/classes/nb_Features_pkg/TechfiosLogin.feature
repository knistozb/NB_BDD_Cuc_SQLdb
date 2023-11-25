
# On Saturday, July 30, 2023, BDD class 3, sess 3 with MS Islam

@LoginFeature @Regression
Feature: n  Techfios billing login page functionality validation

  Background: 
    Given User is on the techfios login page

     
@LoginScenario1 @Smoke @Sanity @Test
  Scenario: User should be able to login with valid credentials
    When User enters username as "demo@techfios.com"
    When User enters password as "abc123"
    When User clicks on sign in button
    Then User should land on dashboard page


@LoginScenario2
  Scenario: User should not be able to login with invalid credentials
  	When User enters username as "demo@techfios.com"
    When User enters password as "abc1234"
    When User clicks on sign in button
    Then User should land on dashboard page
 