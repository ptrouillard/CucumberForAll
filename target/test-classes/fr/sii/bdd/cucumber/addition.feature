Feature: Simple addition
  This feature shows you can add a number to the count.

  Scenario: Add a basic integer
    Given adder has a count of 1
    When I add 2 to the adder
    Then the count should be equal to 3