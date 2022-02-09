Feature: Checking Login Functionality of the application
  Scenario: Checking Login Functionality with valid login credentials
    Given user is on Login Page
    Then user enters username in username textfield
    Then user enters password in password textfield
    When user clicks on the Login button
    Then user is on Home Page
