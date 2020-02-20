package RelativeXpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D://Chrome driver//chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hackr.io/");
       // WebElement element = driver.findElement();

    }
}
