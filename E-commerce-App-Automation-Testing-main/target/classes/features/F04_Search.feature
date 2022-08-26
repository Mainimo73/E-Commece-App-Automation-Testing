@smoke
Feature:  F04_Search  |  any user could search about any product

  Scenario:  user could search about products names successfully
    Given  user write "laptop" in search tab
    When   enter on search button
    Then   make sure that link contain the mentioned link
    And    get the number of products and make sure that every result contain the product name





#  Scenario:  user could search about products sku successfully
#    Given  user go to search tab
#    When   user write any product sku
#    Then   enter on search button
#    And    appeares all products that contains the search name
