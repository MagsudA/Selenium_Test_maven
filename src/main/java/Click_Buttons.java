import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Click_Buttons {
    public static void main(String[] args) {
        Tools.setBrowser("firefox");
        Tools.setBrowserConfig();
        Tools.driver.get("https://demoqa.com/buttons");
        Tools.driver.manage().window().maximize();

        Double_click_Button();
        right_click_Button();
        click_Button();
    }

    public static void Double_click_Button() {


        WebElement DoubleClickBtn = Tools.driver.findElement(By.id("doubleClickBtn"));

        Actions action = new Actions(Tools.driver);
        action.doubleClick(DoubleClickBtn).perform();


        WebElement message = Tools.driver.findElement(By.id("doubleClickMessage"));
        String messagetext = message.getText();
        System.out.println(messagetext);
    }



    public static void right_click_Button() {


        WebElement Right_ClickBtn = Tools.driver.findElement(By.id("rightClickBtn"));

        Actions action = new Actions(Tools.driver);
        action.contextClick(Right_ClickBtn).perform();


        WebElement message = Tools.driver.findElement(By.id("rightClickMessage"));
        String messagetext = message.getText();
        System.out.println(messagetext);
    }



    public static void click_Button() {  //Dynamic Button


        WebElement ClickBtn = Tools.driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));

        Actions action = new Actions(Tools.driver);
        action.click(ClickBtn).perform();


        WebElement message = Tools.driver.findElement(By.id("dynamicClickMessage"));
        String messagetext = message.getText();
        System.out.println(messagetext);
    }
}