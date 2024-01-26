Feature:

  Background:
    Given  user logs in Cashwise account


  Scenario: User creates a new account with invalid phone number without last 3digits
    Given  user logs in Cashwise account
    When  user clicks on the Admin Codewise drop menu
    And user selects the Create Account option
    And And the user enters new account all the valid fields
      | Field            | Value                |
      | Name             | madina               |
      | Surname          | Gaga                 |
      | Email            | madinabcaabb@example.com |
      | Password         | madina123            |
      | Confirm Password | madina123            |
      | Role             | Admin                |

    And  user enters an invalid phone number with only zeros "2134521"
    And user clicks on the Create button


  Scenario: Validate user can create new account  with invalid name fields

    When  clicks on the Admin Codewise drop menu
    And selects the Create Account option
    Then enters invalid name "$$$$$$$$$$$$$$$$$$"
    And And the user enters new account details
      | Field            | Value              |
      | Surname          | nnn                |
      | Email            | aaacdbbaa.de@example.com |
      | Phone Number     | 345678900          |
      | Password         | SecurePassword123  |
      | Confirm Password | SecurePassword123  |
    And the user clicks on the Create button

