@@Middleman
Feature: Search History Order User
  As a User i want know history my order

  Scenario: user succes view detail history order
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
    Then User click button outbound
    Then User already outbound product
    Then User click button history product out
    Then User already history out product
    Then User click button Detail history product out
    Then User already Detail product out
    And User click button History Order
    Then User already history order product
    Then User click button detail history order
    Then User already detail product order
