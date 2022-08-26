@smoke

Feature: F01_Register | users could register with new accounts

  Scenario: guest user could register with valid data successfully
    Given user go to register page
    And   user select gender type
    When   user enter "automation" and "tester"
    And    user enter date of birth
    Then   user enter email "test@example.com" field
    And   user fills Password fields "P@ssw0rd" and "P@ssw0rd"
    And   user clicks on register button
    And   success message is displayed

