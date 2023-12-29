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

    @FindBy(xpath = "//h4[@class='mb-0'][contains(.,'User Details')]")
    WebElement UserDetails;

    @FindBy(xpath = "//input[contains(@id,'search-user')]")
    WebElement SearchBox;

    @FindBy(xpath = "//button[@class='cstm-btn'][contains(.,'Add User')]")
    WebElement AddUserBtn;

    @FindBy(xpath = "(//i[contains(@class,'fi fi-rr-download')])[1]")
    WebElement DownloadIcon;

    @FindBy(xpath = "//i[contains(@class,'fi fi-rr-settings-sliders')]")
    WebElement FilterIcon;

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

    public boolean verifyUserDetailsLabel(){
        return UserDetails.isDisplayed();
    }

    public boolean verifySearchBox(){
        return SearchBox.isDisplayed();
    }

    public boolean verifyAddUserBtn(){
        return AddUserBtn.isDisplayed();
    }

    public boolean verifyDownloadIcon(){
        return DownloadIcon.isDisplayed();
    }

    public boolean verifyFilterIcon(){
        return FilterIcon.isDisplayed();
    }

    public void searchUsersPage(){
        SearchBox.click();
        SearchBox.sendKeys("Amantha");
    }
}
