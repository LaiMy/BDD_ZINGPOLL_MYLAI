Feature: Register to ZingPoll
  As a user
  I want to register to ZingPoll success

  @tag1
  Scenario: Register with empty data
    Given I am on ZingPoll website "chrome"
    And I click the SignIn button
    Then The SignIn form should be shown
    And I click on NewUser radiobox
    When I enter fullname "" and email "" and password "" and confirmPassword ""
    And I click Register button
    Then I verify the fullname error message "Please enter your name."
    And I verify the email error message "Please enter your email."
    And I verify the password error message "Please enter your password"
    And I verify the confirm password error message "The re-type password is required and cannot be empty."
    And I verify the agree error message "Please agree with the term!"

    
    @tag2
    Scenario Outline: Register with registered email
    Given I open ZingPoll website <browser>
    And I click the SignIn button
    Then The SignIn form should be shown
    And I click on NewUser radiobox
    When I enter fullname <fullName> and email <email> and password <password> and confirmPassword <confirmPassword>
    And I click Register button
    And I check the email error message <errorMessage>
    
    Examples:
| fullName| email   						 | password		| confirmPassword | errorMessage               		                     | browser|
|  DAM DAO| daominhdam@gmail.com | 123123			| 123123				  |This email was registered. Please use another one.| chrome |
      