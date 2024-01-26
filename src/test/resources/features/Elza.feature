Feature: verify that user should not be able to create a new account
with incorrect credentials



  Scenario Outline: verify LogIn functionality
    Given user go on "https://cashwise.us/main"
    When user clicks on SignIn button
    Then user clicks on email line and delete previous users credential
    Then user add correct "<email>"
    Then user clicks on password line and delete previous users credential
    Then user insert correct "<password>"
    And user clicks on SignIn2 button

    Examples:
      | email           | password  |
      | 77777@gmail.com | 123456789 |


Scenario: check if it is possible to change language of the app
  Given user clicks on change language dropdown
  When user choose russian language
  Then user scrolldown the page to verify that all main page now in russian language
  Then user clicks on Sales button
  Then user checks Expenses button
  Then user clicks on Reports button
  Then user choose invoices from Reports page
  Then user clicks on income category
  Then user edit english note
  Then user print name in Russian language
  And user clicks on save
  And user change back for English language