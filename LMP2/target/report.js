$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CreateAccount.feature");
formatter.feature({
  "line": 2,
  "name": "Super admin can create a Account in LiquidUI LMP Portal",
  "description": "",
  "id": "super-admin-can-create-a-account-in-liquidui-lmp-portal",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@secondTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 3,
  "name": "verify Super admin can create License account",
  "description": "",
  "id": "super-admin-can-create-a-account-in-liquidui-lmp-portal;verify-super-admin-can-create-license-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I open the web browser and launch URL",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I should be able to enter valid \"\u003cemailid\u003e\" and valid \"\u003cpassword\u003e\" as Super Admin user",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "verify Admin Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click an arrow",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click Create Account Tab",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "verify search text field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click Edit Button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "verify Edit Account",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "verify Export Tab",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I Sing Out the Super Admin user in Login page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I quit the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "super-admin-can-create-a-account-in-liquidui-lmp-portal;verify-super-admin-can-create-license-account;",
  "rows": [
    {
      "cells": [
        "emailid",
        "password"
      ],
      "line": 17,
      "id": "super-admin-can-create-a-account-in-liquidui-lmp-portal;verify-super-admin-can-create-license-account;;1"
    },
    {
      "cells": [
        "a.sankeerthana@guixt.com",
        "123"
      ],
      "line": 18,
      "id": "super-admin-can-create-a-account-in-liquidui-lmp-portal;verify-super-admin-can-create-license-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "verify Super admin can create License account",
  "description": "",
  "id": "super-admin-can-create-a-account-in-liquidui-lmp-portal;verify-super-admin-can-create-license-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@secondTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I open the web browser and launch URL",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I should be able to enter valid \"a.sankeerthana@guixt.com\" and valid \"123\" as Super Admin user",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "verify Admin Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click an arrow",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click Create Account Tab",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "verify search text field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click Edit Button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "verify Edit Account",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "verify Export Tab",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I Sing Out the Super Admin user in Login page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.iOpenBrowUrl()"
});
formatter.result({
  "duration": 16424352900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "a.sankeerthana@guixt.com",
      "offset": 33
    },
    {
      "val": "123",
      "offset": 70
    }
  ],
  "location": "LoginPageSteps.loginAsValiUser(String,String)"
});
formatter.result({
  "duration": 8423169700,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountPageSteps.verify_Admin_Dashboard()"
});
formatter.result({
  "duration": 496414200,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountPageSteps.click_an_arrow()"
});
formatter.result({
  "duration": 203307000,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountPageSteps.verify_Create_Account_Tab()"
});
formatter.result({
  "duration": 23593226100,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountPageSteps.verify_search_text_field()"
});
formatter.result({
  "duration": 6627620000,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountPageSteps.click_Edit_Button()"
});
formatter.result({
  "duration": 10900326400,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountPageSteps.verify_Edit_Account()"
});
formatter.result({
  "duration": 78300,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountPageSteps.verify_Export_Tab()"
});
formatter.result({
  "duration": 70230067100,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.isingOutLoginPage()"
});
formatter.result({
  "duration": 1943855200,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iQuitTheBrowser()"
});
formatter.result({
  "duration": 913212900,
  "status": "passed"
});
formatter.uri("LicenseInformation.feature");
formatter.feature({
  "line": 2,
  "name": "LMP provides  the complete information about the licenses of Liquid UI web for cloud",
  "description": "",
  "id": "lmp-provides--the-complete-information-about-the-licenses-of-liquid-ui-web-for-cloud",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FifthTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify License Information for User  as a Liquid UI web",
  "description": "",
  "id": "lmp-provides--the-complete-information-about-the-licenses-of-liquid-ui-web-for-cloud;verify-license-information-for-user--as-a-liquid-ui-web",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I open the web browser and launch URL",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I should be able to enter valid \"\u003cemailid\u003e\" and valid \"\u003cpassword\u003e\" as Super Admin user",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I Click Any Account",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I Click License Information tab",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Verify License Information Table",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Search for valid mailid",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Search for Company name",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Search for Device Identifier",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Search for Status",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click any mail id and check License pack validity",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Click Export Tab",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I Sing Out the Super Admin user in Login page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I quit the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "lmp-provides--the-complete-information-about-the-licenses-of-liquid-ui-web-for-cloud;verify-license-information-for-user--as-a-liquid-ui-web;",
  "rows": [
    {
      "cells": [
        "emailid",
        "password"
      ],
      "line": 18,
      "id": "lmp-provides--the-complete-information-about-the-licenses-of-liquid-ui-web-for-cloud;verify-license-information-for-user--as-a-liquid-ui-web;;1"
    },
    {
      "cells": [
        "a.sankeerthana@guixt.com",
        "123"
      ],
      "line": 19,
      "id": "lmp-provides--the-complete-information-about-the-licenses-of-liquid-ui-web-for-cloud;verify-license-information-for-user--as-a-liquid-ui-web;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "Verify License Information for User  as a Liquid UI web",
  "description": "",
  "id": "lmp-provides--the-complete-information-about-the-licenses-of-liquid-ui-web-for-cloud;verify-license-information-for-user--as-a-liquid-ui-web;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FifthTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I open the web browser and launch URL",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I should be able to enter valid \"a.sankeerthana@guixt.com\" and valid \"123\" as Super Admin user",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I Click Any Account",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I Click License Information tab",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Verify License Information Table",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Search for valid mailid",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Search for Company name",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Search for Device Identifier",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Search for Status",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click any mail id and check License pack validity",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Click Export Tab",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I Sing Out the Super Admin user in Login page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.iOpenBrowUrl()"
});
formatter.result({
  "duration": 14787043200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "a.sankeerthana@guixt.com",
      "offset": 33
    },
    {
      "val": "123",
      "offset": 70
    }
  ],
  "location": "LoginPageSteps.loginAsValiUser(String,String)"
});
formatter.result({
  "duration": 8081590300,
  "status": "passed"
});
formatter.match({
  "location": "LicenseInformationPageSteps.i_Click_Any_Account()"
});
formatter.result({
  "duration": 373068100,
  "status": "passed"
});
formatter.match({
  "location": "LicenseInformationPageSteps.iClickLiceInformation_tab()"
});
formatter.result({
  "duration": 2452961300,
  "status": "passed"
});
formatter.match({
  "location": "LicenseInformationPageSteps.vryLiceInfoTable()"
});
formatter.result({
  "duration": 1212551500,
  "status": "passed"
});
formatter.match({
  "location": "LicenseInformationPageSteps.search_for_valid_mailid()"
});
formatter.result({
  "duration": 2336069400,
  "status": "passed"
});
formatter.match({
  "location": "LicenseInformationPageSteps.search_for_Company_name()"
});
formatter.result({
  "duration": 840643300,
  "status": "passed"
});
formatter.match({
  "location": "LicenseInformationPageSteps.search_for_Device_Identifier()"
});
formatter.result({
  "duration": 1253959800,
  "status": "passed"
});
formatter.match({
  "location": "LicenseInformationPageSteps.search_for_Status()"
});
formatter.result({
  "duration": 2596975100,
  "status": "passed"
});
formatter.match({
  "location": "LicenseInformationPageSteps.click_any_mail_id_and_check_License_pack_validity()"
});
formatter.result({
  "duration": 744280400,
  "status": "passed"
});
formatter.match({
  "location": "LicenseInformationPageSteps.click_Export_Tab()"
});
formatter.result({
  "duration": 8442917900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.isingOutLoginPage()"
});
formatter.result({
  "duration": 697523400,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iQuitTheBrowser()"
});
formatter.result({
  "duration": 1098378900,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login functionality of Liquid UI web for cloud",
  "description": "",
  "id": "login-functionality-of-liquid-ui-web-for-cloud",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@firstTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify Admin is able to successfully login as a Liquid UI web",
  "description": "",
  "id": "login-functionality-of-liquid-ui-web-for-cloud;verify-admin-is-able-to-successfully-login-as-a-liquid-ui-web",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I open the web browser and launch URL",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Verify the LIQUIDUI for SAP ERP image",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Verify the Create user link",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Verify the Privacy Policy link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Verify the Terms of Use link",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should be able to enter valid \"\u003cemailid\u003e\" and valid \"\u003cpassword\u003e\" as Super Admin user",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Edit profile",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I Sing Out the Super Admin user in Login page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I quit the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "login-functionality-of-liquid-ui-web-for-cloud;verify-admin-is-able-to-successfully-login-as-a-liquid-ui-web;",
  "rows": [
    {
      "cells": [
        "emailid",
        "password"
      ],
      "line": 15,
      "id": "login-functionality-of-liquid-ui-web-for-cloud;verify-admin-is-able-to-successfully-login-as-a-liquid-ui-web;;1"
    },
    {
      "cells": [
        "a.sankeerthana@guixt.com",
        "123"
      ],
      "line": 16,
      "id": "login-functionality-of-liquid-ui-web-for-cloud;verify-admin-is-able-to-successfully-login-as-a-liquid-ui-web;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Verify Admin is able to successfully login as a Liquid UI web",
  "description": "",
  "id": "login-functionality-of-liquid-ui-web-for-cloud;verify-admin-is-able-to-successfully-login-as-a-liquid-ui-web;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@firstTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I open the web browser and launch URL",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Verify the LIQUIDUI for SAP ERP image",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Verify the Create user link",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Verify the Privacy Policy link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Verify the Terms of Use link",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should be able to enter valid \"a.sankeerthana@guixt.com\" and valid \"123\" as Super Admin user",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Edit profile",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I Sing Out the Super Admin user in Login page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.iOpenBrowUrl()"
});
formatter.result({
  "duration": 14476314000,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.vefyLiqUiImg()"
});
formatter.result({
  "duration": 44106000,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.verify_the_Create_user_link()"
});
formatter.result({
  "duration": 87052600,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.verifyPrvacyPolcyLnk()"
});
formatter.result({
  "duration": 1575787200,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.verifyTermUseLnk()"
});
formatter.result({
  "duration": 1562661100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "a.sankeerthana@guixt.com",
      "offset": 33
    },
    {
      "val": "123",
      "offset": 70
    }
  ],
  "location": "LoginPageSteps.loginAsValiUser(String,String)"
});
formatter.result({
  "duration": 8615047400,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.edit_profile()"
});
formatter.result({
  "duration": 11036654500,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.isingOutLoginPage()"
});
formatter.result({
  "duration": 4562869900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iQuitTheBrowser()"
});
formatter.result({
  "duration": 1086120700,
  "status": "passed"
});
formatter.uri("PurchasedLicense.feature");
formatter.feature({
  "line": 2,
  "name": "Purchased License Functionality in LiquidUi Portal",
  "description": "",
  "id": "purchased-license-functionality-in-liquidui-portal",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FourthTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify Purchased Licence Functionality working are not",
  "description": "",
  "id": "purchased-license-functionality-in-liquidui-portal;verify-purchased-licence-functionality-working-are-not",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I open the web browser and launch URL",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I should be able to enter valid \"\u003cemailid\u003e\" and valid \"\u003cpassword\u003e\" as Super Admin user",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Select One account From Exsisting Account",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click on Purchased license tab",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on Buy License tab",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "verify Export Tab",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I Sing Out the Super Admin user in Login page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I quit the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "purchased-license-functionality-in-liquidui-portal;verify-purchased-licence-functionality-working-are-not;",
  "rows": [
    {
      "cells": [
        "emailid",
        "password"
      ],
      "line": 13,
      "id": "purchased-license-functionality-in-liquidui-portal;verify-purchased-licence-functionality-working-are-not;;1"
    },
    {
      "cells": [
        "a.sankeerthana@guixt.com",
        "123"
      ],
      "line": 14,
      "id": "purchased-license-functionality-in-liquidui-portal;verify-purchased-licence-functionality-working-are-not;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Verify Purchased Licence Functionality working are not",
  "description": "",
  "id": "purchased-license-functionality-in-liquidui-portal;verify-purchased-licence-functionality-working-are-not;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FourthTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I open the web browser and launch URL",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I should be able to enter valid \"a.sankeerthana@guixt.com\" and valid \"123\" as Super Admin user",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Select One account From Exsisting Account",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click on Purchased license tab",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on Buy License tab",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "verify Export Tab",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I Sing Out the Super Admin user in Login page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.iOpenBrowUrl()"
});
formatter.result({
  "duration": 14596800700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "a.sankeerthana@guixt.com",
      "offset": 33
    },
    {
      "val": "123",
      "offset": 70
    }
  ],
  "location": "LoginPageSteps.loginAsValiUser(String,String)"
});
formatter.result({
  "duration": 8994295700,
  "status": "passed"
});
formatter.match({
  "location": "PurchasedLicensePageSteps.select_One_account_From_Exsisting_Account()"
});
formatter.result({
  "duration": 155321500,
  "status": "passed"
});
formatter.match({
  "location": "PurchasedLicensePageSteps.click_on_Purchased_license_tab()"
});
formatter.result({
  "duration": 3127754400,
  "status": "passed"
});
formatter.match({
  "location": "PurchasedLicensePageSteps.click_on_Buy_License_tab()"
});
formatter.result({
  "duration": 31365203100,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountPageSteps.verify_Export_Tab()"
});
formatter.result({
  "duration": 7376350300,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.isingOutLoginPage()"
});
formatter.result({
  "duration": 1839049600,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iQuitTheBrowser()"
});
formatter.result({
  "duration": 901719600,
  "status": "passed"
});
formatter.uri("SAPConnection.feature");
formatter.feature({
  "line": 2,
  "name": "SAP connections in LMP",
  "description": "",
  "id": "sap-connections-in-lmp",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SeventhTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify SAP connections to an account",
  "description": "",
  "id": "sap-connections-in-lmp;verify-sap-connections-to-an-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I open the web browser and launch URL",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I should be able to enter valid \"\u003cemailid\u003e\" and valid \"\u003cpassword\u003e\" as Super Admin user",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click any Existing Account",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click on SAP Connection Tab",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on Create Connection button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Modify the Sap connection details",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Remove the sap connection",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on Update Connection Button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click close button in sap connection page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I Sing Out the Super Admin user in Login page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I quit the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "sap-connections-in-lmp;verify-sap-connections-to-an-account;",
  "rows": [
    {
      "cells": [
        "emailid",
        "password"
      ],
      "line": 17,
      "id": "sap-connections-in-lmp;verify-sap-connections-to-an-account;;1"
    },
    {
      "cells": [
        "a.sankeerthana@guixt.com",
        "123"
      ],
      "line": 18,
      "id": "sap-connections-in-lmp;verify-sap-connections-to-an-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "Verify SAP connections to an account",
  "description": "",
  "id": "sap-connections-in-lmp;verify-sap-connections-to-an-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SeventhTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I open the web browser and launch URL",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I should be able to enter valid \"a.sankeerthana@guixt.com\" and valid \"123\" as Super Admin user",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click any Existing Account",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click on SAP Connection Tab",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on Create Connection button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Modify the Sap connection details",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Remove the sap connection",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on Update Connection Button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click close button in sap connection page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I Sing Out the Super Admin user in Login page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.iOpenBrowUrl()"
});
formatter.result({
  "duration": 14505520900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "a.sankeerthana@guixt.com",
      "offset": 33
    },
    {
      "val": "123",
      "offset": 70
    }
  ],
  "location": "LoginPageSteps.loginAsValiUser(String,String)"
});
formatter.result({
  "duration": 7777613600,
  "status": "passed"
});
formatter.match({
  "location": "UserHistoryPageSteps.click_any_Existing_Account()"
});
formatter.result({
  "duration": 255742500,
  "status": "passed"
});
formatter.match({
  "location": "SAPConnectionPageSteps.click_on_SAP_Connection_Tab()"
});
formatter.result({
  "duration": 2134457400,
  "status": "passed"
});
formatter.match({
  "location": "SAPConnectionPageSteps.click_on_Create_Connection_button()"
});
formatter.result({
  "duration": 12108962900,
  "status": "passed"
});
formatter.match({
  "location": "SAPConnectionPageSteps.modify_the_Sap_connection_details()"
});
formatter.result({
  "duration": 5944985800,
  "status": "passed"
});
formatter.match({
  "location": "SAPConnectionPageSteps.remove_the_sap_connection()"
});
formatter.result({
  "duration": 1828033500,
  "status": "passed"
});
formatter.match({
  "location": "SAPConnectionPageSteps.click_on_Update_Connection_Button()"
});
formatter.result({
  "duration": 685521300,
  "status": "passed"
});
formatter.match({
  "location": "SAPConnectionPageSteps.click_close_button_in_sap_connection_page()"
});
formatter.result({
  "duration": 363509400,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.isingOutLoginPage()"
});
formatter.result({
  "duration": 40739008400,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.xpath: //*[@class\u003d\u0027dt-button buttons-collection\u0027] (tried for 40 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027GUPTHA64LT\u0027, ip: \u0027192.168.1.26\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002710.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.41.578737 (49da6702b16031..., userDataDir: C:\\Users\\sandeep\\AppData\\Lo...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:61527}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 78.0.3904.108, webStorageEnabled: true}\nSession ID: ba960a7fbd67e3573a0f080a884ebe13\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat stepDefs.LoginPageSteps.isingOutLoginPage(LoginPageSteps.java:161)\r\n\tat ✽.Then I Sing Out the Super Admin user in Login page(SAPConnection.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginPageSteps.iQuitTheBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("UploadCsvFile.feature");
formatter.feature({
  "line": 2,
  "name": "Upload from CSV file functionality of Liquid UI web for cloud",
  "description": "",
  "id": "upload-from-csv-file-functionality-of-liquid-ui-web-for-cloud",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@EightTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify Add User Upload from CSV file as a Liquid UI web",
  "description": "",
  "id": "upload-from-csv-file-functionality-of-liquid-ui-web-for-cloud;verify-add-user-upload-from-csv-file-as-a-liquid-ui-web",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I open the web browser and launch URL",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I should be able to enter valid \"\u003cemailid\u003e\" and valid \"\u003cpassword\u003e\" as Super Admin user",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click any Existing Account",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click Add user tab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click Upload from CSV file",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "verify Error All users were already uploaded",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click Sing Out the Super Admin  Login page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I quit the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "upload-from-csv-file-functionality-of-liquid-ui-web-for-cloud;verify-add-user-upload-from-csv-file-as-a-liquid-ui-web;",
  "rows": [
    {
      "cells": [
        "emailid",
        "password"
      ],
      "line": 13,
      "id": "upload-from-csv-file-functionality-of-liquid-ui-web-for-cloud;verify-add-user-upload-from-csv-file-as-a-liquid-ui-web;;1"
    },
    {
      "cells": [
        "a.sankeerthana@guixt.com",
        "123"
      ],
      "line": 14,
      "id": "upload-from-csv-file-functionality-of-liquid-ui-web-for-cloud;verify-add-user-upload-from-csv-file-as-a-liquid-ui-web;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Verify Add User Upload from CSV file as a Liquid UI web",
  "description": "",
  "id": "upload-from-csv-file-functionality-of-liquid-ui-web-for-cloud;verify-add-user-upload-from-csv-file-as-a-liquid-ui-web;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@EightTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I open the web browser and launch URL",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I should be able to enter valid \"a.sankeerthana@guixt.com\" and valid \"123\" as Super Admin user",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click any Existing Account",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click Add user tab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click Upload from CSV file",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "verify Error All users were already uploaded",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click Sing Out the Super Admin  Login page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.iOpenBrowUrl()"
});
formatter.result({
  "duration": 14284884100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "a.sankeerthana@guixt.com",
      "offset": 33
    },
    {
      "val": "123",
      "offset": 70
    }
  ],
  "location": "LoginPageSteps.loginAsValiUser(String,String)"
});
formatter.result({
  "duration": 9174941500,
  "status": "passed"
});
formatter.match({
  "location": "UserHistoryPageSteps.click_any_Existing_Account()"
});
formatter.result({
  "duration": 160883300,
  "status": "passed"
});
formatter.match({
  "location": "UploadCsvFilePageSteps.click_Add_user_tab()"
});
formatter.result({
  "duration": 2201109900,
  "status": "passed"
});
formatter.match({
  "location": "UploadCsvFilePageSteps.click_Upload_from_CSV_file()"
});
formatter.result({
  "duration": 6314262600,
  "status": "passed"
});
formatter.match({
  "location": "UploadCsvFilePageSteps.verify_Error_All_users_were_already_uploaded()"
});
formatter.result({
  "duration": 4464465000,
  "status": "passed"
});
formatter.match({
  "location": "UploadCsvFilePageSteps.click_Sing_Out_the_Super_Admin_Login_page()"
});
formatter.result({
  "duration": 998715500,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iQuitTheBrowser()"
});
formatter.result({
  "duration": 1008248100,
  "status": "passed"
});
formatter.uri("UserHistory.feature");
formatter.feature({
  "line": 2,
  "name": "Get the user History when we click on User History tab",
  "description": "",
  "id": "get-the-user-history-when-we-click-on-user-history-tab",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SixthTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify user history module",
  "description": "",
  "id": "get-the-user-history-when-we-click-on-user-history-tab;verify-user-history-module",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I open the web browser and launch URL",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I should be able to enter valid \"\u003cemailid\u003e\" and valid \"\u003cpassword\u003e\" as Super Admin user",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click any Existing Account",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click License Information tab",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on user history tab",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click Export Tab",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I Sing Out the Super Admin user in Login page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I quit the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "get-the-user-history-when-we-click-on-user-history-tab;verify-user-history-module;",
  "rows": [
    {
      "cells": [
        "emailid",
        "password"
      ],
      "line": 14,
      "id": "get-the-user-history-when-we-click-on-user-history-tab;verify-user-history-module;;1"
    },
    {
      "cells": [
        "a.sankeerthana@guixt.com",
        "123"
      ],
      "line": 15,
      "id": "get-the-user-history-when-we-click-on-user-history-tab;verify-user-history-module;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Verify user history module",
  "description": "",
  "id": "get-the-user-history-when-we-click-on-user-history-tab;verify-user-history-module;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SixthTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I open the web browser and launch URL",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I should be able to enter valid \"a.sankeerthana@guixt.com\" and valid \"123\" as Super Admin user",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click any Existing Account",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click License Information tab",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on user history tab",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click Export Tab",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I Sing Out the Super Admin user in Login page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.iOpenBrowUrl()"
});
formatter.result({
  "duration": 14783623900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "a.sankeerthana@guixt.com",
      "offset": 33
    },
    {
      "val": "123",
      "offset": 70
    }
  ],
  "location": "LoginPageSteps.loginAsValiUser(String,String)"
});
formatter.result({
  "duration": 9648700200,
  "status": "passed"
});
formatter.match({
  "location": "UserHistoryPageSteps.click_any_Existing_Account()"
});
formatter.result({
  "duration": 229001700,
  "status": "passed"
});
formatter.match({
  "location": "UserHistoryPageSteps.click_License_Information_tab()"
});
formatter.result({
  "duration": 2748096800,
  "status": "passed"
});
formatter.match({
  "location": "UserHistoryPageSteps.click_on_user_history_tab()"
});
formatter.result({
  "duration": 9642166900,
  "status": "passed"
});
formatter.match({
  "location": "LicenseInformationPageSteps.click_Export_Tab()"
});
formatter.result({
  "duration": 9320035600,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.isingOutLoginPage()"
});
formatter.result({
  "duration": 1006269700,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iQuitTheBrowser()"
});
formatter.result({
  "duration": 1255537800,
  "status": "passed"
});
});