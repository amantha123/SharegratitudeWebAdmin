package com.pack.testcases.Users;

import com.pack.base.TestBase;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.pages.Users.TeamJoinRequestsPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TeamJoinRequestsPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    TeamJoinRequestsPage teamJoinRequestsPage;
    TestUtil testUtil;

    public TeamJoinRequestsPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        teamJoinRequestsPage = new TeamJoinRequestsPage();
    }

    @Test(priority=1)
    public void verifyTeamJoinRequestsPageTitleTest(){
        String teamJoinRequestsPageTitle = teamJoinRequestsPage.validateTeamJoinRequestsPageTitle();
        Assert.assertEquals(teamJoinRequestsPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateTeamJoinRequestsPageTest(){
        teamJoinRequestsPage.clickOnTeamJoinRequestsLink();
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
