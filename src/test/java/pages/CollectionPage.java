package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CollectionPage {
    public final WebDriverWait wait;
    public WebDriver driver;

    public By Select_all_checkbox = By.xpath("//label[text()=' Select all ']");
    public By Filter_Button = By.cssSelector("button img[alt='Filter icon']");
    public By Status_Filter = By.xpath("//li[.//a[contains(text(),'Status')]]");


    public CollectionPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void selectAll() {
        WebElement collectionIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()=' Select all ']")));
        driver.findElement(Select_all_checkbox).click();
    }
    public void clickFilter()
    {
        driver.findElement(Filter_Button).click();
    }
    public void selectStatusFilter()
    {
        WebElement StatusFilter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[.//a[contains(text(),'Status')]]")));
        driver.findElement(Status_Filter).click();
    }
}
