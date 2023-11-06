@Project
Feature: History Order my Product
  As a Admin I want to know the order history

  Scenario: admin succes view detail history order
    Given Admin open the website Middleman login
    When Admin input "admin.middleman@gmail.com" as a userName "Admin123$" as a password
    And Admin should see an success message login
    Then Admin already on home page
    Then Admin input "kaki 3" in search product
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
    And Admin click button History Order
    Then Admin already history order product
    Then Admin click button detail history order
    Then Admin already detail product order