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
}
