@Project @Edit
Feature: Admin edit a product

  Scenario: Admin adds a edit product
    Given Admin open the website middleman
    When Admin input "admin.middleman@gmail.com" as a userName "Admin123$" as a password
    And Admin should see an success message
    Then Admin already on home page
    When Admin click button edit
    Then Admin already on edit page
    And Admin input data "1" as a productName "2" as a unit "3" as a stock and "0000" as a price
    Then Admin clicks the edit changes button
    And Success update data