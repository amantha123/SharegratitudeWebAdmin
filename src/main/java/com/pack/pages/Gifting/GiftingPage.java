package com.pack.pages.Gifting;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftingPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Gifting')]")
    WebElement GiftingDropdown;

    @FindBy(xpath = "//a[@href='/gift'][contains(.,'Gifting')]")
    WebElement Gifting;

    public GiftingPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateGiftingPageTitle(){
        return driver.getTitle();
    }

    public GiftingPage clickOnGiftingLink(){
        GiftingDropdown.click();
        Gifting.click();
        return new GiftingPage();
    }
}
