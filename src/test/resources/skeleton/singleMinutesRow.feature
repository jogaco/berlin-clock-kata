Feature: Converting Digital Time to Berlin Time

  Scenario: Implement the Single Minutes Row
    Given I have started the converter
    When I enter 00:00:00
    Then OOOO is returned for the single minutes row

  Scenario: Implement the Single Minutes Row
    Given I have started the converter
    When I enter 23:59:59
    Then YYYY is returned for the single minutes row

  Scenario: Implement the Single Minutes Row
    Given I have started the converter
    When I enter 12:32:00
    Then YYOO is returned for the single minutes row

  Scenario: Implement the Single Minutes Row
    Given I have started the converter
    When I enter 12:34:00
    Then YYYY is returned for the single minutes row

  Scenario: Implement the Single Minutes Row
    Given I have started the converter
    When I enter 12:35:00
    Then OOOO is returned for the single minutes row
