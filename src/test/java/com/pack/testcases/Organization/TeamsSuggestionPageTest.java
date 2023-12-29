package com.pack.testcases.Organization;

import com.pack.base.TestBase;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.pages.Organization.TeamsSuggestionPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TeamsSuggestionPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    TeamsSuggestionPage teamsSuggestionPage;
    TestUtil testUtil;

    public TeamsSuggestionPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        teamsSuggestionPage = new TeamsSuggestionPage();
    }

    @Test(priority=1)
    public void verifyTeamsSuggestionPageTitleTest(){
        String teamsSuggestionPageTitle = teamsSuggestionPage.validateTeamsSuggestionPageTitle();
        Assert.assertEquals(teamsSuggestionPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateTeamsSuggestionPageTest(){
        teamsSuggestionPage.clickOnTeamsSuggestionLink();
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
    public void verifyTeamListPage(){
        teamsSuggestionPage.clickOnTeamsSuggestionLink();
        teamsSuggestionPage.verifyTeamListLabel();
        teamsSuggestionPage.verifySearchBox();
        teamsSuggestionPage.verifyAddTeamBtn();
    }

    @Test(priority = 4)
    public void verifySearchingTeamsTest(){
        teamsSuggestionPage.clickOnTeamsSuggestionLink();
        teamsSuggestionPage.verifySearchingTeams();
    }

    @Test(priority = 5)
    public void verifyMandatoryFieldsTest(){
        teamsSuggestionPage.clickOnTeamsSuggestionLink();
        teamsSuggestionPage.verifyMandatoryFields();
    }

    @Test(priority = 6)
    public void verifyAddingTeamSuggestionTest(){
        teamsSuggestionPage.clickOnTeamsSuggestionLink();
        teamsSuggestionPage.verifyAddingTeamSuggestion();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
