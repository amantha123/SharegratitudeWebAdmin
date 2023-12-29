package com.pack.pages.Events;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventCategoriesPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Events')]")
    WebElement EventsDropdown;

    @FindBy(xpath = "//a[@href='/event-categories'][contains(.,'Event Categories')]")
    WebElement EventCategories;

    public EventCategoriesPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateEventCategoriesPageTitle(){
        return driver.getTitle();
    }

    public EventCategoriesPage clickOnEventCategoriesLink(){
        EventsDropdown.click();
        EventCategories.click();
        return new EventCategoriesPage();
    }
}
