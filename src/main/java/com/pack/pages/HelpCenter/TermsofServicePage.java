package com.pack.pages.HelpCenter;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TermsofServicePage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Help Center')]")
    WebElement HelpCenterDropdown;

    @FindBy(xpath = "//a[@href='/terms-of-service'][contains(.,'Terms of Service')]")
    WebElement TermsofService;

    public TermsofServicePage(){
        PageFactory.initElements(driver, this);
    }

    public String validateTermsofServicePageTitle(){
        return driver.getTitle();
    }

    public TermsofServicePage clickOnTermsofServiceLink(){
        HelpCenterDropdown.click();
        TermsofService.click();
        return new TermsofServicePage();
    }
}
