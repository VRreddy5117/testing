package seleniumknowledge;

import SeleniumStandards.Instance;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

// it covers screenshot program and explicit wait, exception handling

public class getstart extends Instance{

    public static WebDriver driver;

    @Test
    public void havestart(){
        System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        String eTitle = "Demo Guru99 Page";
        String aTitle = "";
        // launch Chrome and redirect it to the Base URL

        driver.get("http://demo.guru99.com/test/guru99home/");
        //Maximizes the browser window
        driver.manage().window().maximize();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        /* get the actual value of the title */
        aTitle = driver.getTitle();
        //compare the actual title with the expected title
        if (aTitle.contentEquals(eTitle)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        WebElement guru99seleniumlink;
        guru99seleniumlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//li//a[contains(text(),'SEO')]")));
        guru99seleniumlink.click();
        try {
            // now copy the  screenshot to desired location using copyFile //method
            FileUtils.copyFile(src, new File("D:/getscreenshot.png"));
        } catch (
                IOException e) {
            System.out.println(e.getMessage());

        }
    }
}



