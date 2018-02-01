Feature: Converting Digital Time to Berlin Time

  Scenario Outline: Implement the Single Minutes Row
    Given I have started the converter
    When I enter <input>
    Then <output> is returned for the single minutes row

    Examples:
      | input    | output |
      | 00:00:00 | OOOO   |
      | 23:59:59 | YYYY   |
      | 12:32:00 | YYOO   |
      | 12:34:00 | YYYY   |
      | 12:35:00 | OOOO   |
