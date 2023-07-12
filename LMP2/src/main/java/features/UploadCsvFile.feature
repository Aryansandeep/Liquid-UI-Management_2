@EightTest
Feature: Upload from CSV file functionality of Liquid UI web for cloud
  Scenario Outline: Verify Add User Upload from CSV file as a Liquid UI web
    When I open the web browser and launch URL
    Then I should be able to enter valid "<emailid>" and valid "<password>" as Super Admin user
    Then click any Existing Account
    And click Add user tab
    Then Click Upload from CSV file
    Then verify Error All users were already uploaded
    Then click Sing Out the Super Admin  Login page
    Then I quit the browser
    Examples:
      | emailid                 | password |
      | a.sankeerthana@guixt.com| 123      |