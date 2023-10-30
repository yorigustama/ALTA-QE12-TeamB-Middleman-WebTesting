@Login
Feature: User Login

  Scenario: Success login
    Given User open the website Middleman login
    When User input "Ekaapril.middleman@gmail.com" as a userName "Ekaaprilli123$" as a password
    And User should see an success message login
    Then User already on home page