Feature: Exam test
  Scenario Outline: user can log in to his or her account and add a new address
    Given user is on main site and click signIn button
    When user input email address and password and click sign in button
    When user clicks an addresses button
    When user clicks create new address button
    When user fills in the new address form with <alias>, <address>, <city>, <zipCode>, <country>, <phone> and clicks save button
    Then user checks the entered data <alias>, <address>, <city>, <zipCode>, <country>, <phone>
    Then user deletes new address
    Then user checks positive deletion <alias>
    And user closes browser

    Examples:
    |alias|address|city  |zipCode|country       |phone    |
    |Dtest|Testowa|Londyn|33-987 |United Kingdom|654987321|