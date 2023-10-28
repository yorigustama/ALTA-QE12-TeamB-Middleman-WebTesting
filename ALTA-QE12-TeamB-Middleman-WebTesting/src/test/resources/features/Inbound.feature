@Inbound
Feature: Inbound my Product
  As a admin i want Inbound product

  Scenario: Successful in Homepage and delete product in Inbound
    Given Admin open the website Middleman login
    When Admin input "admin.middleman@gmail.com" as a userName "Admin123$" as a password
    And Admin should see an success message login
    Then Admin already on home page
    Then Admin input "galon" in search product
    Then Admin click button search
    Then Admin already product
    Then Admin click button add product stock
    And Admin should see an success creating a cart
    Then Admin click button inbound
    Then Admin already inbound product
    Then Admin click button tambah qty
    Then Admin delete button

  @Middleman
  Scenario: Successful Submit Inbound
    Given Admin open the website Middleman login
    When Admin input "admin.middleman@gmail.com" as a userName "Admin123$" as a password
    And Admin should see an success message login
    Then Admin already on home page
    Then Admin input "galon" in search product
    Then Admin click button search
    Then Admin already product
    Then Admin click button add product stock
    And Admin should see an success creating a cart
    Then Admin click button inbound
    Then Admin already inbound product
    Then Admin click button tambah qty
    Then Admin click button kurang qty
    Then Admin click button submit inbound
    And Admin should see an success input data

  @Middleman
  Scenario: Successful History Product In
    Given Admin open the website Middleman login
    When Admin input "admin.middleman@gmail.com" as a userName "Admin123$" as a password
    And Admin should see an success message login
    Then Admin already on home page
    Then Admin input "galon" in search product
    Then Admin click button search
    Then Admin already product
    Then Admin click button add product stock
    And Admin should see an success creating a cart
    Then Admin click button inbound
    Then Admin already inbound product
    Then Admin click button history product in
    Then Admin already history in product
    Then Admin click button Detail history product in
    Then Admin already Detail product in