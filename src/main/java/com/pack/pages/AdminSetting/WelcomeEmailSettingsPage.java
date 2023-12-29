package com.pack.pages.AdminSetting;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeEmailSettingsPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Admin Setting')]")
    WebElement AdminSettingDropdown;

    @FindBy(xpath = "//a[@href='/welcome-email-settings']")
    WebElement WelcomeEmailSettings;

    public WelcomeEmailSettingsPage(){
        PageFactory.initElements(driver, this);
    }

    public static String validateWelcomeEmailSettingsPageTitle(){
        return driver.getTitle();
    }

    public WelcomeEmailSettingsPage clickOnWelcomeEmailSettingsLink(){
        AdminSettingDropdown.click();
        WelcomeEmailSettings.click();
        return new WelcomeEmailSettingsPage();
    }
}
