package test;

import org.funflo.BaseTest;
import org.testng.annotations.Test;
import pages.DashBoardPage;
import pages.LoginPage;

public class TestDashBoard extends BaseTest {
    @Test
    public void testSwitchPanelas() {
        //WebDriver driver = ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        DashBoardPage dashBoardPage = new DashBoardPage(driver);

        // Enter valid credentials
        loginPage.enterMobileNumber("2000000003");
        loginPage.enterPassword("Siyaram@123");
        loginPage.clickLoginButton();
        dashBoardPage.clickCollection();
        dashBoardPage.clickDocument();
        dashBoardPage.clickIndent();
        dashBoardPage.clickProductCatelog();
        dashBoardPage.clickScheme();
        dashBoardPage.clickBalanceConfirmation();
        dashBoardPage.clickLedger();
        dashBoardPage.clickRelationShip();
    }
//   @Test
//    public void testOpenCompanyCodeDropDown()
//   {
//       LoginPage loginPage = new LoginPage(driver);
//       DashBoardPage dashBoardPage = new DashBoardPage(driver);
//       loginPage.enterMobileNumber("2000000003");
//       loginPage.enterPassword("Siyaram@123");
//       loginPage.clickLoginButton();
//       dashBoardPage.clickCompanycode();
//   }
}
