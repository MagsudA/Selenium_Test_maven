import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fill_inside_TextboxesAndClick_Chrome {



    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        WebDriver driver=new ChromeDriver(options);

        driver.get("https://demoqa.com/text-box");  //https://demoqa.com

        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.id("userName"));   //with ID
        fullName.click();
        fullName.sendKeys("Magsud");

        WebElement email = driver.findElement( new By.ByCssSelector(".mr-sm-2[id='userEmail']")); //with CSS path
        email.click();
        email.sendKeys("maqsud@live.com");

        WebElement currentAdress = driver.findElement( By.id("currentAddress"));
        currentAdress.click();
        currentAdress.sendKeys("223 East 76 st Brooklyn,NY ");


        WebElement permanentAdress = driver.findElement( By.id("permanentAddress"));
        permanentAdress.click();
        permanentAdress.sendKeys("555 North 79 st Washington ");


        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
    }





}
