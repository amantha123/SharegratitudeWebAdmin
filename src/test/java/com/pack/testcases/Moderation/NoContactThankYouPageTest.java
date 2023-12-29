package com.pack.testcases.Moderation;

import com.pack.base.TestBase;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.pages.Moderation.NoContactThankYouPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NoContactThankYouPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    NoContactThankYouPage noContactThankYouPage;
    TestUtil testUtil;

    public NoContactThankYouPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        noContactThankYouPage = new NoContactThankYouPage();
    }

    @Test(priority=1)
    public void verifyNoContactThankYouPageTitleTest(){
        String noContactThankYouPageTitle = noContactThankYouPage.validateNoContactThankYouPageTitle();
        Assert.assertEquals(noContactThankYouPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateNoContactThankYouPageTest(){
        noContactThankYouPage.clickOnNoContactThankYouLink();
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
