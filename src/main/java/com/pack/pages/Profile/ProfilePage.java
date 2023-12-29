package com.pack.pages.Profile;

import com.pack.base.TestBase;
import com.pack.pages.Subscription.SubscriptionPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends TestBase {

    @FindBy(xpath = "//i[contains(@class,'fi fi-rr-caret-down cstm-icon-mn')]")
    WebElement ProfileIcon;

    @FindBy(xpath = "//a[@href='/profile']")
    WebElement Profile;

    public ProfilePage(){
        PageFactory.initElements(driver, this);
    }

    public static String validateProfilePageTitle(){
        return driver.getTitle();
    }

    public ProfilePage clickOnProfileLink(){
        ProfileIcon.click();
        Profile.click();
        return new ProfilePage();
    }
}
