$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RegisterToZingPoll.feature");
formatter.feature({
  "line": 1,
  "name": "Register to ZingPoll",
  "description": "As a user\nI want to register to ZingPoll success",
  "id": "register-to-zingpoll",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 21,
  "name": "Register with registered email",
  "description": "",
  "id": "register-to-zingpoll;register-with-registered-email",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "I open ZingPoll website \u003cbrowser\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I click the SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "The SignIn form should be shown",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I click on NewUser radiobox",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter fullname \u003cfullName\u003e and email \u003cemail\u003e and password \u003cpassword\u003e and confirmPassword \u003cconfirmPassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I click Register button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I check the email error message \u003cerrorMessage\u003e",
  "keyword": "And "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "register-to-zingpoll;register-with-registered-email;",
  "rows": [
    {
      "cells": [
        "fullName",
        "email",
        "password",
        "confirmPassword",
        "errorMessage",
        "browser"
      ],
      "line": 31,
      "id": "register-to-zingpoll;register-with-registered-email;;1"
    },
    {
      "cells": [
        "DAM DAO",
        "daominhdam@gmail.com",
        "123123",
        "123123",
        "This email was registered. Please use another one.",
        "chrome"
      ],
      "line": 32,
      "id": "register-to-zingpoll;register-with-registered-email;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 32,
  "name": "Register with registered email",
  "description": "",
  "id": "register-to-zingpoll;register-with-registered-email;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "I open ZingPoll website chrome",
  "matchedColumns": [
    5
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I click the SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "The SignIn form should be shown",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I click on NewUser radiobox",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter fullname DAM DAO and email daominhdam@gmail.com and password 123123 and confirmPassword 123123",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I click Register button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I check the email error message This email was registered. Please use another one.",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 24
    }
  ],
  "location": "RegisterSteps.i_open_zingpoll_website_something(String)"
});
formatter.result({
  "duration": 6156313536,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.i_click_the_SignIn_button()"
});
formatter.result({
  "duration": 189683663,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.the_SignIn_form_should_be_shown()"
});
formatter.result({
  "duration": 500288317,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.i_click_on_NewUser_radiobox()"
});
formatter.result({
  "duration": 2184302212,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DAM DAO",
      "offset": 17
    },
    {
      "val": "daominhdam@gmail.com",
      "offset": 35
    },
    {
      "val": "123123",
      "offset": 69
    },
    {
      "val": "123123",
      "offset": 96
    }
  ],
  "location": "RegisterSteps.i_enter_fullname_and_email_and_password_and_confirmPassword(String,String,String,String)"
});
formatter.result({
  "duration": 9134417772,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.i_click_Login_button()"
});
formatter.result({
  "duration": 204651421,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 953910335,
  "status": "passed"
});
});