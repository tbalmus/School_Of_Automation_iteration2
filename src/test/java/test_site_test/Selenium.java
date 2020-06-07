package test_site_test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class Selenium {

    public static void main(String[] args) {
        File file = new File("C:\\Intellij\\IEDriverServer_x64_2.39.0\\IEDriverServer.exe");
        System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
        WebDriver driver = new InternetExplorerDriver();

        long a =50;
       // WebDriver driver = new InternetExplorerDriver();
       // WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver,5 );
     //   WebDriverWait wait = new WebDriverWait(driver,5 );

        try {
            driver.get("http://shop.demoqa.com/");
            driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
            WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("h3>div")));
            System.out.println(firstResult.getAttribute("textContent"));
        } finally {
            driver.quit();
        }
    }
}