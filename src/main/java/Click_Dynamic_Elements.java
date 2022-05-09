import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;

public class Click_Dynamic_Elements {


    public static void main(String[] args) {
        Tools.setBrowser("firefox");
        Tools.setBrowserConfig();
        Tools.driver.get("https://demoqa.com/dynamic-properties");
        Tools.driver.manage().window().maximize();


        get_Dynamic_text();
        click_Dynamic_Button_1();
        click_Dynamic_Button_2();
        click_Dynamic_Button_3();
    }


    public static void get_Dynamic_text() {

        WebElement textElement = Tools.driver.findElement(By.xpath("//div/p"));
        String text = textElement.getText();
        System.out.println(text);
    }

    // Button name : will enable 5 sec
    public static void click_Dynamic_Button_1() {
        WebElement button = Tools.driver.findElement(By.id("enableAfter"));
        WebDriverWait wait = new WebDriverWait(Tools.driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(button));
        button.click();
    }

    // Button name : Button name : color change
    public  static void  click_Dynamic_Button_2(){

        WebElement colorChangeButton = Tools.driver.findElement(By.id("colorChange"));
        String className = colorChangeButton.getAttribute("class");
        System.out.println("Before change : " + className);

        WebDriverWait wait = new WebDriverWait(Tools.driver, 5);
        wait.until(ExpectedConditions.attributeToBe(colorChangeButton, "class" , "mt-4 text-danger btn btn-primary"));
        className =  colorChangeButton.getAttribute("class");
        System.out.println("After change : " + className);
    }



    // Button name : Visible after 5 sec
    public  static void  click_Dynamic_Button_3() {
        WebDriverWait wait = new WebDriverWait(Tools.driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
        Tools.driver.findElement(By.id("visibleAfter")).click();


    }

    }



