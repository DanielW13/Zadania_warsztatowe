Feature: Registration test
  Scenario Outline: user can create an account
    Given user is on main site and click sign in button
    When user input email address and click create an account button
    When user fills in the registration form with <firstName>, <lastName>, <password> and click registration button
    Then user sees my account page
    And user sees its name <firstName>

    Examples:
    |firstName|lastName|password|
    |Dd       |Ww      |12345   |

