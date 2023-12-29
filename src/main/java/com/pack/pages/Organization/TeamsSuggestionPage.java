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

    @FindBy(xpath = "//h4[contains(@class,'mb-0')]")
    WebElement TeamListLabel;

    @FindBy(xpath = "//input[contains(@id,'serch-team')]")
    WebElement SearchBox;

    @FindBy(xpath = "//button[@class='cstm-btn'][contains(.,'Add Team')]")
    WebElement AddTeamBtn;

    @FindBy(xpath = "//input[contains(@placeholder,'Enter Team Suggestion')]")
    WebElement TeamSuggestionField;

    @FindBy(xpath = "//button[@class=' cstm-btn'][contains(.,'Add Team Suggestion')]")
    WebElement AddTeamSuggestionBtn;

    @FindBy(xpath = "//span[contains(.,'Enter team suggstion')]")
    WebElement Validation;

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

    public boolean verifyTeamListLabel(){
        return TeamListLabel.isDisplayed();
    }

    public boolean verifySearchBox(){
        return SearchBox.isDisplayed();
    }

    public boolean verifyAddTeamBtn(){
        return AddTeamBtn.isDisplayed();
    }

    public void verifySearchingTeams(){
        SearchBox.click();
        SearchBox.sendKeys("Finance");
    }

    public void verifyMandatoryFields(){
        AddTeamBtn.click();
        AddTeamSuggestionBtn.click();
        Validation.isDisplayed();
    }

    public void verifyAddingTeamSuggestion(){
        AddTeamBtn.click();
        TeamSuggestionField.click();
        TeamSuggestionField.sendKeys("New Finance Team");
        AddTeamSuggestionBtn.click();
    }


}
