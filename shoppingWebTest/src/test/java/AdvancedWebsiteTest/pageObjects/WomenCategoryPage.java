package AdvancedWebsiteTest.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenCategoryPage {
    //nave to womensCategorys
    @FindBy(css = "#block_top_menu > ul > li:nth-child(1) > a")
    private WebElement womenTab;
    @FindBy (css = "#header_logo > a > img")
    private WebElement logoImg;



    public void navToWomensCategory(){
        womenTab.click();
    }
}
