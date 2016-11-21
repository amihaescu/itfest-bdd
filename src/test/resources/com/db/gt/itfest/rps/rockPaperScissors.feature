Feature:Rock, paper, scissors

  Scenario: Rock beats Scissors
    Given I am playing rock, paper, scissors with a friend
    When The opponent is playing Scissors
    Then The result should be Rock

  Scenario: Scissors beats Paper
    Given I am playing rock, paper, scissors with a friend
    When The opponent is playing Paper
    Then The result should be Scissors