package com.pack.pages.Gifting;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Gifting')]")
    WebElement GiftingDropdown;

    @FindBy(xpath = "//a[@href='/orders'][contains(.,'Orders')]")
    WebElement Orders;

    public OrdersPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateOrdersPageTitle(){
        return driver.getTitle();
    }

    public OrdersPage clickOnOrdersLink(){
        GiftingDropdown.click();
        Orders.click();
        return new OrdersPage();
    }
}
