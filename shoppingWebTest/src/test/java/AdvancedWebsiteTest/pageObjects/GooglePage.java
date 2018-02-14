package AdvancedWebsiteTest.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//using Page Object Model

public class GooglePage {
    @FindBy (css = "#header_logo > a > img")
    private WebElement logoImg;

    public void homePage(){
        logoImg.click();
    }

    @FindBy (css = "#search_query_top")
    private WebElement searchBar;
    @FindBy(css = "#searchbox > button")
    private WebElement searchBtn;

    public void searchTest(){
        searchBar.sendKeys("tops");
        searchBtn.click();
    }
}
