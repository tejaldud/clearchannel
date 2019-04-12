@heroku-login
Feature: Login
  I want the ability to login to the website
  So that I access the application and proceed further

  Scenario Outline: Successful User Login
    Given I am on herokuapp login page
    And I enter username <username>
    And I enter password <password>
    When I click on login
    Then User should be logged in
    Then User should get message as <message>
    Examples:
      | username | password             | message                        |
      | tomsmith | SuperSecretPassword! | You logged into a secure area! |

  Scenario Outline:Invalid User Login should give error
    Given I am on herokuapp login page
    And I enter username <username>
    And I enter password <password>
    When I click on login
    Then User should get message as <message>
    Examples:
      | username  | password             | message                   |
      | tomsmith1 | SuperSecretPassword! | Your username is invalid! |
      | tomsmith  | SuperSecretPassword  | Your password is invalid! |
      |           | SuperSecretPassword! | Your username is invalid! |
      | tomsmith  |                      | Your password is invalid! |