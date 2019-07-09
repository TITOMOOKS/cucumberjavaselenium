Feature: Place an order in Tom's Sandwich
  @order01
  Scenario: user order burger from Tom's Sandwich

    Given user should be able to open the website
    When user should able to click to order now
    And user clicks the check box edison burger
    And user should be able to add to cart
    And user should be able to check out
    And user should enter the name and email
    And user should be able to submit
    Then thank you note should be displayed
    And user should see confirmation number and total amount on the screen



