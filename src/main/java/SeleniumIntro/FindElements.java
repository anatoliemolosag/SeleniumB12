package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","chromedriver");

        WebDriver driver =new ChromeDriver();

        driver.get("file:///Users/anatoliemolosag/Downloads/Techtorialhtml.html");
        List<WebElement> allCheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for( WebElement checkBox :allCheckBox ){
            System.out.println(checkBox.isSelected());//only selenium will give me true
            if(checkBox.isSelected()==false){
                checkBox.click();
            }
            checkBox.click();
            System.out.println(checkBox.isSelected());//only selenium will give me false

        }

//driver.quit();

    }
}
