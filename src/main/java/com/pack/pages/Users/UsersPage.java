package com.pack.pages.Users;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage extends TestBase {

    @FindBy(xpath = "(//a[@href='#'][contains(.,'Users')])[1]")
    WebElement UsersDropdown;

    @FindBy(xpath = "//a[@href='/user'][contains(.,'Users')]")
    WebElement Users;

    public UsersPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateUsersListPageTitle(){
        return driver.getTitle();
    }

    public UsersPage clickOnUsersLink(){
        UsersDropdown.click();
        Users.click();
        return new UsersPage();
    }
}
