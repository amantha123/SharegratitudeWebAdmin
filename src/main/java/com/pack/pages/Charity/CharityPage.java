package com.pack.pages.Charity;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CharityPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Charity')]")
    WebElement CharityDropdown;

    @FindBy(xpath = "//a[@href='/charity'][contains(.,'Charity List')]")
    WebElement Charity;

    public CharityPage(){
        PageFactory.initElements(driver, this);
    }

    public static String validateCharityPageTitle(){
        return driver.getTitle();
    }

    public CharityPage clickOnCharityLink(){
        CharityDropdown.click();
        Charity.click();
        return new CharityPage();
    }
}
