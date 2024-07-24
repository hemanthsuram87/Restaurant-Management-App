@smoketoday
Feature: What day is it today?
  Everybody wants to know when it's Friday.

  Scenario Outline: Is it Friday?
    Given today is "<day>"
    When I ask whether it's Friday yet
    Then I should be told "<answer>"

    Examples:
      | day    | answer |
      | Friday | Yes    |
      | Sunday | Nope   |

  Scenario Outline: Independence Day in August
    Given this month is "<month>"
    When I check if it has an Independence Day
    Then I should be shown "<flag>"

    Examples:
      | month  | flag |
      | August | Yes  |
      | July   | No   |
