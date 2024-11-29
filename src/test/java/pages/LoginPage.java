package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;

    // Locators
    public By mobileNumberField = By.xpath("//input[@placeholder='Enter your mobile number']");
    public By passwordField = By.xpath("//input[@placeholder='Enter your Password']");
    public By loginButton = By.xpath("//span[contains(text(), 'get started')]");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterMobileNumber(String mobileNumber) {
        driver.findElement(mobileNumberField).sendKeys(mobileNumber);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

}
