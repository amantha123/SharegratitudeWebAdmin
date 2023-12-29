package com.pack.testcases.HelpCenter;

import com.pack.base.TestBase;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.pages.HelpCenter.PrivacyPolicyPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrivacyPolicyPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    PrivacyPolicyPage privacyPolicyPage;
    TestUtil testUtil;

    public PrivacyPolicyPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        privacyPolicyPage = new PrivacyPolicyPage();
    }

    @Test(priority=1)
    public void verifyPrivacyPolicyPageTitleTest(){
        String privacyPolicyPageTitle = PrivacyPolicyPage.validatePrivacyPolicyPageTitle();
        Assert.assertEquals(privacyPolicyPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigatePrivacyPolicyPageTest(){
        privacyPolicyPage.clickOnPrivacyPolicyLink();
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
