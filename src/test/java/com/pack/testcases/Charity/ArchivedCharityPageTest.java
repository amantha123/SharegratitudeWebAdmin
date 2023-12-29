package com.pack.testcases.Charity;

import com.pack.base.TestBase;
import com.pack.pages.Charity.ArchivedCharityPage;
import com.pack.pages.Charity.CharityCategoriesPage;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArchivedCharityPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    ArchivedCharityPage archivedCharityPage;
    TestUtil testUtil;

    public ArchivedCharityPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        archivedCharityPage = new ArchivedCharityPage();
    }

    @Test(priority=1)
    public void verifyArchivedCharityPageTitleTest(){
        String archivedCharityPageTitle = ArchivedCharityPage.validateArchivedCharityPageTitle();
        Assert.assertEquals(archivedCharityPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateArchivedCharityPageTest(){
        archivedCharityPage.clickOnArchivedCharityLink();
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
