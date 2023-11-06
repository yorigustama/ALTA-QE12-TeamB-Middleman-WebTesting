@Project
Feature: User Login

  @Login_Successful
  Scenario: Successful login
    Given User open the website Middleman login
    When User input "admin.middleman@gmail.com" as a userName "Admin123$" as a password
    And User should see an success message login
    Then User already on home page

  @Login_Successful_Admin
  Scenario: Successful login admin
    Given Admin open the website Middleman login
    When Admin input "tes.middleman@gmail.com" as a userName "admin12" as a password
    And Admin should see an success message login
    Then Admin already on home page

  @Login_Failed
  Scenario: Failed login with invalid credentials
    Given User open the website Middleman login
    When User input "invaliduser@gmail.com" as a userName "InvalidPassword" as a password
    Then User should see an error message login

#  Scenario: Failed login with empty fields
#    Given User open the website Middleman login
#    When User input "" as a userName "" as a password
#    Then User should see an error message login