package AdvancedWebsiteTest.pageObjects;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class BlousesPage {
    @FindBy(css = "#block_top_menu > ul > li:nth-child(1) > a")
    private WebElement womenTab;
    @FindBy (css = "#header_logo > a > img")
    private WebElement logoImg;
    @FindBy(css = "#subcategories > ul > li:nth-child(1) > div.subcategory-image > a > img")
    private WebElement topsSubCat;
    @FindBy (css = "#subcategories > ul > li:nth-child(2) > div.subcategory-image > a > img")
    private WebElement blousesSubCat;

    public void navToBlouses(){
        womenTab.click();
        topsSubCat.click();
        blousesSubCat.click();

    }
}
