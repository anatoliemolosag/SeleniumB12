package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsPractice2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","chromedriver");

        WebDriver driver =new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com");

        List<WebElement> allLinks = driver.findElements(By.tagName("li"));
        int count =0;
        for (WebElement element : allLinks){

            if(element.getText().trim().length()<12){
                System.out.println(element.getText().trim());
                count++;

            }

        }
        System.out.println(count);
    }
}
