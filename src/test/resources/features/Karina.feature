Feature: Verify if user is able to create and Download PDF format invoice

  Background:
    Given  user logs in Cashwise account


  Scenario: Create Invoice
    Given user clicks to create invoice button
    Then user enters all the valid fields
    And user have to select product or service
    And user clicks to save  button

    Scenario: Download PDF format invoice
      Given user chooses the first invoice
      Then  user click on three dots
      Then user clicks on show PDF version
      And user scroll up and clicks to Download PDF

