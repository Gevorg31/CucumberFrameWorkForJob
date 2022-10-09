Feature: Add Employee Work Experience
  Background:
    Given user is logged in with admin credentials
    When admin user clicks on PIM button
    And admin user clicks on Add Employee button
    And admin user enters "Bug" "Buster" and "Group"
    And admin user click on save button
    Then employee added successfully

  @Elena1
  Scenario: Admin user is able to add employee's work experience details
    When admin user clicks on Employee List button
    And admin user enter noted Employee ID
    And admin user clicks on searched employee
    Then personal details page is displayed
    When admin user clicks on Qualifications button in employee sidebar
    And admin user clicks on Add button in Work Experience block
    Then admin user enters Company name
    And admin user enters Job tittle
    And admin user selects From Date from calendar
    And admin user selects To Date from calendar
    And admin user adding comments in comment box
    Then admin user clicks on Save button
