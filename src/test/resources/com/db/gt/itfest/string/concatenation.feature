Feature: Two lists and concatenate them

  Scenario: Concatenate 2 lists
    Given I have two character lists: abc and 123
    When I call the concatenation method
    Then I expect the result should be abc123

  Scenario: Combine 2 list elements alternating
    Given I have two character lists: abc and 123
    When I call the alternate method
    Then I expect the result should be a1b2c3

  Scenario: Combine 2 list elements alternatingly (one inverted)
    Given I have two character lists: abc and 123
    When I call the inverted alternate combination method
    Then I expect the result should be a3b2c1
