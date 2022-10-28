Feature: Etsy Title Verification
  User story: As an user when I'm on the etsy page
  I should see title is as expected

  Background: User on the Etsy page
    Given User on the Etsy page

  Scenario: Etsy Title Verification
    When User looks on the current page tab
    Then User should see "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone"

    Scenario: Etsy Search functionalities
      When User types Wooden Spoon in the search box
      Then User clicks search button
      Then User sees "Wooden spoon" is in the title