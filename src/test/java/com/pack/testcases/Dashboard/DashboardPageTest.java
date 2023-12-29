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

    @Test(priority = 2)
    public void verifyPatientStaffExperienceMeasuresLabelTest(){
        dashboardPage.verifyPatientStaffExperienceMeasuresLabel();
    }

    @Test(priority = 3)
    public void verifyRevenueLabelTest(){
        dashboardPage.verifyRevenueLabel();
    }

    @Test(priority = 4)
    public void verifyRevenueValueTest(){
        dashboardPage.verifyRevenueValue();
    }

    @Test(priority = 5)
    public void verifyCharitiesLabelTest(){
        dashboardPage.verifyCharitiesLabel();
    }

    @Test(priority = 6)
    public void verifyCharitiesValueTest(){
        dashboardPage.verifyCharitiesValue();
    }

    @Test(priority = 7)
    public void verifyHospitalsLabelTest(){
        dashboardPage.verifyHospitalsLabel();
    }

    @Test(priority = 8)
    public void verifyHospitalsValueTest(){
        dashboardPage.verifyHospitalsValue();
    }

    @Test(priority = 9)
    public void verifyUsersLabelTest(){
        dashboardPage.verifyUsersLabel();
    }

    @Test(priority = 10)
    public void verifyUsersValueTest(){
        dashboardPage.verifyUsersValue();
    }

    @Test(priority = 11)
    public void verifyStatsBtnTest(){
        dashboardPage.verifyStatsBtn();
    }

    @Test(priority = 12)
    public void verifyUsersLabelTest1(){
        dashboardPage.verifyUsersLabel1();
    }

    @Test(priority = 13)
    public void verifyUsersValueTest1(){
        dashboardPage.verifyUsersValue1();
    }

    @Test(priority = 14)
    public void verifyTeamsLabelTest(){
        dashboardPage.verifyTeamsLabel();
    }

    @Test(priority = 15)
    public void verifyTeamsValueTest(){
        dashboardPage.verifyTeamsValue();
    }

    @Test(priority = 16)
    public void verifyAppreciationsLabelTest(){
        dashboardPage.verifyAppreciationsLabel();
    }

    @Test(priority = 17)
    public void verifyAppreciationsValueTest(){
        dashboardPage.verifyAppreciationsValue();
    }

    @Test(priority = 18)
    public void verifyThankYouLabelTest(){
        dashboardPage.verifyThankYouLabel();
    }

    @Test(priority = 19)
    public void verifyThankYouValueTest(){
        dashboardPage.verifyThankYouValue();
    }

    @Test(priority = 20)
    public void verifyThankYouRepliesTest(){
        dashboardPage.verifyThankYouReplies();
    }

    @Test(priority = 21)
    public void verifyThankYouRepliesValueTest(){
        dashboardPage.verifyThankYouRepliesValue();
    }

    @Test(priority = 22)
    public void verifyThankYouRepliesValue1Test(){
        dashboardPage.verifyThankYouRepliesValue1();
    }

    @Test(priority = 23)
    public void verifyThankYouRepliesValue2Test(){
        dashboardPage.verifyThankYouRepliesValue2();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
