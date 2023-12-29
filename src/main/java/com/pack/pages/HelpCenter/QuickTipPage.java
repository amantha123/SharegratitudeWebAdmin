package com.pack.pages.HelpCenter;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickTipPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Help Center')]")
    WebElement HelpCenterDropdown;

    @FindBy(xpath = "//a[@href='/quicktip'][contains(.,'Quick Tip')]")
    WebElement QuickTip;

    public QuickTipPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateQuickTipPageTitle(){
        return driver.getTitle();
    }

    public QuickTipPage clickOnQuickTipLink(){
        HelpCenterDropdown.click();
        QuickTip.click();
        return new QuickTipPage();
    }
}
