package HomePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.WeakHashMap;

public class youtube {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.youtube.com/");

        Thread.sleep(1000);
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
        searchBox.sendKeys("coldplay fix you");

        Thread.sleep(2000);
        WebElement searchButton =driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        searchButton.click();

        Thread.sleep(1000);
        WebElement clickSong = driver.findElement(By.xpath("//a[@title='Coldplay - Fix You (Official Video)']"));
        clickSong.click();

        Thread.sleep(8000);
        WebElement skipButton = driver.findElement(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']"));
        skipButton.click();

        Thread.sleep(7000);
        WebElement signInButton = driver.findElement(By.xpath("//tp-yt-paper-button[@class='style-scope ytd-button-renderer style-suggestive size-small']"));
        signInButton.click();

        Thread.sleep(1000);
        WebElement emailBox = driver.findElement(By.xpath("//input[@type='email']"));
        emailBox.sendKeys("anatolie.molosag94@gmail.com");
        Thread.sleep(2000);
        driver.navigate().back();

        WebElement homePageButton = driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-logo']"));
        homePageButton.click();

        Thread.sleep(2000);
        WebElement searchBox1 = driver.findElement(By.xpath("//input[@id='search']"));
        searchBox1.sendKeys("coldplay");

        Thread.sleep(2000);
        WebElement searchButton1 =driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        searchButton1.click();

        List<WebElement> headerSongs = driver.findElements(By.tagName("h3"));

        for (WebElement element : headerSongs ){
            if(element.getText().toUpperCase().trim().contains("Yellow")){
                System.out.println(element.getText());
                element.click();
            }else {
                System.out.println("not available");
            }
        }











    }
}
