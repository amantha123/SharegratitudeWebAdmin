package com.pack.testcases.Profile;

import com.pack.base.TestBase;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.pages.Profile.ProfilePage;
import com.pack.pages.Subscription.SubscriptionPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfilePageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    ProfilePage profilePage;
    TestUtil testUtil;

    public ProfilePageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        profilePage = new ProfilePage();
    }

    @Test(priority=1)
    public void verifyProfilePageTitleTest(){
        String profilePageTitle = ProfilePage.validateProfilePageTitle();
        Assert.assertEquals(profilePageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateProfilePageTest(){
        profilePage.clickOnProfileLink();
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
