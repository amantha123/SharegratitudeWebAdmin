package com.pack.testcases.HelpCenter;

import com.pack.base.TestBase;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.pages.HelpCenter.TermsofServicePage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TermsofServicePageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    TermsofServicePage termsofServicePage;
    TestUtil testUtil;

    public TermsofServicePageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        termsofServicePage = new TermsofServicePage();
    }

    @Test(priority=1)
    public void verifyTermsofServicePageTitleTest(){
        String termsOfServicePageTitle = termsofServicePage.validateTermsofServicePageTitle();
        Assert.assertEquals(termsOfServicePageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateTermsofServicePageTest(){
        termsofServicePage.clickOnTermsofServiceLink();
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
