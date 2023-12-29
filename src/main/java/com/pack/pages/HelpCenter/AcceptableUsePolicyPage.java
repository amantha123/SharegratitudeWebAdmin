package com.pack.pages.HelpCenter;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcceptableUsePolicyPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Help Center')]")
    WebElement HelpCenterDropdown;

    @FindBy(xpath = "//a[@href='/acceptable-policy']")
    WebElement AcceptableUsePolicy;

    public AcceptableUsePolicyPage(){
        PageFactory.initElements(driver, this);
    }

    public static String validateAcceptableUsePolicyPageTitle(){
        return driver.getTitle();
    }

    public AcceptableUsePolicyPage clickOnAcceptableUsePolicyLink(){
        HelpCenterDropdown.click();
        AcceptableUsePolicy.click();
        return new AcceptableUsePolicyPage();
    }
}
