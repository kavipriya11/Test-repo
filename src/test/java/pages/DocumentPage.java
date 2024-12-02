package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DocumentPage {
    public final WebDriverWait wait;
    public WebDriver driver;

    public By Select_All = By.xpath("//label[contains(text(),' Select all ')]");
    public By Initiate_Payment = By.xpath("//button[text()='Initiate Payment']");


    public DocumentPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void selectAndDeselectAll()
    {
        WebElement SelectAll = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),' Select all ')]")));
        driver.findElement(Select_All).click();
        driver.findElement(Select_All).click();
    }
    public void clickInitiatePayment()
    {
        WebElement InitiatePayment = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Initiate Payment']")));
        driver.findElement(Initiate_Payment).click();
    }
}
