package com.pack.pages.Creed;

import com.pack.base.TestBase;
import com.pack.pages.Subscription.SubscriptionPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.CRLReason;

public class CreedPage extends TestBase {

    @FindBy(xpath = "//a[@href='/creed'][contains(.,'Creed List')]")
    WebElement Creed;

    public CreedPage(){
        PageFactory.initElements(driver, this);
    }

    public static String validateCreedPageTitle(){
        return driver.getTitle();
    }

    public CreedPage clickOnCreedLink(){
        Creed.click();
        return new CreedPage();
    }
}
