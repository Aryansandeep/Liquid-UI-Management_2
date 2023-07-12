@FourthTest
Feature: Purchased License Functionality in LiquidUi Portal
  Scenario Outline: Verify Purchased Licence Functionality working are not
    When I open the web browser and launch URL
    Then I should be able to enter valid "<emailid>" and valid "<password>" as Super Admin user
    Then Select One account From Exsisting Account
    Then Click on Purchased license tab
    Then Click on Buy License tab
    And verify Export Tab
    Then I Sing Out the Super Admin user in Login page
    Then I quit the browser
    Examples:
      | emailid                 | password |
      | a.sankeerthana@guixt.com| 123      |