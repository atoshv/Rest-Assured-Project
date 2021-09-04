Feature: Test 1


#  Scenario Outline: test case 1
#
#    Given api request <url>
#    And authentication <token>
#    When sending api requests
#    Then validate response <code>
#
#    Examples:
#    | url                         | token                            | code |
#    | http://api.weatherstack.com | 75954876168d81ceb685be99a415e565 | 200  |

  Scenario Outline: test case 2

    Given api request <url>
    When sending api requests
    Then validate response <code>

    Examples:
      | url               | code |
      | https://reqres.in | 200  |