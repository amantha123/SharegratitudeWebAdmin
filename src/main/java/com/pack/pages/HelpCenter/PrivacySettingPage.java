package com.pack.pages.HelpCenter;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacySettingPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Help Center')]")
    WebElement HelpCenterDropdown;

    @FindBy(xpath = "//a[@href='/privacy-setting'][contains(.,'Privacy Setting')]")
    WebElement PrivacySetting;

    public PrivacySettingPage(){
        PageFactory.initElements(driver, this);
    }

    public static String validatePrivacySettingPageTitle(){
        return driver.getTitle();
    }

    public PrivacySettingPage clickOnPrivacySettingLink(){
        HelpCenterDropdown.click();
        PrivacySetting.click();
        return new PrivacySettingPage();
    }
}
