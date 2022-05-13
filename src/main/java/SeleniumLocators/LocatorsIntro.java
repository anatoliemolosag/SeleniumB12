package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIntro {

    public static void main(String[] args) {

        //Locator:ID
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///Users/anatoliemolosag/Downloads/Techtorialhtml.html");
       WebElement header=  driver.findElement(By.id("techtorial1"));
       String actualHeader = header.getText();
       String expectedHeader = "Techtorial Academy";
       if(actualHeader.equals(expectedHeader)){
           System.out.println("passed");
       }else {
           System.out.println("failed");
       }

       driver.get("file:///Users/anatoliemolosag/Downloads/Techtorialhtml.html");
       WebElement header1 = driver.findElement(By.id("details2"));
        String actualText = header1.getText();
        String expectedText = "To create your account, we'll need some basic information about you. This information will be used to send reservation confirmation emails, mail tickets when needed and contact you if your travel arrangements change. Please fill in the form completely.";
        if(actualText.equals(expectedText)){
            System.out.println("text passed");
        }else {
            System.out.println("text failed");
        }
        //Locator : Class

       WebElement allTools =  driver.findElement(By.className("group_checkbox"));

        System.out.println(allTools.getText());

        //Locator : Name
        WebElement nameBox = driver.findElement(By.name("firstName"));
        nameBox.sendKeys("Toni");

        WebElement lastNameBox = driver.findElement(By.name("lastName"));
        lastNameBox.sendKeys("Monatna");

        WebElement phoneNumberBox = driver.findElement(By.name("phone"));
        phoneNumberBox.sendKeys("224-410-5847");

        WebElement emaiBox = driver.findElement(By.name("userName"));
        emaiBox.sendKeys("anatolie.molosag94@gmail.com");

        WebElement adressBox = driver.findElement(By.name("address1"));
        adressBox.sendKeys("1203");

        WebElement adressBox1 = driver.findElement(By.name("address2"));
        adressBox1.sendKeys("Scott Ct");

        WebElement cityBox = driver.findElement(By.name("city"));
        cityBox.sendKeys("Carol Stream");

        WebElement stateBox = driver.findElement(By.name("state"));
        stateBox.sendKeys("Illinois");

        WebElement postalCodeBox = driver.findElement(By.name("postalCode"));
        postalCodeBox.sendKeys("60188");

        WebElement  userNameBox = driver.findElement(By.id("email"));
        userNameBox.sendKeys("anatolie.molosag94");

        WebElement passwordBox = driver.findElement(By.name("password"));
        passwordBox.sendKeys("123456789");

        WebElement confirmPasswordBox = driver.findElement(By.name("confirmPassword"));
        confirmPasswordBox.sendKeys("123456789");

        String actualConfirmPasswordBox = confirmPasswordBox.getText();
        String expectedConfirmPasswordBox = "123456789";
        if (actualConfirmPasswordBox.equals(expectedConfirmPasswordBox)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }


       // driver.close();



    }


}
