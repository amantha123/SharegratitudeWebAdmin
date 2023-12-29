package com.pack.pages.Login;

import com.pack.base.TestBase;
import com.pack.pages.Dashboard.DashboardPage;
import org.apache.commons.logging.Log;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//input[contains(@id,'username')]")
    WebElement Email;

    @FindBy(xpath = "//input[contains(@id,'password')]")
    WebElement Password;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Submit')]")
    WebElement Submit;

    @FindBy(xpath = "//img[@src='/static/media/admin_logo.c7f4785c118dca69b324bc7a0cd22a16.svg']")
    WebElement Logo;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateLoginPageTitle(){
        return driver.getTitle();
    }

    public boolean validateCRMImage(){
        return Logo.isDisplayed();
    }

    public DashboardPage login(String email, String password){
        Email.sendKeys(email);
        Password.sendKeys(password);
        Submit.click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", Submit);

        return new DashboardPage();
    }
}
