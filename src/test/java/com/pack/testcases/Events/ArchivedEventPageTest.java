package com.pack.testcases.Events;

import com.pack.base.TestBase;
import com.pack.pages.Events.ArchivedEventPage;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArchivedEventPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    ArchivedEventPage archivedEventPage;
    TestUtil testUtil;

    public ArchivedEventPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        archivedEventPage = new ArchivedEventPage();
    }

    @Test(priority=1)
    public void verifyArchivedEventPageTitleTest(){
        String archivedEventPageTitle = archivedEventPage.validateArchivedEventPageTitle();
        Assert.assertEquals(archivedEventPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateArchivedEventPageTest(){
        archivedEventPage.clickOnArchivedEventLink();
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
