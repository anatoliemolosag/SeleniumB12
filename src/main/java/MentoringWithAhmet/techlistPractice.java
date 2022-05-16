package MentoringWithAhmet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class techlistPractice {
    public static void main(String[] args) {



        //  Open this link - https://www.techlistic.com/p/selenium-practice-form.html //Validate the currrent url // validate the title // validate the header "Demo Sign-Up Selenium Automation Practice Form"
//Enter first and last name (textbox).
//Select gender (radio button).
//Select years of experience (radio button).
//Enter date.
//Select Profession (Checkbox).
//Select Automation tools you are familiar with (multiple checkboxes).
//Select Continent (Select box).
//Select multiple commands from a multi select box.
//Click on Submit button.
//   */
//    }


        System.setProperty("webdriver.chrome.driver","chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        //driver.manage().window().maximize();

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl = "https://www.techlistic.com/p/selenium-practice-form.html";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("url passed");
        }else {
            System.out.println("url failed");
        }

        String actualTitle = driver.getTitle();
        String expectedTitle = "";
        if (actualTitle.equals(expectedTitle)){
            System.out.println("title passed");
        }else {
            System.out.println("title failed");
        }

        WebElement firstNameBox = driver.findElement(By.name("firstname"));
        firstNameBox.sendKeys("Anatolie");

        WebElement lastNameBox = driver.findElement(By.name("lastname"));
        lastNameBox.sendKeys("Molosag");

        WebElement maleGenderCircle = driver.findElement(By.name("sex"));
        maleGenderCircle.click();

        WebElement yearsOfExperienceCircle = driver.findElement(By.id("exp-3"));
        yearsOfExperienceCircle.click();

        WebElement dateBox = driver.findElement(By.id("datepicker"));
        dateBox.sendKeys("05/13/2022");

        WebElement manualTesterBox =driver.findElement(By.id("profession-0"));
        manualTesterBox.click();

        WebElement autoTester = driver.findElement(By.id("profession-1"));
        autoTester.click();

        WebElement autoToolsBox = driver.findElement(By.id("tool-0"));
        autoToolsBox.click();

        WebElement selWebdriverBox = driver.findElement(By.id("tool-2"));
        selWebdriverBox.click();

        WebElement continentBox = driver.findElement(By.id("continents"));
        continentBox.click();
        continentBox.sendKeys("North America");
        continentBox.click();

        WebElement comandsBox = driver.findElement(By.id("selenium_commands"));
        Select obj = new Select(comandsBox);

        obj.selectByIndex(0);
        obj.selectByIndex(1);
        obj.selectByIndex(2);
        obj.selectByIndex(3);
        obj.selectByVisibleText("WebElement Commands");

        List<WebElement>selectAll = obj.getAllSelectedOptions();
        for (WebElement elements : selectAll){
            System.out.println(elements.getText());
        }


        WebElement button = driver.findElement(By.className("btn-info"));
        button.click();

























    }
}
