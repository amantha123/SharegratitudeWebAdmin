package com.pack.testcases.ThankYou;

import com.pack.base.TestBase;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.pages.ThankYou.ThankYouPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThankYouPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    ThankYouPage thankYouPage;
    TestUtil testUtil;

    public ThankYouPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        thankYouPage = new ThankYouPage();
    }

    @Test(priority=1)
    public void verifyThankYouPageTitleTest(){
        String thankYouPageTitle = thankYouPage.validateThankYouPageTitle();
        Assert.assertEquals(thankYouPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateThankYouPageTest(){
        thankYouPage.clickOnThankYouLink();
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
