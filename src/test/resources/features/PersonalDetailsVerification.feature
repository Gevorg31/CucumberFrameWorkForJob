Feature: PersonalDetailVerification

  Background:
    Given user is logged in with admin credentials
    When admin user clicks on PIM button
    And admin user clicks on Add Employee button
    And admin user enters "Bug" "Buster" and "Group"
    And admin user click on save button
    Then employee added successfully

@Oxana
  Scenario: scenario of verification of personal details
    And user clicks on ContactDetails button
    When user clicks on Edit button
    And user enters address1 "Prospect Pobedy"
    And user enters address2 "345-78"
    And user enters city "Vladivostok"
    And user enters state province "Africa"
    And user enters zip "2949"
    And user selects country "Brazil"
    When user enters home telephone "355533"
    When user enters mobile "049585485"
    When user enters work telephone "865673"
    When user enters work email "sobaka@gmail.com"
    When user enters other email "admin2@example.com"
    When user clicks on save button
    Then employee details fields are displayed and editable

