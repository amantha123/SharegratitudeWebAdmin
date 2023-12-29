package com.pack.testcases.Creed;

import com.pack.base.TestBase;
import com.pack.pages.Creed.CreedPage;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.pages.Subscription.SubscriptionPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreedPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    CreedPage creedPage;
    TestUtil testUtil;

    public CreedPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        creedPage = new CreedPage();
    }

    @Test(priority=1)
    public void verifyCreedPageTitleTest(){
        String creedPageTitle = CreedPage.validateCreedPageTitle();
        Assert.assertEquals(creedPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateCreedPageTest(){
        creedPage.clickOnCreedLink();
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
