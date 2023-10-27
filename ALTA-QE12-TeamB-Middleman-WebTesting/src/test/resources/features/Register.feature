@Tugas
Feature: User Register

  @Register_Successful
  Scenario: Successful Register
    Given User open the website Middleman Register
    When User input "Yooo" as a shopName "yoo@gmail.com" as a email "1212" as a password "12131242353543" as a phoneNumber "asasas" as an address
    And User should see an success message register

  @RegisterFailed
  Scenario: Failed registration with invalid Number
    Given User open the website Middleman Register
    When User input "Yooo" as a shopName "yooass@gmail.com" as a email "1212" as a password "12" as a phoneNumber "asasas" as an address
    Then User should see an error message register

#  Scenario: Failed registration with empty fields
#    Given User open the website Middleman Register
#    When User input "" as a shopName "" as a email "" as a password "" as a phoneNumber "" as an address
#    Then User should see an error message register
