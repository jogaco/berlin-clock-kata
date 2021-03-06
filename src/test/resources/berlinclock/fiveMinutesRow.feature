Feature: Converting Digital Time to Berlin Time

  Scenario Outline: Implement the five Minutes Row
    Given I have started the converter
    When I enter <input>
    Then <output> is returned for the five minutes row

    Examples:
      | input    | output      |
      | 00:00:00 | OOOOOOOOOOO |
      | 23:59:59 | YYRYYRYYRYY |
      | 12:04:00 | OOOOOOOOOOO |
      | 12:23:00 | YYRYOOOOOOO |
      | 12:35:00 | YYRYYRYOOOO |











