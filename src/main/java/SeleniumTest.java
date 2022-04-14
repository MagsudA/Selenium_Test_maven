import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    public static void main(String[] args) {

/*
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.close();
        driver.quit();
*/

      //  WebDriverManager.firefoxdriver().setup();


        System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\IdeaProjects\\Selenium_Test_maven\\geckodriver.zip");
        System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");

        WebDriver driver2 = new FirefoxDriver();
        driver2.manage().window().maximize();
        driver2.manage().deleteAllCookies();
        driver2.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver2.get("https://seleniumhq.org/");
        driver2.quit();
    }
}
