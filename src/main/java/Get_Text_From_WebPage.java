import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.stringtemplate.v4.ST;

public class Get_Text_From_WebPage {




    public static void main(String[] args) {
       Tools.setBrowser("firefox");
        Tools.setBrowserConfig();
        Get_Text_FromWebpage();

    }



    public static void Get_Text_FromWebpage() {

        Tools.driver.get("https://cydeo.com/about/");
        Tools.driver.manage().window().maximize();
       // If u want to find Xpath in Chrome shortcut is Ctrl+f
       WebElement nameText =  Tools.driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div/div/div/div/div/div/div/div/div/section[3]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/div/p[2]"));
        String name = nameText.getText();
        System.out.println(name);
    }

    }


