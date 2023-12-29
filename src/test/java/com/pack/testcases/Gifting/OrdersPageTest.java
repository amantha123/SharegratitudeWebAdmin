package com.pack.testcases.Gifting;

import com.pack.base.TestBase;
import com.pack.pages.Dashboard.DashboardPage;
import com.pack.pages.Login.LoginPage;
import com.pack.pages.Gifting.OrdersPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrdersPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    OrdersPage ordersPage;
    TestUtil testUtil;

    public OrdersPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        ordersPage = new OrdersPage();
    }

    @Test(priority=1)
    public void verifyOrdersPageTitleTest(){
        String ordersPageTitle = ordersPage.validateOrdersPageTitle();
        Assert.assertEquals(ordersPageTitle, "Share Gratitude");
    }

    @Test(priority = 2)
    public void navigateOrdersPageTest(){
        ordersPage.clickOnOrdersLink();
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
