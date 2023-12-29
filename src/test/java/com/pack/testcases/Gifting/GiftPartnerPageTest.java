package com.pack.testcases.Gifting;

import com.pack.base.TestBase;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Gifting.GiftPartnerPage;
import com.pack.pages.Login.LoginPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GiftPartnerPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    GiftPartnerPage giftPartnerPage;
    TestUtil testUtil;

    public GiftPartnerPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        giftPartnerPage = new GiftPartnerPage();
    }

    @Test(priority=1)
    public void verifyGiftPartnerPageTitleTest(){
        String giftPartnerPageTitle = giftPartnerPage.validateGiftPartnerPageTitle();
        Assert.assertEquals(giftPartnerPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateGiftPartnerPageTest(){
        giftPartnerPage.clickOnGiftPartnerLink();
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
