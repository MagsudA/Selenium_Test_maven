import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Test {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver=new FirefoxDriver();

        driver.get("https://demoqa.com/text-box");  //https://demoqa.com

       // driver.get("https://facebook.com");

        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.id("userName"));   //with ID
        fullName.click();
        fullName.sendKeys("Magsud");
    }



}
