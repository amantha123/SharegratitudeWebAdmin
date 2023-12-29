package com.pack.pages.ThankYou;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouPage extends TestBase {

    @FindBy(xpath = "//a[@href='/thank-you-list'][contains(.,'Thank you list')]")
    WebElement ThankYou;

    public ThankYouPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateThankYouPageTitle(){
        return driver.getTitle();
    }

    public ThankYouPage clickOnThankYouLink(){
        ThankYou.click();
        return new ThankYouPage();
    }
}
