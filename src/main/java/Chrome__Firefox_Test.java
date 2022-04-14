import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome__Firefox_Test {

    static String browser;
    static WebDriver driver;

    public static void main(String[] args) {

        setBrowser("firefox");
        setBrowserConfig();
        runTest();

    }


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

    public static void runTest(){


        driver.get("https://demoqa.com/text-box");  //https://demoqa.com

        System.out.println("Tittle of page : "+driver.getTitle());

      //  driver.quit();
    }


}
