package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    WebDriver driver;
    String employee = "Admin A";
    String username = RandomStringUtils.randomAlphabetic(10);
    String pass =    RandomStringUtils.randomAlphabetic(8);

    @Given("^user is on Login Page$")
    public void user_is_on_Login_Page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    }

    @Then("^user enters username in username textfield$")
    public void user_enters_username_in_username_textField() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    }

    @Then("^user enters password in password textfield$")
    public void user_enters_password_in_password_textField() {
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    }

    @When("^user clicks on the Login button$")
    public void user_clicks_on_the_Login_button() {
        driver.findElement(By.id("btnLogin")).click();
    }

    @Then("^user is on Home Page$")
    public void user_is_on_Home_Page() {
        Assert.assertEquals("OrangeHRM", driver.getTitle());
    }

        @Then("^user clicks on Admin button$")
        public void user_clicks_on_Admin_button() {
            driver.findElement(By.id("menu_admin_viewAdminModule")).click();
        }

        @Then("^user clicks on add button$")
        public void user_clicks_on_add_button() {
            driver.findElement(By.id("btnAdd")).click();
        }

        @Then("^enters existing employee name$")
        public void enters_existing_employee_name(){
            driver.findElement(By.xpath("//*[@id=\"systemUser_employeeName_empName\"]")).sendKeys(employee);
        }
        @Then("^user enters username in username$")
        public void user_enters_username_in_username(){
            driver.findElement(By.id("systemUser_userName")).sendKeys(username);
        }
        @Then("^enters the password$")
        public void enters_the_password(){

            driver.findElement(By.id("systemUser_password")).sendKeys(pass);
        }
        @Then("^enters the confirm password$")
        public void enters_the_confirm_password(){
            driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pass);
        }
        @Then("^clicks on save button$")
        public void clicks_on_save_button(){
            driver.findElement(By.id("btnSave")).click();
        }

    }



