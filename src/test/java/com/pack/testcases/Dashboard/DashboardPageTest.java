package com.pack.testcases.Dashboard;

import com.pack.base.TestBase;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    TestUtil testUtil;

    public DashboardPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
    }

    @Test(priority=1)
    public void verifyDashboardPageTitleTest(){
        String homePageTitle = dashboardPage.validateDashboardPageTitle();
        Assert.assertEquals(homePageTitle, "Share Gratitude");
    }

    @Test(priority=2)
    public void verifyDashboardPageTest(){
        dashboardPage.verifyPatientStaffExperienceMeasuresLabel();
        dashboardPage.verifyRevenueLabel();
        dashboardPage.verifyRevenueValue();
        dashboardPage.verifyCharitiesLabel();
        dashboardPage.verifyCharitiesValue();
        dashboardPage.verifyHospitalsLabel();
        dashboardPage.verifyHospitalsValue();
        dashboardPage.verifyUsersLabel();
        dashboardPage.verifyUsersValue();
        dashboardPage.verifyStatsBtn();
        dashboardPage.verifyUsersLabel1();
        dashboardPage.verifyUsersValue1();
        dashboardPage.verifyTeamsLabel();
        dashboardPage.verifyTeamsValue();
        dashboardPage.verifyAppreciationsLabel();
        dashboardPage.verifyAppreciationsValue();
        dashboardPage.verifyThankYouLabel();
        dashboardPage.verifyThankYouValue();
        dashboardPage.verifyThankYouReplies();
        dashboardPage.verifyThankYouRepliesValue();
        dashboardPage.verifyThankYouRepliesValue1();
        dashboardPage.verifyThankYouRepliesValue2();
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
