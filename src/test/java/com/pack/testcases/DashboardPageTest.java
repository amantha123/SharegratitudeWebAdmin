package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.DashboardPage;
import com.pack.pages.LoginPage;
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

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
