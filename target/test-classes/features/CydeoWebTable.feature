Feature: Login Scenario
  Agile Story: As s user, I should be able to login to the
  cydeo web tables page


  Scenario: login verification
    When user is on the cydeo Web Tables page
    When user enters username
    When user enters password
    Then user sees URL should end with orders

  Scenario: login verification
    When user is on the cydeo Web Tables page
    When user enters username "Test"
    When user enters password "Tester"
    Then user sees URL should end with "orders"
  @CydeoLogin
  Scenario: login verification
    When user is on the cydeo Web Tables page
    When user enters correct credentials
      | username | Test   |
      | password | Tester |
    Then user sees URL should end with "orders"