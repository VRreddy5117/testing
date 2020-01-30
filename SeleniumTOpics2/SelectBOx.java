package SeleniumTOpics2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SelectBOx {
    public static void main(String[] args) {

        //open browser
        System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ramana.5117@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("venkat");
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuOption).perform();
        System.out.println("Done Mouse hover on 'Womens' from Menu");
        driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")).click();
        // clicks.click(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a"));
        //log.info("navigated to t-shirts page");

        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")).click();
        //log.info("navigated to product page");
        System.out.println("Done Mouse hover on 'Womens' from Menu");

        driver.findElement(By.xpath("//*[@id='quantity_wanted_p']/a[2]/span/i")).click();
        // log.info("increased quantity by 2");
        System.out.println("increased quantity by 2");

        Select listbox = new Select(driver.findElement(By.xpath("//*[@id=\"group_1\"]")));
        listbox.selectByIndex(2);

        driver.findElement(By.xpath("//*[@id='quantity_wanted_p']/a[2]/span/i")).click();
        // log.info("selected large size");
        System.out.println("selected large size");

        driver.findElement(By.xpath("//*[@id=\"color_14\"]")).click();
        //log.info("selected blue color");
     //   System.out.println("selected blue color");

        System.out.println("Checked for the blue");
        driver.quit();
    }
}
