package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsPractice {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","chromedriver");

        WebDriver driver =new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com");

        List<WebElement> allLinks = driver.findElements(By.tagName("li"));//or By.XPath("//li")


        for (WebElement element : allLinks){
            System.out.println(element.getText());
        }





    }
}
