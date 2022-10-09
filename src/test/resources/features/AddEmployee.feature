@addEmployee
Feature: Add Employee

  Background: 
    Given user is logged with valid admin credentials
    And user navigates to AddEmployeePage

  @smoke @sprint5
  Scenario: Add Employee with first and lastname
    When user enters employees "John" and "Doe"
    And user clicks save button
    Then "John Doe" is added successfully

  @regression
  Scenario: Add Employee without employee id
    When user enters employees "Jane" and "Smith"
    And user deletes employee id
    And user clicks save button
    Then "Jane Smith" is added successfully

  @regression
  Scenario: AddEmployee and create Login Credentials
    When user enters employees "James" and "Smith"
    And user clicks on create login checkbox
    And user enters login credentials as "James123" and "James123.."
    And user clicks save button
    Then "James Smith" is added successfully

  @regression
  Scenario: Adding multiple employees
    When user enters employee details and click on save then employee is added
      | FirstName | MiddleName | LastName |
      | John      | J          | Doe      |
      | Jane      | J          | Smith    |

  @regression
  Scenario: Adding multiple employees from excel
    When user enters employee data from "EmployeeLoginCredentials" excel sheet then employee is added
