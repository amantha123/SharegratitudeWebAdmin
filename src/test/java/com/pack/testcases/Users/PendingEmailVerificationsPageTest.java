package com.pack.testcases.Users;

import com.pack.base.TestBase;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.pages.Users.PendingEmailVerificationsPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PendingEmailVerificationsPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    PendingEmailVerificationsPage pendingEmailVerificationsPage;
    TestUtil testUtil;

    public PendingEmailVerificationsPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        pendingEmailVerificationsPage = new PendingEmailVerificationsPage();
    }

    @Test(priority=1)
    public void verifyPendingEmailVerificationsPageTitleTest(){
        String pendingEmailVerificationsPageTitle = pendingEmailVerificationsPage.validatePendingEmailVerificationsPageTitle();
        Assert.assertEquals(pendingEmailVerificationsPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigatePendingEmailVerificationsPageTest(){
        pendingEmailVerificationsPage.clickOnPendingEmailVerificationsLink();
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
    public void verifyPendingEmailVerificationsPageTest(){
        pendingEmailVerificationsPage.clickOnPendingEmailVerificationsLink();
        pendingEmailVerificationsPage.verifyPendingEmailVerificationsLabel();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
