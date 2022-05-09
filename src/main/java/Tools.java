import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tools {


    static String browser;
    static WebDriver driver;


    public static void setBrowser(String s){
        browser = s;
    }

    public static void setBrowserConfig(){

        if(browser.equalsIgnoreCase("Chrome")){

            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();

            driver=new ChromeDriver(options);
        }

        else if (browser.equalsIgnoreCase("Firefox")){

            WebDriverManager.firefoxdriver().setup();

            driver=new FirefoxDriver();

        }

        else {
            System.out.println("web driver type is wrong");
        }
    }

}
