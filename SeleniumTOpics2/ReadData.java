package SeleniumTOpics2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
        String baseUrl = "http://demo.guru99.com/test/write-xpath-table.html";
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
        System.out.println(innerText);
        System.out.println("Here found 4th cell data");

        driver.get(baseUrl);
        String innerText1 = driver.findElement(By.xpath("/html/body/center[1]/table/tbody/tr[2]/td[1]")).getText();
        System.out.println(innerText1);
        System.out.println("Here found 3st cell data");
        driver.quit();
    }
}

