package seleniumknowledge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Dragdrp_Test {

    public static void main(String[] args) {

        // System Property for Gecko Driver
        System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe" );
       WebDriver driver = new ChromeDriver();
        driver.get("https://www.testandquiz.com/selenium/testing.html");
        WebElement from = driver.findElement(By.id("sourceImage"));
        WebElement to = driver.findElement(By.id("targetDiv"));
        Actions act = new Actions(driver);
        act.dragAndDrop(from,to).build().perform();
        driver.close();
    }

}
