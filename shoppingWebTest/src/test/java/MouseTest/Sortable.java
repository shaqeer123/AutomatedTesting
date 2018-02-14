package MouseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Sortable {
@FindBy (css = "#menu-item-151")
private WebElement sortableLink;

@FindBy (css = "#sortable > li:nth-child(1)")
private WebElement item1;
@FindBy (css = "#sortable > li:nth-child(2)")
private WebElement item2;
@FindBy (css = "#sortable > li:nth-child(3)")
private WebElement item3;
@FindBy (css = "#sortable > li:nth-child(4)")
private WebElement item4;
@FindBy (css = "#sortable > li:nth-child(5)")
private WebElement item5;
@FindBy (css = "#sortable > li:nth-child(6)")
private WebElement item6;
@FindBy (css = "#sortable > li:nth-child(7)")
private WebElement item7;

public void sortMethod(Actions builder, WebDriver driver){

    sortableLink.click();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    builder.dragAndDropBy(item1,0,100).perform();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    builder.dragAndDropBy(item2,0,105).perform();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    builder.dragAndDropBy(item3,0,10).perform();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    builder.dragAndDropBy(item4,0,30).perform();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    builder.dragAndDropBy(item5,0,200).perform();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    builder.dragAndDropBy(item6,0,0).perform();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    builder.dragAndDropBy(item7,0,50).perform();
    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

}

}
