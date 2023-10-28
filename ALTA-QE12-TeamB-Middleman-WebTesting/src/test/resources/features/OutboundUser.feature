@OutBoundUser
Feature: User Checkout Product

  Scenario: Success Checkout Product
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
    Then User click button tambah qty
    Then User click button minus qty
    Then User click button submit outbound
    And User should see an success input data

  Scenario: user success delete product
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
    Then User click button tambah qty
    Then User delete button

  Scenario: user success entered order history detail product
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