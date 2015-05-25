Feature: Simple addition
  This feature shows that you can add a number to the count.

  Scenario: Add a basic integer
    Given calculator has a count of 1
    When I add 2 to the calculator
    Then the count should be equal to 3
