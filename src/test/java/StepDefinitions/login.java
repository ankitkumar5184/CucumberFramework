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
    String employee = "Sara Tencrady";
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
            driver.findElement(By.id("systemUser_userName")).clear();
            driver.findElement(By.id("systemUser_userName")).sendKeys(username);
        }
        @Then("^enters the password$")
        public void enters_the_password(){

            driver.findElement(By.id("systemUser_password")).sendKeys(pass);
        }
        @Then("^enters the confirm password$")
        public void enters_the_confirm_password() throws InterruptedException {
            driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pass);
            Thread.sleep(4000);
        }
        @Then("^clicks on save button$")
        public void clicks_on_save_button() throws InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
            Thread.sleep(3000);
            String txt = driver.findElement(By.className("fadable")).getText();
            System.out.println("Message :"+ txt);
        }
        @Then("^user clicks on AdminButton$")
        public void user_clicks_on_AdminButton(){
            driver.findElement(By.id("menu_admin_viewAdminModule")).click();
    }
    @Then("^clicks on search username textfiled and enters the name$")
    public void clicks_on_search_username_textfiled_and_enters_the_name(){
        driver.findElement(By.name("searchSystemUser[userName]")).sendKeys(username);
    }
    @Then("^enters employee name in the textfield$")
    public void enters_employee_name_in_the_textfield(){
        driver.findElement(By.name("searchSystemUser[employeeName][empName]")).sendKeys(employee);

    }
    @Then("^clicks on search button$")
    public void clicks_on_search_button(){
        driver.findElement(By.name("_search")).click();
    }
    @Then("^click on Checkbox$")
    public void click_on_Checkbox(){
        driver.findElement(By.name("chkSelectRow[]")).click();
    }
    @Then("^click on delete option$")
    public void click_on_delete_option(){
        driver.findElement(By.name("btnDelete")).click();
    }
    @Then("^click on confirmation option$")
    public void click_on_confirmation_option(){
        driver.findElement(By.id("dialogDeleteBtn")).click();
        String msg = driver.findElement(By.className("fadable")).getText();
        System.out.println("Message 2: "+ msg);
    }
    @When("^user clicks on Welcome Option$")
    public void user_clicks_on_Welcome_Option() throws InterruptedException {
        driver.findElement(By.partialLinkText("Welcome")).click();
        Thread.sleep(2000);
    }
    @Then("^clicks on Logout button$")
    public void clicks_on_Logout_button() throws InterruptedException {
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(2000);
        driver.close();
    }
    }

