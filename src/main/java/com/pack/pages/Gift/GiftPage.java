package com.pack.pages.Gift;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftPage extends TestBase {

    @FindBy(xpath = "//a[@href='/gift-list'][contains(.,'Gift list')]")
    WebElement Gift;

    @FindBy(xpath = "//input[contains(@type,'text')]")
    WebElement SearchBox;

    @FindBy(xpath = "//i[contains(@class,'fi fi-rr-settings-sliders')]")
    WebElement FilterIcon;

    @FindBy(xpath = "//i[contains(@class,'fi fi-rr-download')]")
    WebElement DownloadIcon;

    public GiftPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateGiftPageTitle(){
        return driver.getTitle();
    }

    public GiftPage clickOnGiftLink(){
        Gift.click();
        return new GiftPage();
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
