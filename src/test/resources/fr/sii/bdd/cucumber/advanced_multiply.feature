Feature: Multiplication with floats
  This feature shows that you can multiply a floating number.

  Scenario: Multiply a float number
    Given calculator has a count of 2.5
    When I set 3.5 to the calculator
    Then the count should be equal to 8.75
