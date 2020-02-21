package seleniumknowledge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
    public static void main(String[] args) throws InterruptedException {
            WebDriver driver;
            System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
            driver= new ChromeDriver();
            driver.get("http://demo.guru99.com/test/simple_context_menu.html");
            driver.manage().window().maximize();
            Actions action = new Actions(driver);
            WebElement link = driver.findElement(By.cssSelector(".context-menu-one"));
            action.contextClick(link).perform();
            WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
            element.click();
            driver.quit();
        }
    }

