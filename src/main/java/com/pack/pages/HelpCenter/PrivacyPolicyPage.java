package com.pack.pages.HelpCenter;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacyPolicyPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Help Center')]")
    WebElement HelpCenterDropdown;

    @FindBy(xpath = "//a[@href='/privacy-policy'][contains(.,'Privacy Policy')]")
    WebElement PrivacyPolicy;

    public PrivacyPolicyPage(){
        PageFactory.initElements(driver, this);
    }

    public static String validatePrivacyPolicyPageTitle(){
        return driver.getTitle();
    }

    public PrivacyPolicyPage clickOnPrivacyPolicyLink(){
        HelpCenterDropdown.click();
        PrivacyPolicy.click();
        return new PrivacyPolicyPage();
    }
}
