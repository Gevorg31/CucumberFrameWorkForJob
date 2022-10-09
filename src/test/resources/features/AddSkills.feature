Feature: Adding different skills in Qualifications

  Background:
    Given user is logged in with admin credentials
    When admin user move cursor to first level Dashboard Tab Admin
    And admin user move cursor to second level Dashboard Tab Qualifications
    And admin user clicks on Skills option in dropdown

  @Andrei
  Scenario Outline: scenario of adding different skills in Qualifications
    When admin user add new skills "<skillName>" "<skillDescription>"
    Then all new skills has been added successfully "<skillName>" "<skillDescription>"
    Examples:
      | skillName    | skillDescription                              |
      | Hard Worker  | Ability to work hard                          |
      | Good teacher | Ability to teach                              |
      | Sleep less   | Ability to sleep less in order to work harder |
