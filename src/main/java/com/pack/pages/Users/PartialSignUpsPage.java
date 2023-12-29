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
}
