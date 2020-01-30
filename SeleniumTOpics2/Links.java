package SeleniumTOpics2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
    public static void main(String[] args) {

        String baseUrl = "http://automationpractice.com/index.php?id_category=3&controller=category";
        System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.findElement(By.partialLinkText("My addresses")).click();
        System.out.println("Title of page is: " + driver.getTitle());
           driver.quit();


       /* String baseUrl1 = "http://demo.guru99.com/test/accessing-link.html";
        System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();

        driver.get(baseUrl1);
        driver.findElement(By.partialLinkText("here")).click();
        System.out.println("Title of page is: " + driver.getTitle());*/
        // driver.quit();
    }
}
