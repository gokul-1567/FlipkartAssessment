Feature: To Validate Add To Cart Feature

  Background: 
    Given User has to launch the browser and flipkart application

  Scenario: To validate product search functionality in flipkart
    When User has to search the product through search box
    And User has to select and adding product into cart
    Then User has to close the browser

  Scenario: To validate login functionality in flipkart
    When User has to click login button
    When User has to enter mobile number in required field
    When User has to click request otp button
