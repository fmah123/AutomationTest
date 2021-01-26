Feature: The keypress recognition functionality of the application.


  Scenario:
    Given that I navigate to the key presses on menu page
    When I enter a tab key
    Then it should say you entered tab

  Scenario:
    Given that I navigate to the key presses on menu page
    When I enter a control key
    Then it should say you entered control

  Scenario:
    Given that I navigate to the key presses on menu page
    When I enter a escape key
    Then it should say you entered escape

  Scenario:
    Given that I navigate to the key presses on menu page
    When I enter a alt key
    Then it should say you entered alt