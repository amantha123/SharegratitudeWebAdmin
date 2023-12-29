package com.pack.testcases.HelpCenter;

import com.pack.base.TestBase;
import com.pack.pages.HelpCenter.AcceptableUsePolicyPage;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AcceptableUsePolicyPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    AcceptableUsePolicyPage acceptableUsePolicyPage;
    TestUtil testUtil;

    public AcceptableUsePolicyPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        acceptableUsePolicyPage = new AcceptableUsePolicyPage();
    }

    @Test(priority=1)
    public void verifyAcceptableUsePolicyPageTitleTest(){
        String acceptableUsePolicyPage = AcceptableUsePolicyPage.validateAcceptableUsePolicyPageTitle();
        Assert.assertEquals(acceptableUsePolicyPage, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateAcceptableUsePolicyPageTest(){
        acceptableUsePolicyPage.clickOnAcceptableUsePolicyLink();
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
