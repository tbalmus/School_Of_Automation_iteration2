package test_site_test;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class TestSiteTest {

    @BeforeEach
    void setUp() {
    }
    @Test
    public void site_header_is_on_home_page () {
       File file = new File("C:\\Intellij\\IEDriverServer_x64_2.39.0\\IEDriverServer.exe");
        System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
        WebDriver browser = new InternetExplorerDriver();

        //Firefox's geckodriver *requires* you to specify its location.
      //  System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
       // browser = new FirefoxDriver();
       // browser.get("http://shop.demoqa.com");
        browser.get("http://shop.demoqa.com/");


        WebDriverWait wait = new WebDriverWait(browser,100050 );
      ///  WebElement element = browser.getElement();
        //wait.until(ExpectedConditions.elementToBeClickable(element));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id<locator>));
        WebElement elementxpath = browser.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]"));
        WebDriverWait wait1 = new WebDriverWait(browser,100050 );

        //WebElement elementxpath1 = browser.findElement(By.linkText("\"ToolsQA Demo Site » Comments Feed\""));
        WebElement elementxpath2 =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button wc-backward']")));

     //   WebElement elementxpath2 = browser.findElement(By.xpath("//a[@class='button wc-backward']"));
      //  wait.until(ExpectedConditions.elementToBeClickable(elementxpath2));
        //WebDriverWait wait = new WebDriverWait(browser,100050 );
        elementxpath2.click();
        System.out.println(elementxpath);
        System.out.println(browser.getTitle());
       // List<WebElement> elementName = browser.findElements(By.LocatorStrategy("LocatorValue"));
       // WebElement elementName = browser.findElement(By.LocatorStrategy("LocatorValue"));
        //WebElement header = browser.findElement(By.id("//title[contains(text(),'ToolsQA Demo Site')]"));
       // assertEquals(browser.getTitle(),elementxpath);
        //elementID = browser.findElement(By.id("twotabsearchtextbox"))
        browser.close();
        browser.quit();

    }
    @AfterEach
    void tearDown() {

    }
}