@firstTest
Feature: Login functionality of Liquid UI web for cloud
  Scenario Outline: Verify Admin is able to successfully login as a Liquid UI web
    When I open the web browser and launch URL
    Then Verify the LIQUIDUI for SAP ERP image
    Then Verify the Create user link
    Then Verify the Privacy Policy link
    Then Verify the Terms of Use link
    Then I should be able to enter valid "<emailid>" and valid "<password>" as Super Admin user
    And Edit profile
    Then I Sing Out the Super Admin user in Login page
    Then I quit the browser

    Examples:
      | emailid                 | password |
      | a.sankeerthana@guixt.com| 123      |
