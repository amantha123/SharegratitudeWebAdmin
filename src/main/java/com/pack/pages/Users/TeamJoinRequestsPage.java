package com.pack.pages.Users;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeamJoinRequestsPage extends TestBase {

    @FindBy(xpath = "(//a[@href='#'][contains(.,'Users')])[1]")
    WebElement UsersDropdown;

    @FindBy(xpath = "//a[@href='/team-join-request'][contains(.,'Team Join Requests')]")
    WebElement TeamJoinRequests;

    public TeamJoinRequestsPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateTeamJoinRequestsPageTitle(){
        return driver.getTitle();
    }

    public TeamJoinRequestsPage clickOnTeamJoinRequestsLink(){
        UsersDropdown.click();
        TeamJoinRequests.click();
        return new TeamJoinRequestsPage();
    }
}
