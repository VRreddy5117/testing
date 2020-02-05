package RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));

        dropdown.selectByVisibleText("Automation Testing");
        System.out.println("Selected correct option");

        driver.close();
    }
}
