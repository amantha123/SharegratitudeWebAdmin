package com.pack.testcases.NewsandStories;

import com.pack.base.TestBase;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.pages.NewsandStories.NewsStoriesPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewsStoriesPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    NewsStoriesPage newsStoriesPage;
    TestUtil testUtil;

    public NewsStoriesPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        newsStoriesPage = new NewsStoriesPage();
    }

    @Test(priority=1)
    public void verifyNewsStoriesPageTitleTest(){
        String newsStoriesPageTitle = newsStoriesPage.validateNewsStoriesPageTitle();
        Assert.assertEquals(newsStoriesPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateNewsStoriesPageTest(){
        newsStoriesPage.clickOnNewsStoriesLink();
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
