@SeventhTest
Feature:SAP connections in LMP
  Scenario Outline: Verify SAP connections to an account
    When I open the web browser and launch URL
    Then I should be able to enter valid "<emailid>" and valid "<password>" as Super Admin user
    Then click any Existing Account
    Then Click on SAP Connection Tab
    Then Click on Create Connection button
    Then Modify the Sap connection details
    And  Remove the sap connection
    Then Click on Update Connection Button
    Then click close button in sap connection page
    Then I Sing Out the Super Admin user in Login page
    Then I quit the browser

    Examples:
      | emailid                 | password |
      | a.sankeerthana@guixt.com| 123      |