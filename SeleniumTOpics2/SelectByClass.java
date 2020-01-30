package SeleniumTOpics2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SelectByClass {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.className("inputtext")).sendKeys("Software Testing Material");
    }
}
