package MouseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class ToolTip {
@FindBy (css = "#menu-item-99")
private WebElement toolTipLink;
@FindBy (id = "age")
private WebElement hoverBar;

    public void toolTopMethod(Actions builder, WebDriver driver){
        toolTipLink.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        builder.moveToElement(hoverBar).perform();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }
}
