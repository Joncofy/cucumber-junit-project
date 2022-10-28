Feature: Wikipedia Search Functionality Title Verification



  Scenario:
    Given User is on Wikipedia home page
    When User types Steve Jobs in the wiki search box
    And User clicks wiki search button
    Then User sees Steve Jobs is in the wiki title

  Scenario:
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title

    Scenario:
      Given User is on Wikipedia home page
      When User types "Steve Jobs" in the wiki search box
      And User clicks wiki search button
      Then User sees "Steve Jobs" is in the main header

  Scenario:
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the image header


