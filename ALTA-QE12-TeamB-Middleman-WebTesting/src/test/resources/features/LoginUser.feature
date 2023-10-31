@Tugas @Login_users
Feature: User Login

  @Login_Successful
  Scenario: Successful login
    Given User open the website Middleman login
    When User input "tes.middleman@gmail.com" as a userName "admin12" as a password
    And User should see an success message login
#    Then User already on home page

  @Login_Failed
  Scenario: Failed login with invalid credentials
    Given User open the website Middleman login
    When User input "invaliduser@gmail.com" as a userName "InvalidPassword" as a password
    Then User should see an error message login

#  Scenario: Failed login with empty fields
#    Given User open the website Middleman login
#    When User input "" as a userName "" as a password
#    Then User should see an error message login