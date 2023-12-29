package com.pack.pages.AccountSetting;

import com.pack.base.TestBase;
import com.pack.pages.Profile.ProfilePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSettingPage extends TestBase {

    @FindBy(xpath = "//i[contains(@class,'fi fi-rr-caret-down cstm-icon-mn')]")
    WebElement ProfileIcon;

    @FindBy(xpath = "//a[@href='/account-setting'][contains(.,'Account Setting')]")
    WebElement AccountSetting;

    public AccountSettingPage(){
        PageFactory.initElements(driver, this);
    }

    public static String validateAccountSettingPageTitle(){
        return driver.getTitle();
    }

    public AccountSettingPage clickOnAccountSettingLink(){
        ProfileIcon.click();
        AccountSetting.click();
        return new AccountSettingPage();
    }
}
