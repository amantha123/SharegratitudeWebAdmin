package com.pack.pages.Gift;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftPage extends TestBase {

    @FindBy(xpath = "//a[@href='/gift-list'][contains(.,'Gift list')]")
    WebElement Gift;

    public GiftPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateGiftPageTitle(){
        return driver.getTitle();
    }

    public GiftPage clickOnGiftLink(){
        Gift.click();
        return new GiftPage();
    }
}
