Feature: Checking login Functionality of the application.
  Scenario: Checking login functionality with valid credentials
    Given user is on Login Page
    When enters the username and enters the password
    | admin | admin123 |
    | Ankit | admin456 |
    | Admin | admin123 |

    Then clicks on login button