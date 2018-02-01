Feature: Converting Digital Time to Berlin Time

  Scenario: Implement the five Minutes Row
    Given I have started the converter
    When I enter 00:00:00
    Then OOOOOOOOOOO is returned for the five minutes row

  Scenario: Implement the five Minutes Row
    Given I have started the converter
    When I enter 23:59:59
    Then YYRYYRYYRYY is returned for the five minutes row
