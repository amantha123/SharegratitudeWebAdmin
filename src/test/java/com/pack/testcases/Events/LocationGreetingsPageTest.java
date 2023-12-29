package com.pack.testcases.Events;

import com.pack.base.TestBase;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Events.LocationGreetingsPage;
import com.pack.pages.Login.LoginPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LocationGreetingsPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    LocationGreetingsPage locationGreetingsPage;
    TestUtil testUtil;

    public LocationGreetingsPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        locationGreetingsPage = new LocationGreetingsPage();
    }

    @Test(priority=1)
    public void verifyLocationGreetingsPageTitleTest(){
        String locationGreetingsPageTitle = locationGreetingsPage.validateLocationGreetingsPageTitle();
        Assert.assertEquals(locationGreetingsPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateLocationGreetingsPageTest(){
        locationGreetingsPage.clickOnLocationGreetingsLink();
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
