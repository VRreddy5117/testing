package SeleniumStandards;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Checkifelement {


    public static boolean isClickable(WebElement el, WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 6);
            wait.until(ExpectedConditions.elementToBeClickable(el));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    // static WebDriver driver;
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://sunilpatro1985.blogspot.com/p/demo_7.html");

        //if element is disabled, then isEnabled() returns false
        WebElement btn_Submit = driver.findElement(By.id("next"));
        boolean b1 = Checkifelement.isClickable(btn_Submit,driver);
        System.out.println(b1);

        //displayed

       boolean b2 =  driver.findElement(By.id("//*[@id=\"menu-bar\"]/ul/li[4]/a")).isDisplayed();
        System.out.println(b2);

        /*driver.findElement(By.linkText("DevOps Zone"));
        System.out.println("Clickable? " + btn_Submit.isEnabled());

        driver.findElement(By.id("transcheck1")).click();
        //After 4-5sec, submit button will be enabled

        if (isClickable(btn_Submit, driver))
        {
            System.out.println("Clickable? " + btn_Submit.isEnabled());
            btn_Submit.click();
        }
    }

    public static boolean isClickable(WebElement el, WebDriver driver)
    {
        try{
            WebDriverWait wait = new WebDriverWait(driver, 6);
            wait.until(ExpectedConditions.elementToBeClickable(el));
            return true;
        }
        catch (Exception e){
            return false;
        }
    }*/


    }
}
