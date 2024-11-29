package test;

import org.funflo.BaseTest;
import org.testng.annotations.Test;
import pages.CollectionPage;
import pages.DashBoardPage;
import pages.LoginPage;

public class TestCollection extends BaseTest {
    @Test
    public  void testSelectAll(){

    LoginPage loginPage = new LoginPage(driver);
    DashBoardPage dashBoardPage = new DashBoardPage(driver);
    CollectionPage collectionPage = new CollectionPage(driver);


        loginPage.enterMobileNumber("2000000003");
        loginPage.enterPassword("Siyaram@123");
        loginPage.clickLoginButton();
        dashBoardPage.clickCollection();
        collectionPage.selectAll();
        collectionPage.clickFilter();
        collectionPage.selectStatusFilter();
    }
}
