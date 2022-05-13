package MentoringWithAhmet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinjaPractice {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","chromedriver");


        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();

        WebElement firstNameBox = driver.findElement(By.name("firstname"));
        firstNameBox.sendKeys("Toni");


        WebElement lastNameBox = driver.findElement(By.name("lastname"));
        lastNameBox.sendKeys("Montana");

        WebElement emailBox = driver.findElement(By.name("email"));
        emailBox.sendKeys("anatolie.molosag194@gmail.com");

        WebElement phoneNumberBox = driver.findElement(By.name("telephone"));
        phoneNumberBox.sendKeys("123456789");

        WebElement passwordBox = driver.findElement(By.name("password"));
        passwordBox.sendKeys("abcdefg");


        WebElement confirmPasswordBox = driver.findElement(By.name("confirm"));
        confirmPasswordBox.sendKeys("abcdefg");

        WebElement clickyes = driver.findElement(By.name("newsletter"));
        clickyes.click();

        WebElement agree = driver.findElement(By.name("agree"));
        agree.click();

        WebElement continueButton = driver.findElement(By.className("btn-primary"));
        continueButton.click();

        WebElement message = driver.findElement(By.id("content"));
        System.out.println(message.getText());

        //driver.close();




    }
}
