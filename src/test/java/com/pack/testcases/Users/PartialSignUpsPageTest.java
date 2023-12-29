package com.pack.testcases.Users;

import com.pack.base.TestBase;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.pages.Users.PartialSignUpsPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PartialSignUpsPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    PartialSignUpsPage partialSignUpsPage;
    TestUtil testUtil;

    public PartialSignUpsPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        partialSignUpsPage = new PartialSignUpsPage();
    }

    @Test(priority=1)
    public void verifyPartialSignUpsPageTitleTest(){
        String partialSignUpsPageTitle = partialSignUpsPage.validatePartialSignUpsPageTitle();
        Assert.assertEquals(partialSignUpsPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigatePartialSignUpsPageTest(){
        partialSignUpsPage.clickOnPartialSignUpsLink();
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
    public void verifyPartiallyRegisteredUsersPageTest(){
        partialSignUpsPage.clickOnPartialSignUpsLink();
        partialSignUpsPage.verifyPartiallyRegisteredUsersLabel();
        partialSignUpsPage.verifySearchBox();
    }

    @Test(priority = 4)
    public void verifySearchingUsersTest(){
        partialSignUpsPage.clickOnPartialSignUpsLink();
        partialSignUpsPage.verifySearchingUsers();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
