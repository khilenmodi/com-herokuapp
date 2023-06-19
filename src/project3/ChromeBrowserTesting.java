package project3;
/**
 * Project-3 - Project Name: com-herokuapp
 * BaseUrl = http://the-internet.herokuapp.com/login
 * 1. Setup Chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {

    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        // launching the chrome
        WebDriver driver = new ChromeDriver();
        // open the url
        driver.get(baseUrl);
        //manage the window maximize
        driver.manage().window().maximize();
        // manage the implicit time out
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // print the title of the page
        System.out.println("Print the title of the page :" + driver.getTitle());
        // print the current url
        System.out.println("Print the current Url :" + driver.getCurrentUrl());
        // print the page source
        System.out.println("Print the page source :" + driver.getPageSource());
        // enter the username into usernameField.
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys("tomsmith");
        // enter the password into passwordField
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SuperSecretPassword!");
        // closing object
        driver.close();
    }
}
