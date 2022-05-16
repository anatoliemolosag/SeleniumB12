package MentoringWithAhmet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");

        WebElement header = driver.findElement(By.xpath("(//*[text()='Register Account'])[2]"));
        System.out.println(header.getText());

        if (header.equals("Register Account")){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }

    }
}
