package com.pack.pages.Gifting;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftPartnerPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Gifting')]")
    WebElement GiftingDropdown;

    @FindBy(xpath = "//a[@href='/gift-partner'][contains(.,'Gift Partner')]")
    WebElement GiftPartner;

    public GiftPartnerPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateGiftPartnerPageTitle(){
        return driver.getTitle();
    }

    public GiftPartnerPage clickOnGiftPartnerLink(){
        GiftingDropdown.click();
        GiftPartner.click();
        return new GiftPartnerPage();
    }
}
