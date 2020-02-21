package seleniumknowledge;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium21_02_2020 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.google.com/";
        driver.get(url);
        String newWindow = driver.getWindowHandle();
        String Second  = "https://www.google.com/intl/en-GB/gmail/about/#";
        driver.findElement(By.linkText(Second));

        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
        driver.get("Second URL");


//Perform whatever actions you want done on the secondary tab, let’s pretend we’re logging in somewhere

        driver.findElement(By.id("ID")).sendKeys("username");
        driver.findElement(By.id("ID")).sendKeys("password");
        driver.findElement(By.id("submit")).click();

        driver.switchTo().window(newWindow);

//Perform whatever actions you want done on the main tab, we’ll click a button
        driver.findElement(By.id("button")).click();

/*# Close current tab*/
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"w");

        driver.close();
        driver.findElement(By.linkText("Gmail")).click();



    }
}
