Feature: test for extent reports

@rediff
  Scenario Outline: Enter email and password on rediffPage
    Given I am on RediffPage
    When I enter EmailID '<id>' & Password '<pwd>'
    And click on Login

    Examples: 
      | id                | pwd       |
      | sonal04@gmail.com | sonal@123 |

