package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class YahooInterviewQuestion {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","chromedriver");

        WebDriver driver =new ChromeDriver();

        driver.get("https://www.yahoo.com/");

        WebElement news =driver.findElement(By.xpath("//a[@id='root_2']"));
        news.click();

        List<WebElement> headers = driver.findElements(By.xpath("//h3"));
        int counter =0;

        for (WebElement element : headers){
            if(element.getText().toUpperCase().contains("US")){
                System.out.println(element.getText().trim());
                counter++;
            }
        }
        System.out.println(counter);



    }
}
