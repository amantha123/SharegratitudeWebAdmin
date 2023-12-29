package com.pack.pages.Organization;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeamsSuggestionPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Organization')]")
    WebElement OrganizationDropdown;

    @FindBy(xpath = "//a[@href='/team'][contains(.,'Teams Suggestion')]")
    WebElement TeamsSuggestion;

    public TeamsSuggestionPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateTeamsSuggestionPageTitle(){
        return driver.getTitle();
    }

    public TeamsSuggestionPage clickOnTeamsSuggestionLink(){
        OrganizationDropdown.click();
        TeamsSuggestion.click();
        return new TeamsSuggestionPage();
    }
}
