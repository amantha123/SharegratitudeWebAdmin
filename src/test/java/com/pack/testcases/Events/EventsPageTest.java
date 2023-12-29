package com.pack.testcases.Events;

import com.pack.base.TestBase;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Events.EventsPage;
import com.pack.pages.Login.LoginPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EventsPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    EventsPage eventsPage;
    TestUtil testUtil;

    public EventsPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        eventsPage = new EventsPage();
    }

    @Test(priority=1)
    public void verifyEventsPageTitleTest(){
        String eventsPageTitle = eventsPage.validateEventsPageTitle();
        Assert.assertEquals(eventsPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateEventsPageTest(){
        eventsPage.clickOnEventsLink();
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
