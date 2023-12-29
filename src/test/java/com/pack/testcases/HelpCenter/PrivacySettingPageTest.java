package com.pack.testcases.HelpCenter;

import com.pack.base.TestBase;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.pages.HelpCenter.PrivacySettingPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrivacySettingPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    PrivacySettingPage privacySettingPage;
    TestUtil testUtil;

    public PrivacySettingPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        privacySettingPage = new PrivacySettingPage();
    }

    @Test(priority=1)
    public void verifyPrivacySettingPageTitleTest(){
        String privacySettingPageTitle = PrivacySettingPage.validatePrivacySettingPageTitle();
        Assert.assertEquals(privacySettingPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigatePrivacySettingPageTest(){
        privacySettingPage.clickOnPrivacySettingLink();
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
