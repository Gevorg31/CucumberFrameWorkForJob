
Feature:Add Emergency Contacts

  Background:
    Given user is logged in with admin credentials
    When admin user clicks on PIM button
    And admin user clicks on Add Employee button
    And admin user enters "Bug" "Buster" and "Group"
    And admin user click on save button
    Then employee added successfully

@Ayna
  Scenario Outline: Admin user should be able to add employees Emergency Contacts
    When admin user click on Emergency Contacts and on add button
    And admin user enters "<Name>" and "<Relationship>" and "<Home Telephone>" and "<Mobile>" and "<Work Telephone>"
    And admin user clicks on save button on Emergency Contacts page
    Then employees Emergancy Contact "<Name>" added successfully
    Examples:
      |Name     |Relationship|Home Telephone|Mobile    |Work Telephone|
      |Joe Black|Son         |7857645467    |6462340987|7852543678    |

