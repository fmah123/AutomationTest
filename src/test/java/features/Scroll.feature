Feature: The scroll functionality of web application.

  Scenario:
    Given that I navigate to the infinte scroll page
    When I scroll down twice
    And scroll to the top
    Then I should see the page title

