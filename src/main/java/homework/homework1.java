package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        driver.get("https://www.apple.com/");
        //System.out.println(driver.getCurrentUrl()+" URL Passed");
        System.out.println(driver.getCurrentUrl());
        String actualURL1 = driver.getCurrentUrl();
        String expectedURL1 = "https://www.apple.com/";
        if(actualURL1.equals(expectedURL1)){
            System.out.println("URL Passed");
        }else{
            System.out.println("URL Failed");
        }
        String actualTitle1 = driver.getTitle();
        String expectedTitle1 ="Apple";
        if(actualTitle1.equals(expectedTitle1)){
            System.out.println("Title passed");
        }else{
            System.out.println("Title failed");
        }


        driver.get("https://www.prada.com/us/en.html");
        System.out.println(driver.getCurrentUrl());

        String actualURL2 = driver.getCurrentUrl();
        String expectedURL2 ="https://www.prada.com/us/en.html";
        if (actualURL2.equals(expectedURL2)){
            System.out.println("URL Passed");
        }else{
            System.out.println("URL Failed");
        }

        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "Prada Official Website | Thinking fashion since 1913 | PRADA";
        if(actualTitle2.equals(expectedTitle2)){
            System.out.println("Title passed");
        }else {
            System.out.println("Title failed");
        }



        driver.get("https://www.etsy.com/");
        System.out.println(driver.getCurrentUrl());
        String actualURL3 =driver.getCurrentUrl();
        String expectedURL3 = "https://www.etsy.com/";
        if(actualURL3.equals(expectedURL3)){
            System.out.println("URL Passed");
        }else {
            System.out.println("URL Failed");
        }
        String actualTitle3 = driver.getTitle();
        String expectedTitle3 ="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        if (actualTitle3.equals(expectedTitle3)){
            System.out.println("Title passed");
        }else {
            System.out.println("Title failed");
        }
        driver.close();

    }
}
