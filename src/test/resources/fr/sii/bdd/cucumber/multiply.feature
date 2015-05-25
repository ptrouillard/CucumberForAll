Feature: Simple multiplication
  This feature shows that you can multiply a number.

  Scenario: Multiply a basic integer
    Given calculator has a count of 2
    When I set 3 to the calculator
    Then the count should be equal to 6
