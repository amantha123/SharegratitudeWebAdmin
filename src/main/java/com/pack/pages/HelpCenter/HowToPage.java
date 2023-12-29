package com.pack.pages.HelpCenter;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HowToPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Help Center')]")
    WebElement HelpCenterDropdown;

    @FindBy(xpath = "//a[@href='/how-to-list'][contains(.,'How To')]")
    WebElement HowTo;

    public HowToPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateHowToPageTitle(){
        return driver.getTitle();
    }

    public HowToPage clickOnHowToLink(){
        HelpCenterDropdown.click();
        HowTo.click();
        return new HowToPage();
    }
}
