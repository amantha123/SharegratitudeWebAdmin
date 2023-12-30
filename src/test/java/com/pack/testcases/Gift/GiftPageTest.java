package com.pack.testcases.Gift;

import com.pack.base.TestBase;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Gift.GiftPage;
import com.pack.pages.Login.LoginPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GiftPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    GiftPage giftPage;
    TestUtil testUtil;

    public GiftPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        giftPage = new GiftPage();
    }

    @Test(priority=1)
    public void verifyGiftPageTitleTest(){
        String giftPageTitle = giftPage.validateGiftPageTitle();
        Assert.assertEquals(giftPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateGiftPageTest(){
        giftPage.clickOnGiftLink();
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test(priority = 3)
    public void verifyGiftPageTest(){
        giftPage.clickOnGiftLink();
        giftPage.verifySearchBox();
        giftPage.verifyFilterIcon();
        giftPage.verifyDownloadIcon();
    }

    @Test(priority = 4)
    public void verifySearchingUsersTest(){
        giftPage.clickOnGiftLink();
        giftPage.verifySearchingUsers();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
