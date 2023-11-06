@Project
Feature: Product User

  Scenario: Success add product
    Given User open the website Middleman login
    When User input "Ekaapril.middleman@gmail.com" as a userName "Ekaaprilli123$" as a password
    And User should see an success message login
    Then User already on home page
    And User click button My Product
    Then User already My product
    Then User input "batik" in search product
    Then User click button search
    Then User already product
    Then User click button add product stock
    And User should see an success creating a cart

  @Middleman
  Scenario: The User input wrong word failed
    Given User open the website Middleman login
    When User input "admin.middleman@gmail.com" as a userName "Admin123$" as a password
    And User should see an success message login
    Then User already on home page
    Then User input "sfnskfbrfrrfn" in search product
    Then User click button search
    Then User cannot find the data

  @Middleman
  Scenario: The User input numbers field
    Given User open the website Middleman login
    When User input "admin.middleman@gmail.com" as a userName "Admin123$" as a password
    And User should see an success message login
    Then User already on home page
    Then User input "132546879" in search product
    Then User click button search
    Then User cannot find the data

  @Middleman
  Scenario: The user input special characters
    Given User open the website Middleman login
    When User input "admin.middleman@gmail.com" as a userName "Admin123$" as a password
    And User should see an success message login
    Then User already on home page
    Then User input "@%$#^" in search product
    Then User click button search
    Then User already product