package RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class today_shopping {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8639300627");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("VENkat@123");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();

        System.out.println("launched browser");

        WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/span"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuOption).perform();
        System.out.println("Done Mouse hover on 'Electronics' from Menu");

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/span")).click();
        System.out.println("done");
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a")).click();
         System.out.println("MI mobile selection done");

        Select dropdown = new Select(driver.findElement(By.className("fPjUPw")));
        dropdown.selectByIndex(4);
        System.out.println("selection of index done");

        //*[@id="container"]/div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a


        driver.close();
    }
}
