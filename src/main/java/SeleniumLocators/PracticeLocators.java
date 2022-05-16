package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLocators {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://katalon-demo-cura.herokuapp.com/");

        Thread.sleep(1000);
        WebElement makeApptButton = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        makeApptButton.click();

        Thread.sleep(1000);
        WebElement userNameBox = driver.findElement(By.xpath("//input[@id='txt-username']"));
        userNameBox.sendKeys("John Doe");

        Thread.sleep(1000);
        WebElement passwordBox = driver.findElement(By.xpath("//input[@id='txt-password']"));
        passwordBox.sendKeys("ThisIsNotAPassword");

        Thread.sleep(1000);
        WebElement lodInButton = driver.findElement(By.xpath("//button[@id='btn-login']"));
        lodInButton.click();

        Thread.sleep(1000);
        WebElement facilitBox = driver.findElement(By.xpath("//select[@id='combo_facility']"));
        facilitBox.sendKeys("Hongkong CURA Healthcare Center");

        Thread.sleep(1000);
        WebElement applyCheckmark =driver.findElement(By.xpath("//input[@id='chk_hospotal_readmission']"));
        applyCheckmark.click();

        Thread.sleep(1000);
        WebElement healthCareCheckMark = driver.findElement(By.xpath("//input[@id='radio_program_medicaid']"));
        healthCareCheckMark.click();

        Thread.sleep(1000);
        WebElement visitDateBox = driver.findElement(By.xpath("//input[@id='txt_visit_date']"));
        visitDateBox.sendKeys("16/05/2022");

        Thread.sleep(1000);
        WebElement commentBox = driver.findElement(By.xpath("//textarea[@id='txt_comment']"));
        commentBox.sendKeys("Please do it ASAP");

        Thread.sleep(1000);
        WebElement bookApptButton = driver.findElement(By.xpath("//button[contains(text(),'Book Appointment')]"));
        bookApptButton.click();

        Thread.sleep(1000);
        WebElement header = driver.findElement(By.xpath("//h2[contains(text(),'Appointment Confirmation')]"));
        System.out.println(header.getText());

        Thread.sleep(1000);
        WebElement paragraph = driver.findElement(By.xpath("//p[contains(text(),'Please be informed that your appointment has been booked as following:')]"));
        System.out.println(paragraph.getText());

        Thread.sleep(1000);
        WebElement value1 =driver.findElement(By.xpath("//p[contains(text(),'Hongkong CURA Healthcare Center')]"));
        System.out.println(value1.getText());

        Thread.sleep(1000);
        WebElement value2 =driver.findElement(By.xpath("//p[contains(text(),'Yes')]"));
        System.out.println(value2.getText());

        Thread.sleep(1000);
        WebElement value3 = driver.findElement(By.xpath("//p[contains(text(),'Medicaid')]"));
        System.out.println(value3.getText());

        Thread.sleep(1000);
        WebElement value4 = driver.findElement(By.xpath("//p[contains(text(),'16/05/2022')]"));
        System.out.println(value4.getText());

        Thread.sleep(1000);
        WebElement value5 = driver.findElement(By.xpath("//p[.='Please do it ASAP']"));
        System.out.println(value5.getText());

        Thread.sleep(1000);
        WebElement homePageButton = driver.findElement(By.xpath("//a[.='Go to Homepage']"));
        homePageButton.click();

        System.out.println(driver.getCurrentUrl());





                /*
                1-Navigate to the https://katalon-demo-cura.herokuapp.com/
                2-click make an appointment
                3-Log in the username and password and click login succesfully
                4-Choose the facility by send key HongKong or Seul
                5-Please apply for hospital admission
                6-HealthCare program 'Medicaid"
                7-Visit date should be provided
                8-Put your comment for this box
                9-Book your appt
                Note : this parts shoud be done by Contains or Xpath methods
                10-Print out the headers and values(only values) on your console.
                 */

    }
}
