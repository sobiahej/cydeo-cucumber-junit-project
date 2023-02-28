Feature: Wikipedia search functionality

  User Story: As a user, when I am on the wikipedia search page
  I should be able to search anything and see relevant results

  Scenario: Search functionality title verification
  Given User is on Wikipedia home page
  When User types "Steve Jobs" in the wiki search box
  When User clicks wiki search button
  Then User sees "Steve Jobs" is in the wiki title

  Given User is on Wikipedia home page
  When User types "Steve Jobs" in the wiki search box
  When User clicks wiki search button
  Then User sees "Steve Jobs" is in the main header

  Given User is on Wikipedia home page
  When User types "Steve Jobs" in the wiki search box
  When User clicks wiki search button
  Then User sees "Steve Jobs" is in the image header

    Scenario Outline: Wikipedia Search Functionality with Scenario Outline
      Given User is on Wikipedia home page
      When User types "<SearchWord>" in the wiki search box
      When User clicks wiki search button
      Then User sees "<expectedTitle>" is in the wiki title
      Then User sees "<mainHeader>" is in the main header
      Then User sees "<imageHeader>" is in the image header
      @ceos
      Examples: search values we are going to be using in this scenario outlines
        | SearchWord      | expectedTitle   | mainHeader      | imageHeader     |
        | Steve Jobs      | Steve Jobs      | Steve Jobs      | Steve Jobs      |
        | Rosalind Brewer | Rosalind Brewer | Rosalind Brewer | Rosalind Brewer |
        | Sundar Pichai   | Sundar Pichai   | Sundar Pichai   | Sundar Pichai   |
      @scientists
      Examples:
        | SearchWord      | expectedTitle   | mainHeader      | imageHeader     |
        | Marie Curie     | Marie Curie     | Marie Curie     | Marie Curie     |
        | Albert Einstein | Albert Einstein | Albert Einstein | Albert Einstein |