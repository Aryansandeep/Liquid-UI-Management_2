@secondTest
Feature: Super admin can create a Account in LiquidUI LMP Portal
  Scenario Outline: verify Super admin can create License account
    When I open the web browser and launch URL
    Then I should be able to enter valid "<emailid>" and valid "<password>" as Super Admin user
    Then verify Admin Dashboard
    Then Click an arrow
    And  Click Create Account Tab
    And verify search text field
    Then click Edit Button
    And verify Edit Account
    And verify Export Tab
    Then I Sing Out the Super Admin user in Login page
    Then I quit the browser

    Examples:
      | emailid                 | password |
      | a.sankeerthana@guixt.com| 123      |