package com.pack.pages.Users;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartialSignUpsPage extends TestBase {

    @FindBy(xpath = "(//a[@href='#'][contains(.,'Users')])[1]")
    WebElement UsersDropdown;

    @FindBy(xpath = "//a[@href='/partially-registered-users'][contains(.,'Partial Sign ups')]")
    WebElement PartialSignUps;

    @FindBy(xpath = "//h4[@class='mb-0'][contains(.,'Partially Registered Users')]")
    WebElement PartiallyRegisteredUsers;

    @FindBy(xpath = "//input[contains(@id,'search-user')]")
    WebElement SearchBox;

    public PartialSignUpsPage(){
        PageFactory.initElements(driver, this);
    }

    public String validatePartialSignUpsPageTitle(){
        return driver.getTitle();
    }

    public PartialSignUpsPage clickOnPartialSignUpsLink(){
        UsersDropdown.click();
        PartialSignUps.click();
        return new PartialSignUpsPage();
    }

    public boolean verifyPartiallyRegisteredUsersLabel(){
        return PartiallyRegisteredUsers.isDisplayed();
    }

    public boolean verifySearchBox(){
        return SearchBox.isDisplayed();
    }

    public void verifySearchingUsers(){
        SearchBox.click();
        SearchBox.sendKeys("774848816");
    }
}
