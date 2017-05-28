Feature: Login to Zing
  As a user
  I would like login to site success
  So that I can run around in it

  @without_keyword
  Scenario: Login with email not signed - without keyword
  	Given I am on ZingPoll website "chrome"
    And I click the SignIn button
    Then The SignIn form should be shown
    When I enter email <dam234@gmail.com> and password <daominhdam>
    And I click Login button
    Then I verify the failure message <This email is not registered.>
  
  @example_keyword
  @ignore
  Scenario Outline: Login with email not signed - example keyword
    Given I am on ZingPoll website <browser>
    And I click the SignIn button
    Then The SignIn form should be shown
    When I enter email <username> and password <password>
    And I click Login button
    Then I verify the failure message <error message>

    Examples: 
      | username         | password   | error message                 | browser          |
      | dam234@gmail.com | daominhdam | This email is not registered. | chrome          |
      | dam234@gmail.com | daominhdam | This email is not registered. | internetexplorer          |
