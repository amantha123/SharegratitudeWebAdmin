package com.pack.pages.Charity;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArchivedCharityPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Charity')]")
    WebElement CharityDropdown;

    @FindBy(xpath = "//a[@href='/archived-charity'][contains(.,'Archived Charity')]")
    WebElement ArchivedCharity;

    public ArchivedCharityPage(){
        PageFactory.initElements(driver, this);
    }

    public static String validateArchivedCharityPageTitle(){
        return driver.getTitle();
    }

    public ArchivedCharityPage clickOnArchivedCharityLink(){
        CharityDropdown.click();
        ArchivedCharity.click();
        return new ArchivedCharityPage();
    }
}
