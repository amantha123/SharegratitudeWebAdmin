package com.pack.pages.Events;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArchivedEventPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Events')]")
    WebElement EventsDropdown;

    @FindBy(xpath = "//a[@href='/archived-event'][contains(.,'Archived Event')]")
    WebElement ArchivedEvent;

    public ArchivedEventPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateArchivedEventPageTitle(){
        return driver.getTitle();
    }

    public ArchivedEventPage clickOnArchivedEventLink(){
        EventsDropdown.click();
        ArchivedEvent.click();
        return new ArchivedEventPage();
    }
}
