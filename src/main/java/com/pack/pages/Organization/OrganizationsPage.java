package com.pack.pages.Organization;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage extends TestBase {

    @FindBy(xpath = "//a[@href='#'][contains(.,'Organization')]")
    WebElement OrganizationDropdown;

    @FindBy(xpath = "//a[@href='/organization'][contains(.,'Organization List')]")
    WebElement Organization;

    public OrganizationsPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateOrganizationsPageTitle(){
        return driver.getTitle();
    }

    public OrganizationsPage clickOnOrganizationLink(){
        OrganizationDropdown.click();
        Organization.click();
        return new OrganizationsPage();
    }
}
