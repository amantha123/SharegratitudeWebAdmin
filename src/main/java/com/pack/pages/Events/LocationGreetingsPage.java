package com.pack.pages.Events;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationGreetingsPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Events')]")
    WebElement EventsDropdown;

    @FindBy(xpath = "//a[@href='/location-greetings'][contains(.,'Location Greetings')]")
    WebElement LocationGreetings;

    public LocationGreetingsPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateLocationGreetingsPageTitle(){
        return driver.getTitle();
    }

    public LocationGreetingsPage clickOnLocationGreetingsLink(){
        EventsDropdown.click();
        LocationGreetings.click();
        return new LocationGreetingsPage();
    }
}
