package SeleniumTOpics2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TextBoxes {

    public static void main(String[] args) {

        //open browser
        System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("mobile", Keys.ENTER);

        System.out.println("Test passed as mobile");
        driver.quit();

    }
}
