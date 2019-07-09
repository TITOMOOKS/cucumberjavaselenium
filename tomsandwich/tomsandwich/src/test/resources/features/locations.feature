Feature: User can navigate to each location page

  Background:
    Given User able to open Tom's Sandwich Shop website
    When Mouse over locations tab

@location01
  Scenario: User opens chicago location page

     And Clicks Chicago
     Then Opens Chicago location page

@location02
  Scenario: User open belfast location page

    And Clicks Belfast
    Then Opens Belfast location page

@location03
  Scenario: User open Buenos Aires

  And Clicks Buenos Aires
  Then Opens Buenos Aires location Page

  @location04
  Scenario: User open Philadelphia

    And Clicks Philadelphia
    Then Opens Philadelphia location page
