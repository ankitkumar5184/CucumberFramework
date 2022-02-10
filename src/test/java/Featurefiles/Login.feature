@OrangeHRM
Feature: Test cases on OrangeHRM
  @Login
  Scenario: Checking Login Functionality with valid login credentials
    Given user is on Login Page
    Then user enters username in username textfield
    Then user enters password in password textfield
    When user clicks on the Login button
    Then user is on Home Page
@AddUser
  Scenario: Checking add user functionality
    Given user is on Login Page
    Then user enters username in username textfield
    Then user enters password in password textfield
    When user clicks on the Login button
    Then user is on Home Page
    When user clicks on Admin button
    Then user clicks on add button
    Then enters existing employee name
    Then user enters username in username
    Then enters the password
    Then enters the confirm password
    Then clicks on save button
  @SearchUser
  Scenario: Searching the saved user
    Given user is on Login Page
    Then user enters username in username textfield
    Then user enters password in password textfield
    When user clicks on the Login button
    Then user is on Home Page
    When user clicks on Admin button
    Then user clicks on add button
    Then enters existing employee name
    Then user enters username in username
    Then enters the password
    Then enters the confirm password
    Then clicks on save button
    When user clicks on AdminButton
    Then clicks on search username textfiled and enters the name
    Then enters employee name in the textfield
    Then clicks on search button

    @DeleteUser
    Scenario: Deleting the saved user
      Given user is on Login Page
      Then user enters username in username textfield
      Then user enters password in password textfield
      When user clicks on the Login button
      Then user is on Home Page
      When user clicks on Admin button
      Then user clicks on add button
      Then enters existing employee name
      Then user enters username in username
      Then enters the password
      Then enters the confirm password
      Then clicks on save button
      When user clicks on AdminButton
      Then clicks on search username textfiled and enters the name
      Then enters employee name in the textfield
      Then clicks on search button
      Then click on Checkbox
      Then click on delete option
      Then click on confirmation option

      @LogOut
      Scenario: Logging out from the orangehrm
        Given user is on Login Page
        Then user enters username in username textfield
        Then user enters password in password textfield
        When user clicks on the Login button
        Then user is on Home Page
        When user clicks on Admin button
        Then user clicks on add button
        Then enters existing employee name
        Then user enters username in username
        Then enters the password
        Then enters the confirm password
        Then clicks on save button
        When user clicks on AdminButton
        Then clicks on search username textfiled and enters the name
        Then enters employee name in the textfield
        Then clicks on search button
        Then click on Checkbox
        Then click on delete option
        Then click on confirmation option
        When user clicks on Welcome Option
        Then clicks on Logout button







