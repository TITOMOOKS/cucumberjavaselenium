Feature: functionality of menu tab
  @menu01
  Scenario: menu tab is clickable

    When user enter the website as a user
    Then user current url must be in home page
    And user should be able to click to menu tab

  @menu02
  Scenario: all the sandwich collection is clickable

    When user is on the menu page
    Then user should be able to click the sandwich
    And  user should able to go to order now page

  @menu03
  Scenario: launching to Order Now Page
    When user launched to menu tab
    Then user should be able to click "The Tesla Turkey Club"
    And user should be able to go to "Order Your Meal" page

  @menu04
  Scenario: all the radio buttons are clickable

    When user in "Order Now" page
    Then user should be able to select each radio buttons
    And user should able to click to "Add To Cart"

