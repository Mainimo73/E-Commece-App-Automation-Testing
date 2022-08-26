@smoke

Feature:  F02_Login  |  user could login with valid data

   Scenario: guest user could login with valid email and password
     Given  user go to login page
    And    user enter  "test@example.com" and "P@ssw0rd"
    When  user press on login button
    Then   user login to the system successfully


  Scenario: user could login with invalid email and password
    Given  user go to login page
  And   user enter invalid "wrong@example.com" and "P@ssw0rd"
  When  user press on login button
  Then  user could not login to the system