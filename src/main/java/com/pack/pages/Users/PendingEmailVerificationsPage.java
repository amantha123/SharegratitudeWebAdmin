package com.pack.pages.Users;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PendingEmailVerificationsPage extends TestBase {

    @FindBy(xpath = "(//a[@href='#'][contains(.,'Users')])[1]")
    WebElement UsersDropdown;

    @FindBy(xpath = "//a[@href='/pending-email-verification-users'][contains(.,'Pending Email Verifications')]")
    WebElement PendingEmailVerifications;

    public PendingEmailVerificationsPage(){
        PageFactory.initElements(driver, this);
    }

    public String validatePendingEmailVerificationsPageTitle(){
        return driver.getTitle();
    }

    public PendingEmailVerificationsPage clickOnPendingEmailVerificationsLink(){
        UsersDropdown.click();
        PendingEmailVerifications.click();
        return new PendingEmailVerificationsPage();
    }
}
