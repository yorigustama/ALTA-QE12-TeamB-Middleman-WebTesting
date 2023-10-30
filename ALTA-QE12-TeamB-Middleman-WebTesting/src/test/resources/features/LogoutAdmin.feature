@Logout
Feature: User Logout my Website
  As a Admin I want to logout website

  Scenario: admin succes logout in website middleman
    Given Admin open the website Middleman login
    When Admin input "admin.middleman@gmail.com" as a userName "Admin123$" as a password
    And Admin should see an success message login
    Then Admin already on home page
    Then Admin click button fitur Logout
    Then Admin click button Logout
    Then Admin already Log Out Yes Or No
    Then Admin click button Log Out Yes
    Then Admin already website middleman

  Scenario: admin succes logout in website middleman
    Given Admin open the website Middleman login
    When Admin input "admin.middleman@gmail.com" as a userName "Admin123$" as a password
    And Admin should see an success message login
    Then Admin already on home page
    Then Admin click button fitur Logout
    Then Admin click button Logout
    Then Admin already Log Out Yes Or No
    Then Admin click button LogOut No