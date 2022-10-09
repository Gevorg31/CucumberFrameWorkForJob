Feature: Adding Employee's membership

  Background:
    Given user is logged in with admin credentials
    When admin user clicks on PIM button
    When admin user clicks on Add Employee button
    And admin user enters "Bug" "Buster" and "Group"
    And admin user click on save button

  @Andrei
  Scenario Outline: scenario of adding employee's membership
    When admin user clicks on Employee List button
    And admin user enter noted Employee ID
    And admin user clicks on Search button
    And admin user clicks on Employee with noted ID
    When admin user clicks on Memberships button in employee sidebar
    When admin user clicks on Add button in Assigned Memberships block
    And admin user select "<membership>", "<paidBy>", "<currency>", "<commenceDate>", "<renewalDate>", enters "<amount>"
    And admin user click on Save button in Add Membership block
    Then membership has been added successfully "<membership>" "<paidBy>" "<currency>" "<commenceDate>" "<renewalDate>" "<amount>"
    Examples:
      | membership | paidBy     | currency | commenceDate | renewalDate | amount |
      | Soccer     | Individual | USD      | 2020-05-20   | 2021-05-20  | 99     |