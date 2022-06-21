package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static driver.DriverFactory.getDriver;

public class Contact_Us_Steps {

    private WebDriver driver = getDriver();

    /*public String generateRandomNumber(int length) {
        return RandomStringUtils.randomNumeric(length);
    }

    public String generateRandomString(int length) {
        return RandomStringUtils.randomAlphabetic(length);
    }*/

    @Given("I access to the WebDriverUniversity contact us Page")
    public void i_access_to_the_web_driver_university_contact_us_page() {
        driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
    }

    @When("I enter valid First Name")
    public void i_enter_valid_first_name() throws InterruptedException {
        driver.findElement(By.name("first_name")).sendKeys("Varu");
        Thread.sleep(1000);
    }

    @And("I enter valid Last Name")
    public void i_enter_valid_last_name() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Prabah");
        Thread.sleep(1000);
    }

    @And("I enter valid email address")
    public void i_enter_valid_email_address() {

        driver.findElement(By.name("email")).sendKeys("abc123@abc.com");
    }

    @And("I enter valid comment")
    public void i_enter_valid_comment() throws InterruptedException {
        driver.findElement(By.name("message")).sendKeys("adhakhf akhfah ahflsf ahfflsh aaaf");
        Thread.sleep(1000);
    }

    //**************************************************************************//
    @Given("I access to the WebDriverUniversity contact us Page {string}")
    public void i_access_to_the_web_driver_university_contact_us_page(String string) {
        driver.get(string);
    }

    @When("I enter valid First Name {word}")
    public void i_enter_valid_first_name(String firstName) throws InterruptedException {
        driver.findElement(By.name("first_name")).sendKeys(firstName);
        Thread.sleep(1000);
    }

    @And("I enter valid Last Name {word}")
    public void i_enter_valid_last_name(String lastName) throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastName);
        Thread.sleep(1000);
    }

    @And("I enter valid email address {word}")
    public void i_enter_valid_email_address(String emailAddress) {
        driver.findElement(By.name("email")).sendKeys(emailAddress);
    }

    @And("I enter valid comment {string}")
    public void i_enter_valid_comment(String string) throws InterruptedException {
        driver.findElement(By.name("message")).sendKeys(string);
        Thread.sleep(1000);
    }


    @And("I click submit button")
    public void i_click_submit_button() throws InterruptedException {
        driver.findElement(By.xpath("//input[@value='SUBMIT']")).click();
        Thread.sleep(1000);
    }

    @Then("I should be presented by a successful submission message")
    public void i_should_be_presented_by_a_successful_submission_message() {
        WebElement submission_message = driver.findElement(By.xpath("//div[@id='contact_reply']/h1"));
        Assert.assertEquals(submission_message.getText(), "Thank You for your Message!");
    }
}
