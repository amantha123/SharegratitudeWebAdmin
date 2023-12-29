package com.pack.testcases.Moderation;

import com.pack.base.TestBase;
import com.pack.pages.Moderation.CommunityModerationPage;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CommunityModerationPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    CommunityModerationPage communityModerationPage;
    TestUtil testUtil;

    public CommunityModerationPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        communityModerationPage = new CommunityModerationPage();
    }

    @Test(priority=1)
    public void verifyCommunityModerationPageTitleTest(){
        String communityModerationPageTitle = communityModerationPage.validateCommunityModerationPageTitle();
        Assert.assertEquals(communityModerationPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateCommunityModerationPageTest(){
        communityModerationPage.clickOnCommunityModerationLink();
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
