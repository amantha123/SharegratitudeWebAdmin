package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DashboardPage extends TestBase {

    @FindBy(xpath = "//h6[@class='mb-0'][contains(.,'Patient & Staff Experience Measures')]")
    WebElement PatientStaffExperienceMeasures;

    @FindBy(xpath = "//p[@class='text-muted mb-0 cstm-tx14'][contains(.,'Revenue')]")
    WebElement Revenue;

    @FindBy(xpath = "//h4[@class='mb-0'][contains(.,'$0')]")
    WebElement Value;

    @FindBy(xpath = "//p[@class='text-muted mb-0 cstm-tx14'][contains(.,'Charities')]")
    WebElement Charities;

    @FindBy(xpath = "//h4[@class='mb-0'][contains(.,'6')]")
    WebElement Value1;

    @FindBy(xpath = "//p[@class='text-muted mb-0 cstm-tx14'][contains(.,'Hospitals/Clinics')]")
    WebElement Hospitals;

    @FindBy(xpath = "//h4[@class='mb-0'][contains(.,'10')]")
    WebElement Value2;

    @FindBy(xpath = "(//p[@class='text-muted mb-0 cstm-tx14'][contains(.,'Users')])[1]")
    WebElement Users;

    @FindBy(xpath = "(//h4[@class='mb-0'][contains(.,'12')])[1]")
    WebElement Value3;

    @FindBy(xpath = "//button[@type='button'][contains(.,'Stats')]")
    WebElement StatsBtn;

    @FindBy(xpath = "(//p[@class='text-muted mb-0 cstm-tx14'][contains(.,'Users')])[2]")
    WebElement Users1;

    @FindBy(xpath = "(//h4[@class='mb-0'][contains(.,'12')])[2]")
    WebElement Value4;

    public DashboardPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateDashboardPageTitle(){
        return driver.getTitle();
    }

    public boolean verifyPatientStaffExperienceMeasuresLabel(){
        return PatientStaffExperienceMeasures.isDisplayed();
    }

    public boolean verifyRevenueLabel(){
        return Revenue.isDisplayed();
    }

    public boolean verifyRevenueValue(){
        return Value.isDisplayed();
    }

    public boolean verifyCharitiesLabel(){
        return Charities.isDisplayed();
    }

    public boolean verifyCharitiesValue(){
        return Value1.isDisplayed();
    }

    public boolean verifyHospitalsLabel(){
        return Hospitals.isDisplayed();
    }

    public boolean verifyHospitalsValue(){
        return Value2.isDisplayed();
    }

    public boolean verifyUsersLabel(){
        return Users.isDisplayed();
    }

    public boolean verifyUsersValue(){
        return Value3.isDisplayed();
    }

    public boolean verifyStatsBtn(){
        return StatsBtn.isDisplayed();
    }

    public boolean verifyUsersLabel1(){
        return Users1.isDisplayed();
    }

    public boolean verifyUsersValue1(){
        return Value4.isDisplayed();
    }
}
