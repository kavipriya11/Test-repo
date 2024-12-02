package org.funflo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ar.uat.fundflo.ai");
    }



    @AfterMethod
     public void tearDown() {
      // Close the browser
         if (driver != null) {
           driver.quit();
         }
    }
}
