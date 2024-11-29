package test;

import org.funflo.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TestLogin extends BaseTest {

    @Test
    public void testValidLogin() {
        //WebDriver driver = ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);

        // Enter valid credentials
        loginPage.enterMobileNumber("2000000003");
        loginPage.enterPassword("Siyaram@123");

        // Click on the login button
        loginPage.clickLoginButton();


    }
    @Test
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(driver);

        // Enter invalid credentials
        loginPage.enterMobileNumber("789564123");
        loginPage.enterPassword("wrongpassword");

        // Click on the login button
        loginPage.clickLoginButton();
    }
}
