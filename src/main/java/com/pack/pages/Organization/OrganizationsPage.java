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

    @FindBy(xpath = "//h4[contains(@class,'mb-0')]")
    WebElement OrganizationListLabel;

    @FindBy(xpath = "//input[contains(@id,'serch-organization')]")
    WebElement SearchBox;

    @FindBy(xpath = "//button[@class='cstm-btn'][contains(.,'Add Organization')]")
    WebElement AddOrganizationBtn;

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

    public boolean verifyOrganizationListLabel(){
        return OrganizationListLabel.isDisplayed();
    }

    public boolean verifySearchBox(){
        return SearchBox.isDisplayed();
    }

    public boolean verifyAddOrganizationBtn(){
        return AddOrganizationBtn.isDisplayed();
    }

    public void verifySearchingOrganizations(){
        SearchBox.click();
        SearchBox.sendKeys("Royal");
    }
}
