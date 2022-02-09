$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/AnkitKumar/IdeaProjects/InfoStride/CucumberFramework/src/test/java/Featurefiles/Login.feature");
formatter.feature({
  "name": "Checking Login Functionality of the application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Checking Login Functionality with valid login credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "login.user_is_on_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username in username textfield",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_enters_username_in_username_textField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password in password textfield",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_enters_password_in_password_textField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Login button",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_clicks_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_is_on_Home_Page()"
});
formatter.result({
  "status": "passed"
});
});