Feature: Some of the general functionality verifications

  Scenario: Dropdown options verification
    Given user is already logged in to The Web table app
  When user is on the “Order” page
   Then user sees below options under “product” dropdown
     | MoneyCog   |
     | Familybea  |
     | Screenable |


    Scenario: Payment options verifications
      Given user is already logged in to The Web table app
      When user is on the “Order” page
      Then user sees VISA as enabled payment option
      Then user sees MASTERCARD as enabled payment option
      Then user sees AMERICANEXPRESS as enabled payment option


  Scenario: Order placement
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    Then user enters quantity "2"
    Then user clicks to the calculate button
    And user enters  customer name "Jane Doe"
    And user enters street "7th Street"
    And user enters city "New York"
    And user enters state "New York"
    And user enters zip "99999"
    And user selects payment option "American Express"
    And user enters credit card number "1111222211112222"
    And user enters expiration date "12/25"
    And user clicks to process order button
    Then user should see "Jane Doe" in the first row of the web table

@wip
  Scenario Outline: Order placement
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    Then user enters quantity "<productQuantity>"
    Then user clicks to the calculate button
    And user enters  customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<cityName>"
    And user enters state "<stateName>"
    And user enters zip "<zipCode>"
    And user selects payment option "<paymentOption>"
    And user enters credit card number "<creditCardNumber>"
    And user enters expiration date "<expDate>"
    And user clicks to process order button
    Then user should see "<expectedName>" in the first row of the web table
    Examples: data that will be added to this scenario outline
      | productQuantity | customerName | street     | cityName | stateName | zipCode | paymentOption    | creditCardNumber | expDate | expectedName |
      | 2               | Jane Doe     | 7th Street | New York | New York  | 99999   | American Express | 1111111111111111 | 07/24   | Jane Doe     |
      | 2               | John Doe     | 7th Street | New York | New York  | 99999   | American Express | 1111111111111111 | 07/24   | John Doe     |

