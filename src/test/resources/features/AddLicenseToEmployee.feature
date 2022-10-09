Feature: Add License to Employee

  Background:
    Given user is logged in with admin credentials
    When admin user clicks on PIM button
    And admin user clicks on Add Employee button
    And admin user enters "Bug" "Buster" and "Group"
    And admin user click on save button
    Then employee added successfully
    When admin user clicks on Employee List button
    And admin user enter noted Employee ID
    And admin user clicks on Search button
    And admin user clicks on Employee with noted ID

  @serge2
  Scenario: admin should be able to add license to employee
    When admin user clicks on Qualifications tab
    And admin user clicks on Add button in License block
    Then admin user checks licenses fields are displayed
    Then admin user selects "QA Tester" and enters "2020115" "2021-11-10" "2022-11-10" for checking editable
