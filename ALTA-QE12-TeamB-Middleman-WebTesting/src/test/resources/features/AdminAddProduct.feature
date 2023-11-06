@Project @Login
Feature: Admin add a product

  Scenario: Admin adds a new product
    Given Admin open the website middleman
    When Admin input "admin.middleman@gmail.com" as a userName "Admin123$" as a password
    And Admin should see an success message
    Then Admin already on home page
    When Admin click button add product
    Then Admin choose file image
    And Admin input adds a new product "Sample Product" as a productName "2" as a unit "3" as a stock and "1000" as a price
    And Admin click button add
    And Success update data product