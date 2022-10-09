Feature: Add licenses

  Background:
    Given user is logged in with admin credentials

  @serge1
  Scenario Outline: admin user should be able to add licenses
    When admin user navigates to Qualifications
    And admin user selects Licenses
    And admin user add new "<licenseName>"
    Then verify new "<licenseName>" is created
    Examples:
    |licenseName|
    |NASA       |
    |Roskosmos  |

