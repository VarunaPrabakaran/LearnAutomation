package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import static driver.DriverFactory.getDriver;

public class Login_Portal_Steps {

    private WebDriver driver = getDriver();

    @Given("I access to the WebDriver University Login portal {string}")
    public void i_access_to_the_web_driver_university_login_portal(String string) {
        driver.get(string);
    }

    @When("I enter valid Username {word}")
    public void i_enter_valid_username(String userName) {
        driver.findElement(By.id("text")).sendKeys(userName);
    }

    @And("I enter valid Password {word}")
    public void i_enter_valid_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("I click Login button")
    public void i_click_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("I should be presented by successful login message")
    public void i_should_be_presented_by_successful_login_message() {
        Alert alert = driver.switchTo().alert();
        String alertMessage = driver.switchTo().alert().getText();
        Assert.assertEquals(alertMessage, "validation succeeded");
    }

    @When("I enter invalid Username {word}")
    public void i_enter_invalid_username(String invalid_username) {
        driver.findElement(By.id("text")).sendKeys("invalid_username");
    }

    @And("I enter invalid password {word}")
    public void i_enter_invalid_password(String invalid_password) {
        driver.findElement(By.id("password")).sendKeys("invalid_password");
    }

    @Then("I should be presented by Login failed message")
    public void i_should_be_presented_by_Login_failed_message() {
        Alert alert = driver.switchTo().alert();
        String alertMessage = driver.switchTo().alert().getText();
        Assert.assertEquals(alertMessage, "validation failed");
    }
}
