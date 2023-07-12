@SixthTest
Feature: Get the user History when we click on User History tab
  Scenario Outline: Verify user history module
    When I open the web browser and launch URL
    Then I should be able to enter valid "<emailid>" and valid "<password>" as Super Admin user
    Then click any Existing Account
    Then  Click License Information tab
    Then  click on user history tab
    And Click Export Tab
    Then I Sing Out the Super Admin user in Login page
    Then I quit the browser

    Examples:
      | emailid                 | password |
      | a.sankeerthana@guixt.com| 123      |