Feature: Calculate a result

  Scenario Outline: mathFuncs
    Given I have a variable <num0>
    When I get <num1> , <num2>, <op>
    Then I will get <result> as a reuslt

    Examples:
      | num1 | num2 | op | result   |
      | 9    | 8    | +  | 17.0     |
      | 7    | 6    | -  | 1.0      |
      | 5    | 4    | x  | 20.0     |
      | 3    | 2    | /  | 1.5      |
      | 1    | 0    | /  | -1.0     |