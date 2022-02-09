package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    WebDriver driver;
    @Given("^user is on Login Page$")
    public void user_is_on_Login_Page()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    }
    @Then("^user enters username in username textfield$")
    public void user_enters_username_in_username_textField(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    }
    @Then("^user enters password in password textfield$")
    public void user_enters_password_in_password_textField(){
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    }
    @When("^user clicks on the Login button$")
    public void user_clicks_on_the_Login_button(){
        driver.findElement(By.id("btnLogin")).click();
    }
    @Then("^user is on Home Page$")
    public void user_is_on_Home_Page(){
        Assert.assertEquals("OrangeHRM",driver.getTitle());
    }
}
