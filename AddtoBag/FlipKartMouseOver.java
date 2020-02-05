package RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class FlipKartMouseOver {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://flipkart.com");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8639300627");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("VENkat@123");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();

        WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[7]/span"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuOption).perform();
        System.out.println("Done Mouse hover on 'Books and media' from Menu");

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[7]/span")).click();
        System.out.println("done");
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[7]/ul/li/ul/li[3]/ul/li[2]/a")).click();
        System.out.println("Exam section selection done");




        String expRes = "Oxford English Mini Dictionary";

        //Finding the respective tab
      //  WebElement wbele = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[7]/span"));

        //creating an object for actions class
     //   Actions act = new Actions(driver);
     //   act.moveToElement(wbele).perform();

        //navigating to entrance exam section
      //  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[7]/ul/li/ul/li[3]/ul/li[2]/a")).click();

        Thread.sleep(4000);

        //finding a book with name "oxford eng mini dic"
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/div/div[1]/div/div/a")).click();
         System.out.println("book added");
        //adding the book to cart
        driver.navigate().to("https://www.flipkart.com/booster-test-series-ssc-je-paper-electrical-engineering-15-mock-tests-questions-answers-explanations/p/itmf79f7pjatszg2?pid=9789389573695&lid=LSTBOK9789389573695TROO81&marketplace=FLIPKART&fm=neo%2Fmerchandising&iid=M_28e68b17-88a7-4c04-984e-8286dbc896d2_3_7REANWGUTQ3B_MC.9789389573695&ppt=hp&ppn=hp&ssid=jqk3josg8w0000001580904763161&otracker=clp_pmu_v2_SSC%2BJE%2BEXAM%2BBOOKS_1_3.productCard.PMU_V2_SSC%2BJE%2BEXAM%2BBOOKS_the-exam-store_9789389573695_neo%2Fmerchandising_0&otracker1=clp_pmu_v2_PINNED_neo%2Fmerchandising_SSC%2BJE%2BEXAM%2BBOOKS_LIST_productCard_cc_1_NA_view-all&cid=9789389573695");
       // driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();

        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"pincodeInputId\"]")).sendKeys("500084");
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[4]/div/div/div[1]/div[2]/div/div[2]/div/span")).click();
        //navigating to cart to verify the book is added or not
        System.out.println("added to bag");

        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[5]/div/div/a/span")).click();
        if(driver.getTitle().contains("some expected text"))
            //Pass
            System.out.println("Page title contains \"some expected text\" ");
        else
            //Fail
            System.out.println("Page title doesn't contains \"some expected text\" ");

    }

}

