Feature: Admin user is able to add any available languages to any employee

  Background:
    Given user is logged in with admin credentials
    When admin user clicks on PIM button
    And admin user clicks on Add Employee button
    And admin user enters "Bug" "Buster" and "Group"
    And admin user click on save button
    Then employee added successfully in Employee List

  @addLanguage
  Scenario Outline: add any available languages to any employee
    When admin user clicks on PIM button
    And admin user navigates to Employee List
    And admin user enter noted Employee ID
    And admin user clicks on searched employee
    Then personal details page is displayed
    When admin user clicks on Qualifications tab
    And admin user clicks on Add button in Languages block
    When admin user fills the Add Language window form with "<Language>" "<Fluency>" "<Competency>" "<Comments>"
    And  admin user click on Save button in Language block
    Then added information "<Language>" "<Fluency>" "<Competency>" "<Comments>" is displayed in the Language data table
    Examples:
      | Language  | Fluency  | Competency | Comments                          |
      | Ukrainian | Speaking | Good       | Kakoy besporyadok na etom WebSite |
