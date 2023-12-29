package com.pack.pages.Events;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventsPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Events')]")
    WebElement EventsDropdown;

    @FindBy(xpath = "//a[@href='/event'][contains(.,'Events List')]")
    WebElement Events;

    public EventsPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateEventsPageTitle(){
        return driver.getTitle();
    }

    public EventsPage clickOnEventsLink(){
        EventsDropdown.click();
        Events.click();
        return new EventsPage();
    }

}
