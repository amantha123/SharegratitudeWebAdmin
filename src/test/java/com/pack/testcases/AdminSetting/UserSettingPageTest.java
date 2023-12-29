package com.pack.testcases.AdminSetting;

import com.pack.base.TestBase;
import com.pack.pages.AdminSetting.UserSettingPage;
import com.pack.pages.Creed.CreedPage;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserSettingPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    UserSettingPage userSettingPage;
    TestUtil testUtil;

    public UserSettingPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        userSettingPage = new UserSettingPage();
    }

    @Test(priority=1)
    public void verifyUserSettingPageTitleTest(){
        String userSettingPageTitle = UserSettingPage.validateUserSettingPageTitle();
        Assert.assertEquals(userSettingPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateUserSettingPageTest(){
        userSettingPage.clickOnUserSettingLink();
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
