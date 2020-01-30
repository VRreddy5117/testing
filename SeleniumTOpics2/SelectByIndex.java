package SeleniumTOpics2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SelectByIndex {

    public static void main(String[] args) {

        //open browser
        System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver.findElement(By.id("text1")).sendKeys("My First Name");

        //Selecting value from drop down by value
        Select listbox = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
        listbox.selectByValue("Italy");
        listbox.selectByValue("Mexico");
        listbox.selectByValue("Spain");

        driver.findElement(By.xpath("//input[@value='->']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("text2")));

//Selecting value from drop down by index
        listbox.selectByIndex(0);
        listbox.selectByIndex(3);
        driver.findElement(By.xpath("//input[@value='->']")).click();
        System.out.println("Selecting 3 contries from the index ");
     //   Thread.sleep(2000);
        driver.close();
    }
}
