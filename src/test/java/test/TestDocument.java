package test;

import org.funflo.BaseTest;
import org.testng.annotations.Test;
import pages.CollectionPage;
import pages.DashBoardPage;
import pages.DocumentPage;
import pages.LoginPage;


public class TestDocument extends BaseTest {
    @Test
    public void testSelectAndDeselectAllDoc() {

        LoginPage loginPage = new LoginPage(driver);
        DashBoardPage dashBoardPage = new DashBoardPage(driver);
        DocumentPage documentPage = new DocumentPage(driver);
        loginPage.enterMobileNumber("2000000003");
        loginPage.enterPassword("Siyaram@123");
        loginPage.clickLoginButton();
        dashBoardPage.clickDocument();
        documentPage.selectAndDeselectAll();
    }
    @Test
    public void testSelectInitiatePayment() {

        LoginPage loginPage = new LoginPage(driver);
        DashBoardPage dashBoardPage = new DashBoardPage(driver);
        DocumentPage documentPage = new DocumentPage(driver);
        loginPage.enterMobileNumber("2000000003");
        loginPage.enterPassword("Siyaram@123");
        loginPage.clickLoginButton();
        dashBoardPage.clickDocument();
        documentPage.clickInitiatePayment();
        }
}
