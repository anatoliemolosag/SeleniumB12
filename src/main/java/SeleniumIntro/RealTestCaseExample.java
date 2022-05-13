package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealTestCaseExample {
    public static void main(String[] args) {

        //  Test Case - Open Godaddy.com and validate it's Page title and the url.
//    Steps to Automate:
//            1. Launch browser of your choice say., Firefox, chrome etc.
//            2. Open this URL - https://www.godaddy.com/
//            3. Maximize or set size of browser window.
//4. Get Title of page and validate it.(if conditions)
//4. Get URL of current page and validate it.
//            5. Close browser.

        System.setProperty("webdriver.chrome.driver","chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.godaddy.com/");
        driver.manage().window().maximize();

        String actualTitle = driver.getTitle();
        String expectedTitle ="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title passed");
        }else{
            System.out.println("Title failed");
        }


        String actualURL1 = driver.getCurrentUrl();
        String expectedURL1 = "https://www.godaddy.com/";
        if(actualURL1.equals(expectedURL1)){
            System.out.println("URL Passed");
        }else{
            System.out.println("URL Failed");
        }
        driver.quit();//closes all the open chrmoes during the automation
        //driver.close();

    }
}
