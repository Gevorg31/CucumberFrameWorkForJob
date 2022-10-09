
@Olena25
Feature: Add languages in qualifications

Background:
    Given user is logged in with admin credentials
    When admin user navigates to Qualifications


  Scenario: adding languages using data table
    Then  admin user selects Languages Tab
    When admin user adds languages in qualifications and verify them that data is added successfully
      | language   |  |
      | Ukrainian  |  |
      | Spanish    |  |
      | Portuguese |  |
      | Chinese    |  |
      | English    |  |
      | Arabic     |  |
      | Mandarin   |  |