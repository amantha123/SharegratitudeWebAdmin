package com.pack.pages.AdminSetting;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserSettingPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Admin Setting')]")
    WebElement AdminSettingDropdown;

    @FindBy(xpath = "//a[@href='/admin-settings'][contains(.,'User Settings')]")
    WebElement UserSettings;

    public UserSettingPage(){
        PageFactory.initElements(driver, this);
    }

    public static String validateUserSettingPageTitle(){
        return driver.getTitle();
    }

    public UserSettingPage clickOnUserSettingLink(){
        AdminSettingDropdown.click();
        UserSettings.click();
        return new UserSettingPage();
    }
}
