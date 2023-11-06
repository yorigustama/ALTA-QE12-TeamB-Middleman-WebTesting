@Project
Feature: User Login

  @LogOut_Successful
  Scenario: Successful login
    Given User open the website Middleman login
    When User input "admin.middleman@gmail.com" as a userName "Admin123$" as a password
    And User should see an success message login
    And User already on home page
    And User click button profile
    And User click button logout
    And User click button allert logout
    Then User already on website Middleman login