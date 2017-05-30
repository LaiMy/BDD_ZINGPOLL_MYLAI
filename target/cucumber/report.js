$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RegisterToZingPoll.feature");
formatter.feature({
  "line": 1,
  "name": "Register to ZingPoll",
  "description": "As a user\nI want to register to ZingPoll success",
  "id": "register-to-zingpoll",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Register with empty data",
  "description": "",
  "id": "register-to-zingpoll;register-with-empty-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on ZingPoll website \"chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click the SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "The SignIn form should be shown",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on NewUser radiobox",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter fullname \"\" and email \"\" and password \"\" and confirmPassword \"\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I click Register button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I verify the fullname error message \"Please enter your name.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I verify the email error message \"Please enter your email.\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I verify the password error message \"Please enter your password\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I verify the confirm password error message \"The re-type password is required and cannot be empty.\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I verify the agree error message \"Please agree with the term!\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 26
    }
  ],
  "location": "RegisterSteps.i_am_on_ZingPoll_website(String)"
});
formatter.result({
  "duration": 8295872961,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.i_click_the_SignIn_button()"
});
formatter.result({
  "duration": 230549566,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.the_SignIn_form_should_be_shown()"
});
formatter.result({
  "duration": 636171934,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.i_click_on_NewUser_radiobox()"
});
formatter.result({
  "duration": 2185214283,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 18
    },
    {
      "val": "",
      "offset": 31
    },
    {
      "val": "",
      "offset": 47
    },
    {
      "val": "",
      "offset": 70
    }
  ],
  "location": "RegisterSteps.i_enter_fullname_and_email_and_password_and_confirmPassword(String,String,String,String)"
});
formatter.result({
  "duration": 8849549376,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.i_click_Login_button()"
});
formatter.result({
  "duration": 176789174,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\"Please enter your name.\"",
      "offset": 36
    }
  ],
  "location": "RegisterSteps.i_verify_the_fullname_error_message(String)"
});
formatter.result({
  "duration": 45623037182,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\"Please enter your email.\"",
      "offset": 33
    }
  ],
  "location": "RegisterSteps.i_verify_the_email_error_message(String)"
});
formatter.result({
  "duration": 45673384422,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\"Please enter your password\"",
      "offset": 36
    }
  ],
  "location": "RegisterSteps.i_verify_the_password_error_message(String)"
});
formatter.result({
  "duration": 45655812014,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\"The re-type password is required and cannot be empty.\"",
      "offset": 44
    }
  ],
  "location": "RegisterSteps.i_verify_the_confirm_password_error_message(String)"
});
formatter.result({
  "duration": 45620845879,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\"Please agree with the term!\"",
      "offset": 33
    }
  ],
  "location": "RegisterSteps.i_verify_the_agree_error_message(String)"
});
formatter.result({
  "duration": 30247158118,
  "status": "passed"
});
formatter.after({
  "duration": 1194429697,
  "status": "passed"
});
});