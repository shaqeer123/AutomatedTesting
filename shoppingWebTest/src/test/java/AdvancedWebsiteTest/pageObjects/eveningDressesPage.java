package AdvancedWebsiteTest.pageObjects;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class eveningDressesPage {
    @FindBy(css = "#block_top_menu > ul > li:nth-child(1) > a")
    private WebElement womenTab;
    @FindBy (css = "#header_logo > a > img")
    private WebElement logoImg;
    @FindBy (css = "#subcategories > ul > li:nth-child(2) > div.subcategory-image > a > img")
    private WebElement dressesSubCat;
    @FindBy (css = "#subcategories > ul > li:nth-child(2) > div.subcategory-image > a")
    private WebElement eveningDresses;

    public void navToEveningDresses(){
        womenTab.click();
        dressesSubCat.click();
        eveningDresses.click();

    }
}
