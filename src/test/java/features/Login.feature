Feature: The login authentication of the application.
  Scenario Outline:
    Given that I navigate to the form authentication page
    When I enter a incorrect <username> and incorrect <password>
    And I click on login
    Then I should see a username invalid message
    Examples:
      |username|password|
      |wrongUsername|wrongPassword|


  Scenario Outline:
    Given that I navigate to the form authentication page
    When I enter a correct <username> and incorrect <password>
    And I click on login
    Then I should see a password invalid message
    Examples:
      |username|password|
      |tomsmith|wrongPassword|


  Scenario Outline:
    Given that I navigate to the form authentication page
    When I enter a correct <username> and correct <password>
    And I click on login
    Then I should see a welcome login message
    Examples:
      |username|password|
      |tomsmith|SuperSecretPassword!|
