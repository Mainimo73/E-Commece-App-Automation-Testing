@smoke

  Feature: F05_Hover | users could hover on any category

    Scenario: user can choose any category using hover feature
      Given  customer cane make hover fo example "Computers" category
      When   select one of the three sub categories like "Software" sub category
      Then  get text of page for sub category and assert that the it title is equal or contains the result from get text

