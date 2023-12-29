package com.pack.pages.Organization;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnregisteredOrganizationsPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Organization')]")
    WebElement OrganizationDropdown;

    @FindBy(xpath = "//a[@href='/unregistered-organization'][contains(.,'Unregistered Organizations')]")
    WebElement UnregisteredOrganizations;

    @FindBy(xpath = "//h4[@class='mb-0'][contains(.,'Unregistered Organization List')]")
    WebElement UnregisteredOrganizationListLabel;

    public UnregisteredOrganizationsPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateUnregisteredOrganizationsPageTitle(){
        return driver.getTitle();
    }

    public UnregisteredOrganizationsPage clickOnUnregisteredOrganizationsLink(){
        OrganizationDropdown.click();
        UnregisteredOrganizations.click();
        return new UnregisteredOrganizationsPage();
    }

    public boolean verifyUnregisteredOrganizationListLabel(){
        return UnregisteredOrganizationListLabel.isDisplayed();
    }
}
