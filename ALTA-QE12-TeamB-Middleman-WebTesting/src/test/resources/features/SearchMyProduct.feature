@Project
Feature: Search Product
  As a user i want search product

  Scenario: Successful Search
    Given User open the website middleman
    When User input "Ekaapril.middleman@gmail.com" as a userName "Ekaaprilli123$" as a password
    Then User already on home page
    When User click my product button
    Then User already on my product home
    Then User input "batik" in search product
    Then User click button search