Feature: To Test the Adactin Web Application

  @Smoke
  Scenario Outline: To Test and Verify the hotel booking functionality
    Given User has to verify whether he navigated to the prope urlr "<url>"
    When User has to enter the Username "<Username>" & Password "<Password>"
    Then User has to click the login button to enter into home page

    Examples: 
      | url                           | Username | Password     |
      | https://adactin.com/HotelApp/ | GOWTHAMK | Myvizhi@1194 |

  @Smoke
  Scenario Outline: User has to test the Search Hotel functionality
    Given User is in the search hotel page
    When User has to feed the location "<location>"
    And User has to feed the hotel name "<hotel>"
    And User has to feed the room type "<roomType>"
    And User has to feed the number of rooms "<noOfRooms>"
    And User has to feed the number of Adults "<Adults>"
    And User has to feed the number of Childrens "<Childrens>"
    Then User has to click the search button in order to search for the requirements

    Examples: 
      | location | hotel          | roomType     | noOfRooms | Adults  | Childrens |
      | London   | Hotel Sunshine | Super Deluxe | 1 - One   | 2 - Two | 1 - One   |

  @Smoke
  Scenario Outline: User has to confirm the details in the Prebook page
    Given User is in the confirmation details page "<text1>"
    When User has to click the select button "<text2>"
    Then User has to click the Continue button and verify whether he gets navigated to the booking page

    Examples: 
      | text1                                    | text2                          |
      | User is in the prebook confirmation page | User clicked the select button |

  @TicketGeneration
  Scenario Outline: User has to test the final booking page
    Given User is in the booking page
    When User has to feed the First name "<firstName>"
    And User has to feed the Last name "<lastName>"
    And User has to feed the Billing address "<billingAddress>"
    And User has to feed the Credit card number "<creditCardNumber>"
    And User has to feed the Credit card type "<creditCardType>"
    And User has to feed the Expiry month "<expiryMonth>"
    And User has to feed the Expiry year "<expiryYear>"
    And User has to feed the cvv "<cvv>"
    And User has to click the book now button and check verify whether the ticket has been booked
    Then User has to print the unique generated ticket ID

    Examples: 
      | firstName | lastName | billingAddress                                               | creditCardNumber | creditCardType | expiryMonth | expiryYear | cvv |
      | Gowtham   | K        | 230 B1, Sunrise home, Peranthar kadu, Komarapalayam - 638183 | 4578957812485967 | VISA           | February    |       2022 | 154 |
