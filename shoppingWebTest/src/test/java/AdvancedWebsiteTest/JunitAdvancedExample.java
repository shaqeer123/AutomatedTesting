package AdvancedWebsiteTest;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import AdvancedWebsiteTest.pageObjects.*;

public class JunitAdvancedExample {
    //initialising webdriver to use with selenium
    private WebDriver webDriver;
    //make static string that hold a link to the url you want to test
    private static final String BASE_URL = " http://automationpractice.com/index.php";

    //Adding 5 test classes using junit
    @BeforeClass
    public static void init(){

    }

    @Before
    public void setUp(){
        //add chromeDriver.exe to the root folder of this project for this to work
        webDriver = new ChromeDriver();
        webDriver.navigate().to(BASE_URL);
    }

    @Test
    public void navigationBarTest(){
        //make a reference variable of the pageobjct
        GooglePage po = PageFactory.initElements(webDriver, GooglePage.class);
        WomenCategoryPage womensPageObject = PageFactory.initElements(webDriver, WomenCategoryPage.class);
        TopsCategoryPage topsPageObject = PageFactory.initElements(webDriver, TopsCategoryPage.class);
        TshirtsPage tshirtsPageObject = PageFactory.initElements(webDriver, TshirtsPage.class);
        BlousesPage blousePageObject = PageFactory.initElements(webDriver, BlousesPage.class);
        DressesPage dressesPageObject = PageFactory.initElements(webDriver, DressesPage.class);
        casualDressesPage casualDressesPageObject = PageFactory.initElements(webDriver, casualDressesPage.class);
        eveningDressesPage eveningDressesPageObject = PageFactory.initElements(webDriver, eveningDressesPage.class);
        summerDressesPage summerDressesPageObject = PageFactory.initElements(webDriver, summerDressesPage.class);

        womensPageObject.navToWomensCategory();
        po.homePage();
        topsPageObject.navToTopsCategory();
        po.homePage();
        tshirtsPageObject.navToTshirtsCategory();
        po.homePage();
        blousePageObject.navToBlouses();
        po.homePage();
        dressesPageObject.navToDressesCategory();
        po.homePage();
        casualDressesPageObject.navToCasualDresses();
        po.homePage();
        eveningDressesPageObject.navToEveningDresses();
        po.homePage();
        summerDressesPageObject.navToSummerDresses();
        po.homePage();


        po.searchTest();
    }

    @After
    public void cleanUp(){

    }

    @AfterClass
    public static void tearDown(){

    }

}
