package AdvancedWebsiteTest.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class casualDressesPage {
    @FindBy(css = "#block_top_menu > ul > li:nth-child(1) > a")
    private WebElement womenTab;
    @FindBy (css = "#header_logo > a > img")
    private WebElement logoImg;
    @FindBy (css = "#subcategories > ul > li:nth-child(2) > div.subcategory-image > a > img")
    private WebElement dressesSubCat;
    @FindBy (css = "#subcategories > ul > li:nth-child(1) > div.subcategory-image > a > img")
    private WebElement casualDresses;

    public void navToCasualDresses(){
        womenTab.click();
        dressesSubCat.click();
        casualDresses.click();

    }
}
