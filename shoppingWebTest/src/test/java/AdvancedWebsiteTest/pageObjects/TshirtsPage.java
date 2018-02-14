package AdvancedWebsiteTest.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TshirtsPage {
    @FindBy(css = "#block_top_menu > ul > li:nth-child(1) > a")
    private WebElement womenTab;
    @FindBy (css = "#header_logo > a > img")
    private WebElement logoImg;
    @FindBy(css = "#subcategories > ul > li:nth-child(1) > div.subcategory-image > a > img")
    private WebElement topsSubCat;
    @FindBy (css = "#subcategories > ul > li:nth-child(1) > div.subcategory-image > a > img")
    private WebElement tShirtSubCat;

    public void navToTshirtsCategory(){
        womenTab.click();
        topsSubCat.click();
        tShirtSubCat.click();

    }
}
