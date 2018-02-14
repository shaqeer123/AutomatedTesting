package AdvancedWebsiteTest.pageObjects;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class TopsCategoryPage {
    //nav to tops
    @FindBy(css = "#block_top_menu > ul > li:nth-child(1) > a")
    private WebElement womenTab;
    @FindBy (css = "#header_logo > a > img")
    private WebElement logoImg;
    @FindBy(css = "#subcategories > ul > li:nth-child(1) > div.subcategory-image > a > img")
    private WebElement topsSubCat;

    public void navToTopsCategory(){
        womenTab.click();
        topsSubCat.click();

    }
}
