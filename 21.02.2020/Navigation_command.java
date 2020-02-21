package seleniumknowledge;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Navigation_command {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe" );

        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
        driver.findElement(By.linkText("This is a link")).click();
       // driver.findElement(By.linkText("This is a Link")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
        driver.navigate().refresh();
        System.out.println("All operations done");

        System.out.println("Started JS execution");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0, 5000)");
        System.out.println("Stopped JS execution");
        driver.close();
    }
}


   /* Initialize Gecko Driver using Desired Capabilities Class
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("marionette",true);*/