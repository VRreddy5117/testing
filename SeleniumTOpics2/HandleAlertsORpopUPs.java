package SeleniumTOpics2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.NoAlertPresentException;

import java.util.Iterator;
import java.util.Set;

public class HandleAlertsORpopUPs {

    public static void main(String[] args) throws InterruptedException {

        //open browser
        System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/popup.php");
        driver.get("http://demo.guru99.com/test/delete_customer.php");


        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.name("submit")).submit();

        // Switching to Alert
        Alert alert = driver.switchTo().alert();

        // Capturing alert message.
        String alertMessage= driver.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessage);
       Thread.sleep(10);

        // Accepting alert
        alert.accept();
    }

}

