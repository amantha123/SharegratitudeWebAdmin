package com.pack.testcases.AppQRCode;

import com.pack.base.TestBase;
import com.pack.pages.AppQRCode.AppQRCodePage;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppQRCodePageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    AppQRCodePage appQRCodePage;
    TestUtil testUtil;

    public AppQRCodePageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        appQRCodePage = new AppQRCodePage();
    }

    @Test(priority=1)
    public void verifyWelcomeAppQRCodePageTitleTest(){
        String appQRCodePageTitle = AppQRCodePage.validateAppQRCodePageTitle();
        Assert.assertEquals(appQRCodePageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateAppQRCodePageTest(){
        appQRCodePage.clickOnAppQRCodeLink();
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
