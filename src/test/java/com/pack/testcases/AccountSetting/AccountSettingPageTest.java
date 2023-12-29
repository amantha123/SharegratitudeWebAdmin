package com.pack.testcases.AccountSetting;

import com.pack.base.TestBase;
import com.pack.pages.AccountSetting.AccountSettingPage;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountSettingPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    AccountSettingPage accountSettingPage;
    TestUtil testUtil;

    public AccountSettingPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        accountSettingPage = new AccountSettingPage();
    }

    @Test(priority=1)
    public void verifyAccountSettingPageTitleTest(){
        String accountSettingPageTitle = accountSettingPage.validateAccountSettingPageTitle();
        Assert.assertEquals(accountSettingPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateAccountSettingPageTest(){
        accountSettingPage.clickOnAccountSettingLink();
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
