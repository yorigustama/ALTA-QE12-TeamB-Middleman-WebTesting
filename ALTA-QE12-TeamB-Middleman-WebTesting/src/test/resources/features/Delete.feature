@Project @Delete
Feature: Admin delete product

  Scenario: Successful Delete Product
    Given Admin open the website middleman
    When Admin input "admin.middleman@gmail.com" as a userName "Admin123$" as a password
    And Admin should see an success message
    Then Admin already on home page
    When Admin click button delete product
    Then Admin click button Ya
    And The product has been successfully deleted

  Scenario: Delete invalid
    Given Admin open the website middleman
    When Admin input "admin.middleman@gmail.com" as a userName "Admin123$" as a password
    And Admin should see an success message
    Then Admin already on home page
    When Admin click button delete product invalid
    Then Admin click button No
    And The screen will return to the my product display

