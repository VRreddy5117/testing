package SeleniumStandards;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instance  {
    public static WebDriver driver ;


    public static void callingChrome(){
        System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }


    public static void ScrollDown() throws Exception {


        callingChrome();
        System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Launch the application
        driver.get("http://demo.guru99.com/test/guru99home/");

       //Find element by link text and store in variable "Element"
        WebElement Element = driver.findElement(By.linkText("Linux"));

        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }
}
