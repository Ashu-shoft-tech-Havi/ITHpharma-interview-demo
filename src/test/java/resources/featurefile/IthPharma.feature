Feature: Register Page Testing
  /**
  * Created by Ashish Mor
  */


  Scenario: As a user i want to verify Home page
    Given As a user I am on Homepage
    When I click On Home
    And I verify text "COVID 19"
    And I click On registered Page
    And I enter Username "Himesh"
    And I enter Password "Himesh007@"
    And I enter Confrim Password " Himesh007 "
    And I enter FullName "Ashish M mor"
    And I enter Email Adress "Ashsihmor0757@gmail.com "
    And I enter Hospital Name "Barnet Hospital"
    And I click on registered button
    Then I verify texta "Passwords do not match"


