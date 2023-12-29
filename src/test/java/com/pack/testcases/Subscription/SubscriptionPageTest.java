package com.pack.testcases.Subscription;

import com.pack.base.TestBase;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.pages.Subscription.SubscriptionPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SubscriptionPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    SubscriptionPage subscriptionPage;
    TestUtil testUtil;

    public SubscriptionPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        subscriptionPage = new SubscriptionPage();
    }

    @Test(priority=1)
    public void verifySubscriptionPageTitleTest(){
        String subscriptionPageTitle = SubscriptionPage.validateSubscriptionPageTitle();
        Assert.assertEquals(subscriptionPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateSubscriptionPageTest(){
        subscriptionPage.clickOnSubscriptionLink();
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
