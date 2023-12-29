package com.pack.testcases.Users;

import com.pack.base.TestBase;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.pages.Users.UsersPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsersPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    UsersPage usersListPage;
    TestUtil testUtil;

    public UsersPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        usersListPage = new UsersPage();
    }

    @Test(priority=1)
    public void verifyUsersListPageTitleTest(){
        String usersListPageTitle = usersListPage.validateUsersListPageTitle();
        Assert.assertEquals(usersListPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateUsersListPageTest(){
        usersListPage.clickOnUsersLink();
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
    public void verifyUsersListPageTest(){
        usersListPage.clickOnUsersLink();
        usersListPage.verifyUserDetailsLabel();
        usersListPage.verifySearchBox();
        usersListPage.verifyAddUserBtn();
        usersListPage.verifyDownloadIcon();
        usersListPage.verifyFilterIcon();
    }

    @Test(priority = 4)
    public void searchUsersListTest(){
        usersListPage.clickOnUsersLink();
        usersListPage.searchUsersPage();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
