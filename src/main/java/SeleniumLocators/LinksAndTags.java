package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAndTags {

    public static void main(String[] args) throws InterruptedException {

    //LinkText()

        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///Users/anatoliemolosag/Downloads/Techtorialhtml.html");

        WebElement javaLink = driver.findElement(By.linkText("Java"));
        javaLink.click();
        /*
        1-get the header of oracle page(sout text)
        2-navigate back to main page and click selenium and sout getTitle
        3- navigate back to main page and click Cucumber and sout header of page
        4-go back to main and refresh it
         */

        WebElement header = driver.findElement(By.className("rwaccent"));
        System.out.println(header.getText());
        //Thread.sleep(3000);
        driver.navigate().back();
        //Thread.sleep(3000);

        WebElement selenium = driver.findElement(By.linkText("Selenium"));
        selenium.click();
        System.out.println(driver.getTitle());
        //Thread.sleep(3000);
        driver.navigate().back();

        WebElement cucumber = driver.findElement(By.linkText("Cucumber"));
        cucumber.click();
        WebElement header1 = driver.findElement(By.className("font-light"));
        System.out.println(header1.getText());
        //Thread.sleep(3000);
        driver.navigate().back();
        //Thread.sleep(3000);
        driver.navigate().refresh();
        //Thread.sleep(3000);

        System.out.println("-------------------------------------------------------");
        //LOCATOR : PartialLinkText() -->is a part of linktext.(it means you can use piece of whole word)
        WebElement restApiLink = driver.findElement(By.partialLinkText("Rest"));
        restApiLink.click();
        System.out.println(driver.getTitle());
        driver.navigate().back();

        System.out.println("--------------------------------------------------------");
        //Locator : tag name;
        WebElement version=driver.findElement(By.tagName("u"));
        System.out.println(version.getText());

        driver.get("https://the-internet.herokuapp.com");

        WebElement horizontalSlider = driver.findElement(By.partialLinkText("Slider"));
        horizontalSlider.click();

        WebElement horizontalHeader = driver.findElement(By.tagName("h3"));
        System.out.println(horizontalHeader.getText());
        String actualHorizontalHeader = horizontalHeader.getText().trim();
        String explectedHorizontalHeader ="Horizontal Slider";
        if (actualHorizontalHeader.equals(explectedHorizontalHeader)){
            System.out.println("header passed");
        }else {
            System.out.println("header failed");
        }

        WebElement pharagraph = driver.findElement(By.tagName("h4"));
        System.out.println(pharagraph.getText());











    }
}
