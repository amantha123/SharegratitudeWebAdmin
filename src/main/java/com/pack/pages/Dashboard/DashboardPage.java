package com.pack.pages.Dashboard;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = "(//h4[@class='mb-0'][contains(.,'13')])[2]")
    WebElement Value3;

    @FindBy(xpath = "//button[@type='button'][contains(.,'Stats')]")
    WebElement StatsBtn;

    @FindBy(xpath = "(//p[@class='text-muted mb-0 cstm-tx14'][contains(.,'Users')])[2]")
    WebElement Users1;

    @FindBy(xpath = "(//h4[@class='mb-0'][contains(.,'13')])[2]")
    WebElement Value4;

    @FindBy(xpath = "//p[@class='text-muted mb-0 cstm-tx14'][contains(.,'Teams')]")
    WebElement Teams;

    @FindBy(xpath = "//h4[@class='mb-0'][contains(.,'57')]")
    WebElement Value5;

    @FindBy(xpath = "//p[@class='text-muted mb-0 cstm-tx14'][contains(.,'Appreciations')]")
    WebElement Appreciations;

    @FindBy(xpath = "//h4[@class='mb-0'][contains(.,'193')]")
    WebElement Value6;

    @FindBy(xpath = "(//p[@class='text-muted mb-0 cstm-tx14'][contains(.,'Thank You')])[1]")
    WebElement ThankYou;

    @FindBy(xpath = "//h4[@class='mb-0 mt-1'][contains(.,'177')]")
    WebElement Value7;

    @FindBy(xpath = "//p[@class='text-muted mb-0 cstm-tx14'][contains(.,'Thank You Replies')]")
    WebElement ThankYouReplies;

    @FindBy(xpath = "(//div[contains(.,'0.6%')])[11]")
    WebElement Value8;

    @FindBy(xpath = "(//div[contains(.,'Auto: 9')])[11]")
    WebElement Value9;

    @FindBy(xpath = "(//div[contains(.,'Total: 10')])[12]")
    WebElement Value10;

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

    public boolean verifyTeamsLabel(){
        return Teams.isDisplayed();
    }

    public boolean verifyTeamsValue(){
        return Value5.isDisplayed();
    }

    public boolean verifyAppreciationsLabel(){
        return Appreciations.isDisplayed();
    }

    public boolean verifyAppreciationsValue(){
        return Value6.isDisplayed();
    }

    public boolean verifyThankYouLabel(){
        return ThankYou.isDisplayed();
    }

    public boolean verifyThankYouValue(){
        return Value7.isDisplayed();
    }

    public boolean verifyThankYouReplies(){
        return ThankYouReplies.isDisplayed();
    }

    public boolean verifyThankYouRepliesValue(){
        return Value8.isDisplayed();
    }

    public boolean verifyThankYouRepliesValue1(){
        return Value9.isDisplayed();
    }

    public boolean verifyThankYouRepliesValue2(){
        return  Value10.isDisplayed();
    }
}
