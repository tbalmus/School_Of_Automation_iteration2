package test_site_test;

import com.demoqa.shop.CreateNewUser;
import com.demoqa.shop.FirstPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class TestShopSite {
   /*     @Before   //Create an instance of Delta's instance class and provide the driver
        public void setUp(){
            File file = new File("C:\\Intellij\\IEDriverServer_x64_2.39.0\\IEDriverServer.exe");
            System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
            WebDriver driver = new InternetExplorerDriver();
                      // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://shop.demoqa.com/");
            driver.manage().window().maximize();
        }*/

        @Test
        public void oneWayReservation() {

           /* File file = new File("C:\\Intellij\\IEDriverServer_x64_2.39.0\\IEDriverServer.exe");
            System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
            WebDriver driver = new InternetExplorerDriver();*/
            File file = new File("src\\test\\resources\\WebDrivers\\chromedriver.exe");
            //File file = new File("C:\\Intellij\\chromedriver_win32 (3)\\chromedriver.exe");

            System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
            WebDriver driver = new ChromeDriver();
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://shop.demoqa.com/");
            driver.manage().window().maximize();
           // Thread.sleep(300);
            //Adding page objects
            FirstPage firstPage = new FirstPage(driver);
            firstPage.waiter();

          // WebElement button = firstPage.find_element_by_xpat("//a[contains(text(),'My Wishlist')]");
           // driver.findElement(By.linkText("here"));
            WebElement username = driver.findElement(By.className("woocommerce-store-notice__dismiss-link"));
            username.click();
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/ul[2]/li[1]/a[1]"));
            driver.findElement(By.xpath("//a[@class='custom_link']")).click();
            //a[@class='custom_link']
           //button.click();
            //WebElement elementxpath2 = browser.findElement(By.xpath("//a[@class='button wc-backward']"));
            WebElement elementxpath2 = firstPage.find_element_by_xpat("//a[@class='custom_link']");
            elementxpath2.click();

            WebElement elementxpath3 = firstPage.find_element_by_xpat("//a[@class='noo-search']");
            elementxpath3.click();

            WebElement elementxpath4 = firstPage.find_element_by_xpat("//input[@name='s']");

            elementxpath4.sendKeys("MO");
            elementxpath4.sendKeys(Keys.ENTER);
            String title = driver.getTitle();
            System.out.println(title);
            WebElement elementxpath5 = firstPage.find_element_by_xpat("//a[contains(text(),'My Wishlist')]");
            elementxpath5.click();
            WebElement elementxpath6 = firstPage.find_element_by_xpat("//a[contains(text(),'My Account')]");

            elementxpath6.click();
            CreateNewUser user1 = new CreateNewUser(firstPage,"andrei77","an@mail.ru","1234@5qwe12");

      }


}


