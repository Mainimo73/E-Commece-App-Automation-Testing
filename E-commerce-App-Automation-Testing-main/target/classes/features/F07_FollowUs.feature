@smoke

Feature:  F07_FollowUs  |  user could followUs

  Scenario: user opens facebook link
    Given customer navigate to facebook
    Then  link is opened in new tab for facebook

    Scenario: user opens twitter link
    Given   customer navigate to twitter
    Then  link is opened in new tab for twitter


  Scenario: user opens rss link
    Given   customer navigate to rss
    Then  link is opened in new tab for rss

  Scenario: user opens youtube link
    Given   customer navigate to youtube
    Then  link is opened in new tab for youtube


