Feature: Adding Employee's skills

  Background:
    Given user is logged in with admin credentials
    When admin user clicks on PIM button
    When admin user clicks on Add Employee button
    And admin user enters "Bug" "Buster" and "Group"
    And admin user click on save button

  @Andrei
  Scenario Outline: scenario of adding employee's skills
    When admin user clicks on Employee List button
    And admin user enter noted Employee ID
    And admin user clicks on Search button
    And admin user clicks on Employee with noted ID
    When admin user clicks on Qualifications button in employee sidebar
    When admin user clicks on Add button in Skills block
    And admin user select skill from DD, enters years and comments "<skill>" "<years>" "<comments>"
    And admin user click on Save button in Skills block
    Then skill has been added successfully "<skill>" "<years>" "<comments>"
    Examples:
      | skill       | years | comments                 |
      | Hard Worker | 7     | Definitely can work Hard |



