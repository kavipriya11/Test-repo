package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashBoardPage {
    public final WebDriverWait wait;
    public WebDriver driver;

    //Locators for side panel icon
    public By DashBoard = By.xpath("//span[contains(text(), 'Dashboard')]");
    public By Collection_Button = By.xpath("//img[contains(@src, 'collection.svg')]");
    public By Document_Button = By.xpath("//mat-list-item[.//h4[text()='Documents'] and .//img[@alt='icon for document']]");
    public By Indent_icon = By.xpath("//h4[contains(text(),'Indent')]");
    public By Product_catalog_Button = By.xpath("//h4[contains(text(),'Product Catalog')]");
    public By Schemes_Button = By.xpath("//h4[contains(text(),'Schemes')]");
    public By Balance_conf_Button = By.xpath("//h4[contains(text(),'Balance Confirmation')]");
    public By Ledger_Report_Button = By.xpath("//h4[contains(text(),'Ledger Report')]");
    public By Relationship_Summary_Button = By.xpath("//h4[contains(text(),'Relationship Summary')]");
    public By Company_code_dropdown =  By.xpath("//div[@class='mat-mdc-select-arrow ng-tns-c26-640']");

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickCollection()
    {
        WebElement collectionIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[contains(@src, 'collection.svg')]")));
        driver.findElement(Collection_Button).click();
    }
    public void clickDocument()
    {
        WebElement Document = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//mat-list-item[.//h4[text()='Documents'] and .//img[@alt='icon for document']]")));
        driver.findElement(Document_Button).click();
    }
    public void clickIndent()
    {
        WebElement IndentIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[contains(text(),'Indent')]")));
        driver.findElement(Indent_icon).click();
    }
    public void clickProductCatelog()
    {
        WebElement Product = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[contains(text(),'Product Catalog')]")));
        driver.findElement(Product_catalog_Button).click();
    }
    public void clickScheme()
    {
        WebElement Scheme = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[contains(text(),'Schemes')]")));
        driver.findElement(Schemes_Button).click();
    } public void clickBalanceConfirmation()
    {
        WebElement BalanceConf = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[contains(text(),'Balance Confirmation')]")));
        driver.findElement(Balance_conf_Button).click();
    } public void clickLedger()
    {
        WebElement Ledger = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[contains(text(),'Ledger Report')]")));
        driver.findElement(Ledger_Report_Button).click();
    }
    public void clickRelationShip()
    {
        WebElement Relationship = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[contains(text(),'Relationship Summary')]")));
        driver.findElement(Relationship_Summary_Button).click();
    }
    public void clickDashBoard()
    {
        WebElement IndentIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Dashboard')]")));
        driver.findElement(Document_Button).click();
    }
//    public void clickCompanycode()
//    {
//        WebElement CompanyCode = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='mat-mdc-select-arrow ng-tns-c26-640']")));
//        driver.findElement(Company_code_dropdown).click();
//    }
}





