package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpathPractice {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        Thread.sleep(2000);
        String actualUrl = driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        String expectedUrl = "https://www.facebook.com/";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("URL Passed");
        }else {
            System.out.println("URL Failed");
        }


        WebElement createAccountButton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        System.out.println(createAccountButton.isDisplayed());
        createAccountButton.click();
        Thread.sleep(3000);
        WebElement firstNameBox = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstNameBox.sendKeys("Toni");

        Thread.sleep(3000);
        WebElement lastNameBox = driver.findElement(By.xpath("//input[@aria-label='Last name']"));
        lastNameBox.sendKeys("Montana");

        Thread.sleep(3000);
        WebElement phoneNumberBox = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        phoneNumberBox.sendKeys("123456789");

        Thread.sleep(3000);;
        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        passwordBox.sendKeys("wertyuio");

        Thread.sleep(3000);
        WebElement birthMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        birthMonth.sendKeys("Oct");

        Thread.sleep(3000);
        WebElement birthDay = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        birthDay.sendKeys("23");

        Thread.sleep(3000);
        WebElement birthYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        birthYear.sendKeys("1994");

        Thread.sleep(3000);
        WebElement maleSelectBox = driver.findElement(By.xpath("//input[@value='2']"));
        maleSelectBox.click();

        Thread.sleep(3000);
        WebElement button = driver.findElement(By.xpath("//button[@name='websubmit']"));
        button.click();





        /*
        /*
    Facebook Sign up:
Scenario:
Open a Chrome browser.
Navigate to "http://www.fb.com"
Verify that the page is redirected to "http://www.facebook.com", by getting the current URL. (use Assertion)
Verify that there is a "Create an account" section on the page.
Fill in the text boxes: First Name, Surname, Mobile Number or email address, "Re-enter mobile number", new password.
Update the date of birth in the drop-down.
Select gender.
Click on "Create an account".
Verify that the account is not created.
         */



    }
}
