Feature: Etsy search functionality
  Agile story: As a user, when I am on the Etsy search page
  I should be able to search anything and see relevant results

  Scenario: Search page default title verification
    When  user is on the Etsy home page
    Then user sees title as expected
    #Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for
    #everyone


  Scenario:Etsy Search Functionality Title Verification
   Given user is on the Etsy home page
   When User types Wooden Spoon in the search box
   When User clicks search button
   Then User sees Wooden Spoon is in the title

  @Etsy
  Scenario:Etsy Search Functionality Title Verification
    Given user is on the "https://www.etsy.com" home page
    When User types "Wooden Spoon" in the search box
    When User clicks search button
    Then User sees "Wooden spoon - Etsy" is in the title