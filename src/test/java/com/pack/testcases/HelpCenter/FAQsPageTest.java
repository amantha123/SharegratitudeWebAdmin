package com.pack.testcases.HelpCenter;

import com.pack.base.TestBase;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.HelpCenter.FAQsPage;
import com.pack.pages.Login.LoginPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FAQsPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    FAQsPage faQsPage;
    TestUtil testUtil;

    public FAQsPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        faQsPage = new FAQsPage();
    }

    @Test(priority=1)
    public void verifyFAQsPageTitleTest(){
        String faqsPageTitle = faQsPage.validateFAQsPageTitle();
        Assert.assertEquals(faqsPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateFAQsPageTest(){
        faQsPage.clickOnFAQsLink();
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
