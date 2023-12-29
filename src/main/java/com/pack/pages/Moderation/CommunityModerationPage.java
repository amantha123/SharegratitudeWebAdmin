package com.pack.pages.Moderation;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommunityModerationPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Moderation')]")
    WebElement ModerationDropdown;

    @FindBy(xpath = "//a[@href='/community'][contains(.,'Community Moderation')]")
    WebElement CommunityModeration;

    public CommunityModerationPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateCommunityModerationPageTitle(){
        return driver.getTitle();
    }

    public CommunityModerationPage clickOnCommunityModerationLink(){
        CommunityModeration.click();
        return new CommunityModerationPage();
    }
}
