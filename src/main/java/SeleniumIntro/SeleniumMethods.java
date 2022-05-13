package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        //navigate.to() --> it navigates the website but it doesn't wait all elements to be loaded
        driver.navigate().to("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.navigate().to("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().back();//it will go to previouse website
        Thread.sleep(3000);
        driver.navigate().forward(); //it will go to the nex website
        Thread.sleep(3000);
        driver.navigate().refresh(); //it will refresh website
        System.out.println(driver.getPageSource());
        
        

    }
}
