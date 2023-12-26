package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Page Elements
    public WebElement getUsernameInput() {
        return driver.findElement(By.id("user-name"));
    }

    public WebElement getPasswordInput() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.id("login-button"));
    }
    public WebElement getPageTitle() {
        return driver.findElement(By.xpath("//*[contains(text(), 'Products')]"));
    }

    public WebElement getErrorMessage() {
        return driver.findElement(By.xpath("//*[contains(text(), 'Epic sadface:')]"));
    }
}