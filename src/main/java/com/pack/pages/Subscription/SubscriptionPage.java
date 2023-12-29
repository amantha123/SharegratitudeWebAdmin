package com.pack.pages.Subscription;

import com.pack.base.TestBase;
import com.pack.pages.Charity.ArchivedCharityPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscriptionPage extends TestBase {

    @FindBy(xpath = "//a[@href='/subscription']")
    WebElement Subscription;

    public SubscriptionPage(){
        PageFactory.initElements(driver, this);
    }

    public static String validateSubscriptionPageTitle(){
        return driver.getTitle();
    }

    public SubscriptionPage clickOnSubscriptionLink(){
        Subscription.click();
        return new SubscriptionPage();
    }
}
