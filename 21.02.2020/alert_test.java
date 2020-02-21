package seleniumknowledge;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class alert_test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.testandquiz.com/selenium/testing.html");
        System.out.println("drop here");

        driver.findElement(By.xpath("/html/body/div/div[11]/div/p/button")).click();
        System.out.println("clicked the xpath");
        Alert alert = (Alert) driver.switchTo().alert();
        alert.accept();
        System.out.println("start");
        driver.findElement(By.xpath("/html/body/div/div[12]/div/p[1]/button")).click();
        Alert confirmBox = (Alert) driver.switchTo().alert();
        ((Alert) confirmBox).dismiss();
        System.out.println("completed drop n down");
        driver.close();
    }

}
