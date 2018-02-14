package MouseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class Draggable {
@FindBy (css = "#draggableview")
private WebElement item;
@FindBy (css = "#droppableview")
private WebElement goal;

public void dragTest(Actions builder){
    builder.dragAndDrop(item, goal).perform();
}

}
