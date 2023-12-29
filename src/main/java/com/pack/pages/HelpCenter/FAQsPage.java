package com.pack.pages.HelpCenter;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FAQsPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Help Center')]")
    WebElement HelpCenterDropdown;

    @FindBy(xpath = "//a[@href='/faq'][contains(.,'FAQ’s')]")
    WebElement FAQs;

    public FAQsPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateFAQsPageTitle(){
        return driver.getTitle();
    }

    public FAQsPage clickOnFAQsLink(){
        HelpCenterDropdown.click();
        FAQs.click();
        return new FAQsPage();
    }
}
