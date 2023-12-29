package com.pack.testcases.Charity;

import com.pack.base.TestBase;
import com.pack.pages.Charity.CharityCategoriesPage;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CharityCategoriesPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    CharityCategoriesPage charityCategoriesPage;
    TestUtil testUtil;

    public CharityCategoriesPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        charityCategoriesPage = new CharityCategoriesPage();
    }

    @Test(priority=1)
    public void verifyCharityCategoriesPageTitleTest(){
        String charityCategoriesPageTitle = CharityCategoriesPage.validateCharityCategoriesPageTitle();
        Assert.assertEquals(charityCategoriesPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateCharityCategoriesPageTest(){
        charityCategoriesPage.clickOnCharityCategoriesLink();
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
