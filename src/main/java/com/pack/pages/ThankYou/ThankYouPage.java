package com.pack.pages.ThankYou;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouPage extends TestBase {

    @FindBy(xpath = "//a[@href='/thank-you-list'][contains(.,'Thank you list')]")
    WebElement ThankYou;

    @FindBy(xpath = "//input[contains(@type,'text')]")
    WebElement SearchBox;

    @FindBy(xpath = "//i[contains(@class,'fi fi-rr-settings-sliders')]")
    WebElement FilterIcon;

    @FindBy(xpath = "//i[contains(@class,'fi fi-rr-download')]")
    WebElement DownloadIcon;

    @FindBy(xpath = "//select[contains(@placeholder,'Filter organization')]")
    WebElement OrganizationDropdown;

    @FindBy(xpath = "//*[@id=\"modal-portal\"]/div/div[2]/div/div[2]/div/div[1]/select/option[11]")
    WebElement OrganizationOption;

    @FindBy(xpath = "//div[@class='custom-multiselect-header '][contains(.,'Teams: 0 selected')]")
    WebElement TeamsDropdown;

    @FindBy(xpath = "//input[contains(@type,'checkbox')]")
    WebElement CheckBox;

    @FindBy(xpath = "//button[@type='button'][contains(.,'Apply')]")
    WebElement ApplyBtn;

    public ThankYouPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateThankYouPageTitle(){
        return driver.getTitle();
    }

    public ThankYouPage clickOnThankYouLink(){
        ThankYou.click();
        return new ThankYouPage();
    }

    public boolean verifySearchBox(){
        return SearchBox.isDisplayed();
    }

    public boolean verifyFilterIcon(){
        return FilterIcon.isDisplayed();
    }

    public boolean verifyDownloadIcon(){
        return DownloadIcon.isDisplayed();
    }

    public void verifySearchingUsers(){
        SearchBox.click();
        SearchBox.sendKeys("Kavinthan");
    }

    public void verifyFilteringThankYouPage(){
        FilterIcon.click();
        OrganizationDropdown.click();
        OrganizationOption.click();
        TeamsDropdown.click();
        CheckBox.click();
        TeamsDropdown.click();
        ApplyBtn.click();
    }

    public void verifyDownloadingData(){
        DownloadIcon.click();
    }
}
