package com.pack.pages.NewsandStories;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsStoriesPage extends TestBase {

    @FindBy(xpath = "//a[@href='/news-stories'][contains(.,'News and Stories')]")
    WebElement NewsStories;

    public NewsStoriesPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateNewsStoriesPageTitle(){
        return driver.getTitle();
    }

    public NewsStoriesPage clickOnNewsStoriesLink(){
        NewsStories.click();
        return new NewsStoriesPage();
    }
}
