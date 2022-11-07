Feature: Web table user order feature

  Background:
    Given user is already logged in and on order page

  Scenario: User should be able to place order and order seen in web table
    When user selects product type "Familybea"
    And user enters quantity 2
    And user enters customer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects credit card type "american express"
    And user enters credit card number "1111222233334444"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table



  Scenario Outline: User should be able to place order and order seen in web table
    When user selects product type "<productType>"
    And user enters quantity "<quantity>"
    And user enters customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zipcode>"
    And user selects credit card type "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiry date "<expDate>"
    And user enters process order button
    Then user should see "<customerName>" in first row of the web table


    Examples: Valerchiki
      | productType | quantity | customerName    | street             | city   | state   | zipcode | cardType         | cardNumber       | expDate |
      | Familybea   | 2        | Sherlock Holmes | 221B Baker Street  | London | England | 50505   | american express | 1111222233334444 | 12/23   |
      | MoneyCog    | 1        | Jackie Charm    | 111B Cookie Street | Tokyo  | Japan   | 50606   | Visa             | 1111222233335555 | 10/28   |
      | Screenable  | 3        | Don Don         | 331B Soup Street   | Warsaw | Poland  | 50707   | MasterCard       | 1111222233336666 | 11/12   |



    Examples: Valerchiki
      | productType | quantity | customerName | street             | city   | state   | zipcode | cardType         | cardNumber       | expDate |
      | Familybea   | 2        | Sher Hol     | 221B Baker Street  | London | England | 50505   | american express | 1111222233334444 | 12/23   |
      | MoneyCog    | 1        | Jac Cha      | 111B Cookie Street | Tokyo  | Japan   | 50606   | Visa             | 1111222233335555 | 10/28   |
      | Screenable  | 3        | Do Do        | 331B Soup Street   | Warsaw | Poland  | 50707   | MasterCard       | 1111222233336666 | 11/12   |








