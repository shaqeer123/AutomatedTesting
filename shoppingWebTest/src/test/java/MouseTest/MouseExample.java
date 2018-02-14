package MouseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MouseExample {
    private WebDriver driver;
    private Actions builder;
    private static final String BASE_URL = " http://demoqa.com/droppable/";

    @BeforeClass
    public static void init(){

    }

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        builder = new Actions(driver);
        driver.navigate().to(BASE_URL);

    }

    @Test
    public void testingMouseActions(){
        Draggable x = PageFactory.initElements(driver, Draggable.class);
        x.dragTest(builder);
        Sortable y = PageFactory.initElements(driver, Sortable.class);
        y.sortMethod(builder,driver);
        ToolTip z = PageFactory.initElements(driver,ToolTip.class);
        z.toolTopMethod(builder, driver);
    }

    @After
    public void cleanUp(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
    }

    @AfterClass
    public static void tearDown(){

    }
}
