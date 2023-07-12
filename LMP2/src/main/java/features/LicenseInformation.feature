@FifthTest
Feature: LMP provides  the complete information about the licenses of Liquid UI web for cloud
  Scenario Outline: Verify License Information for User  as a Liquid UI web
    When I open the web browser and launch URL
    Then I should be able to enter valid "<emailid>" and valid "<password>" as Super Admin user
    And I Click Any Account
    Then I Click License Information tab
    Then Verify License Information Table
    Then Search for valid mailid
    Then Search for Company name
    Then Search for Device Identifier
    And Search for Status
    Then Click any mail id and check License pack validity
    And Click Export Tab
    Then I Sing Out the Super Admin user in Login page
    Then I quit the browser
    Examples:
      | emailid                 | password |
      | a.sankeerthana@guixt.com| 123      |





