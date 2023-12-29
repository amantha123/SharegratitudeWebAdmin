package com.pack.pages.Charity;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CharityCategoriesPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Charity')]")
    WebElement CharityDropdown;

    @FindBy(xpath = "//a[@href='/charity-categories'][contains(.,'Charity Categories')]")
    WebElement CharityCategories;

    public CharityCategoriesPage(){
        PageFactory.initElements(driver, this);
    }

    public static String validateCharityCategoriesPageTitle(){
        return driver.getTitle();
    }

    public CharityCategoriesPage clickOnCharityCategoriesLink(){
        CharityDropdown.click();
        CharityCategories.click();
        return new CharityCategoriesPage();
    }
}
