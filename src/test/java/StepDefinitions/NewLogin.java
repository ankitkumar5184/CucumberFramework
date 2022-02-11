package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.cucumber.datatable.DataTable;

import java.util.List;

public class NewLogin {
    WebDriver driver;

    @Given("^user is on Login Page$")
    public void user_is_on_Login_Page(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        }
    @When("^enters the username and enters the password$")
    public void enters_the_username_and_enters_the_password(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        List<List<String>> data = dataTable.asLists(String.class);
        for(List<String> e:data){
            driver.findElement(By.id("txtUsername")).clear();
            driver.findElement(By.id("txtPassword")).clear();
            driver.findElement(By.id("txtUsername")).sendKeys(e.get(0));
            driver.findElement(By.id("txtPassword")).sendKeys(e.get(1));
            System.out.println(e);
            Thread.sleep(2000);
        }
    }
    @Then("^clicks on login button$")
    public void clicks_on_login_button(){
        driver.findElement(By.id("btnLogin")).click();
    }

}
