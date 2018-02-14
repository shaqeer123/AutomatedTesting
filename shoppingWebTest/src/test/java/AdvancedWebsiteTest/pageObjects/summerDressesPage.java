package AdvancedWebsiteTest.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class summerDressesPage {
    @FindBy(css = "#block_top_menu > ul > li:nth-child(1) > a")
    private WebElement womenTab;
    @FindBy (css = "#header_logo > a > img")
    private WebElement logoImg;
    @FindBy (css = "#subcategories > ul > li:nth-child(2) > div.subcategory-image > a > img")
    private WebElement dressesSubCat;
    @FindBy (css = "#subcategories > ul > li:nth-child(3) > div.subcategory-image > a > img")
    private WebElement ssummerDresses;
    public void navToSummerDresses(){
        womenTab.click();
        dressesSubCat.click();
        ssummerDresses.click();

    }
}
