

    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;


    public class multiplewindowHandle {
        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            String url = "https://www.naukri.com/";
            driver.get(url);
            driver.manage().window().maximize();
            //counting windowhandle
            String Parent_window = driver.getWindowHandle();
            System.out.println(Parent_window);
            //keep windows in set
            Set<String> set = driver.getWindowHandles();
            System.out.println(set.toString());

            // creating iterator object with collection object reference (set.iterator)
            Iterator<String> itr = set.iterator();

            //using itr we
            while ((itr.hasNext()))
            {
                String child_window = itr.next();
                if(!Parent_window.equals(child_window))
                {
                    driver.switchTo().window(child_window);
                    System.out.println(driver.switchTo().window(child_window).getTitle());
                    driver.close();

                    driver.navigate().forward();
                    driver.navigate().back();
                    driver.navigate().refresh();


                }
            }

            driver.switchTo().window(Parent_window);
        }
    }

