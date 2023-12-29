package com.pack.pages.AppQRCode;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppQRCodePage extends TestBase {

    @FindBy(xpath = "//a[@href='/app-qr-code']")
    WebElement AppQRCode;

    public AppQRCodePage(){
        PageFactory.initElements(driver, this);
    }

    public static String validateAppQRCodePageTitle(){
        return driver.getTitle();
    }

    public AppQRCodePage clickOnAppQRCodeLink(){
        AppQRCode.click();
        return new AppQRCodePage();
    }
}
