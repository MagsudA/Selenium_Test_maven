import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.sql.Driver;
import java.sql.SQLOutput;

public class Click_RadioButtons {

    public static void main(String[] args) {
        Tools.setBrowser("firefox");
        Tools.setBrowserConfig();
        click_RadioButton();
    }


    public static void click_RadioButton() {

        Tools.driver.get("https://demoqa.com/radio-button");
        Tools.driver.manage().window().maximize();

        WebElement yesRadioButtonLabel = Tools.driver.findElement(new By.ByCssSelector("label[for='yesRadio']"));
        boolean isEnabled = yesRadioButtonLabel.isEnabled();

        if(isEnabled)
        {
            yesRadioButtonLabel.click();
            System.out.println("Clicked yesRadioButton");

        }


        WebElement yesRadioButton = Tools.driver.findElement(By.id("yesRadio"));

        boolean isSelected = yesRadioButton.isSelected();

        if(isSelected)
        {
            System.out.println("Yes Radio Button is selected");

        }

        WebElement output = Tools.driver.findElement(new By.ByCssSelector("p.mt-3"));
        System.out.println(output.getText());


        WebElement noRadioButton = Tools.driver.findElement(By.id("noRadio"));
        System.out.println(noRadioButton.isEnabled());

    }
}
