package TestDefinition;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import saucedemo.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginStepDefinitions {

    private WebDriver driver;
    private LoginPage loginPage;

    // Constructor
    public LoginStepDefinitions(WebDriver driver, LoginPage loginPage) {
        this.driver = driver;
        this.loginPage = loginPage;
    }
    @Given("the user is on the login page")
    public void navigateToLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("the user enters valid username {string} and valid password {string}")
    public void enterValidCredentials(String username, String password) {
        loginPage.getUsernameInput().sendKeys(username);
        loginPage.getPasswordInput().sendKeys(password);
    }

    @When("the user clicks the login button")
    public void clickLoginButton() {
        loginPage.getLoginButton().click();
    }


    @When("the user enters invalid username {string} and invalid password {string}")
    public void enterInvalidCredentials(String username, String password) {
        loginPage.getUsernameInput().sendKeys(username);
        loginPage.getPasswordInput().sendKeys(password);
    }

    @Then("an error message should be displayed")
    public void verifyErrorMessage() {
        //Assert.assertTrue(loginPage.getErrorMessage().isDisplayed(), "Error message not displayed for invalid login");
    }

    // Additional steps and verifications as needed
}