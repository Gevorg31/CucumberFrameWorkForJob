Feature: Terminate employment

  Background:
    Given user is logged in with admin credentials
    When admin user clicks on PIM button
    And admin user clicks on Add Employee button
    And admin user enters "Bug" "Buster" and "Group"
    And admin user click on save button
    Then employee added successfully in Employee List

  @terminateEmployment
  Scenario Outline: terminating an employee employment
    When admin user clicks on PIM button
    And admin user navigates to Employee List
    And admin user enter noted Employee ID
    And admin user clicks on searched employee
    Then personal details page is displayed
    When admin user clicks on Job tab
    And admin user click on Terminate Employment button
    And admin user fills the Termination window form with "<Reason>" and "<Date>" and "<Note>"
    And click on Confirm button
    Then specified employee is terminated
    And following data is displayed in Termination window stamp "<Reason>" "<Date>" "<Note>"
    Examples:
      | Reason    | Date       | Note                                |
      | Dismissed | 2021-11-25 | Dismissed due to insufficient funds |
