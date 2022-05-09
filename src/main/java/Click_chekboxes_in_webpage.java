import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;

public class Click_chekboxes_in_webpage {

    public static void main(String[] args) {
     Tools.setBrowser("firefox");
     Tools.setBrowserConfig();
     click_Chekbox();
    }



    public static void click_Chekbox(){

        Tools.driver.get("https://demoqa.com/checkbox");  //https://demoqa.com

        Tools.driver.manage().window().maximize();

        String CheckBox_CSS_value = "label[for='tree-node-home'] span.rct-checkbox svg";

        WebElement homeChekbox = Tools.driver.findElement(new By.ByCssSelector(CheckBox_CSS_value));


        // We use select boolean to be sure CheckBox status Cheked or Unchekcked. if false unchecked
        boolean select = homeChekbox.isSelected();
        System.out.println("Check status is : " + select);

        // We use boolean to check and to be sure is it possible to click checkBox or not.
        boolean enabled = homeChekbox.isEnabled();
        System.out.println("enable to click status is : " + enabled);




        if (enabled)
        {
            homeChekbox.click();
        }
        else
        {
            System.out.println("Impossible to click Checkbox");
        }




        // After homeChekbox.click(); code status changes in HTML because we must to declare homeChekbox again.
        homeChekbox = Tools.driver.findElement(new By.ByCssSelector(CheckBox_CSS_value));

        String ChekBox_Status = homeChekbox.getAttribute("class");




        if (ChekBox_Status.equals("rct-icon rct-icon-check")){
            System.out.println("Checkbox is checked");
            System.out.println("Check status is : " + select);
            System.out.println("enable to click status is : " + enabled);
        }
        else
        {
            System.out.println("Checkbox is unchecked");
        }

    }
}
