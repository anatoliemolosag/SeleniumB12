package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

    public static void main(String[] args) {
        //STEP1 : we need to dfine the chrome driver into the project as a property
        System.setProperty("webdriver.chrome.driver","chromedriver");

        //STEP2 : we need to instatiate(declare) our Chrome driver .
        WebDriver driver = new ChromeDriver();//Where do you use Polymorphysm in your Framework? in my WebDriver

        //getCurrentUrl() -- > it gets the url of the website
        System.out.println(driver.getCurrentUrl()+"before anything");
        //get() it will navigate to the website.
        driver.get("https://www.techtorialacademy.com/");
        System.out.println(driver.getCurrentUrl()+"After navigation");//techtorial academy.com
       String actualTitle = driver.getTitle();
       String expectedTitle = "Home Page - Techtorial";
       if(actualTitle.equals(expectedTitle)){
           System.out.println("passed");
       }else {
           System.out.println("failed");
       }





    }

}
