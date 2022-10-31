Feature: Wikipedia Search Functionality Title Verification


  Background:
    Given User is on Wikipedia home page

  Scenario:
#    Given User is on Wikipedia home page
    When User types Steve Jobs in the wiki search box
    And User clicks wiki search button
    Then User sees Steve Jobs is in the wiki title

  Scenario:
#    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title

  Scenario:
#      Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header

  Scenario:
#    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the image header


  Scenario Outline: Wikipedia Search Functionality Title Verification with using DDT(Data Driven Test)
#      Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the image header

    Examples:
      | searchValue       | expectedTitle     |
      | Steve Jobs        | Steve Jobs        |
      | Bill Gates        | Bill Gates        |
      | Elon Musk         | Elon Musk         |
      | Albert Einstein   | Albert Einstein   |
      | Chuck Norris      | Chuck Norris      |
      | Alisher Usmanov   | Alisher Usmanov   |

