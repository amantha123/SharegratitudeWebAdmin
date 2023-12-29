package com.pack.pages.Moderation;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoContactThankYouPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Moderation')]")
    WebElement ModerationDropdown;

    @FindBy(xpath = "//a[@href='/no-contact-thankyou-list'][contains(.,'No Contact Thank you list')]")
    WebElement NoContactThankYou;

    public NoContactThankYouPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateNoContactThankYouPageTitle(){
        return driver.getTitle();
    }

    public NoContactThankYouPage clickOnNoContactThankYouLink(){
        NoContactThankYou.click();
        return new NoContactThankYouPage();
    }
}
