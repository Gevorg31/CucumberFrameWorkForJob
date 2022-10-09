
@addEmployee
Feature: Add Employee Job Details
  Background:
    Given user is logged in with admin credentials
    When admin user clicks on PIM button
    And admin user clicks on Add Employee button
    And admin user enters "Bug" "Buster" and "Group"
    And admin user click on save button

    When admin user navigates to Employee List
    And admin user searches an employee by employee name
    And admin user clicks on searched employee
    Then personal details page is displayed


	@regression
  Scenario: Admin user is able to add employee's current job details
    When admin user clicks on Job tab
    And admin user clicks on Edit button
    Then admin user selects  Job Title from dropdown
    And admin user selects Employment Status from dropdown
    And admin user selects Job Category from dropdown
    And admin user selects Joined Date "2021-07-01" from calendar
    And admin user selects  Sub Unit from dropdown
    And admin user selects Location from dropdown
    And admin user selects Start Date "2021-07-01" from calendar
    And admin user selects End Date "2022-01-01" from calendar
    And admin user selects file to upload and uploads this file
    Then admin user clicks on save button


