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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTesting {

    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static String browser = "FireFox";
    static WebDriver driver;

    public static void main(String[] args) {
        // choose one of the browser to be open
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();

        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Invalid web browser");
        }
        // get the baseUrl
        driver.get(baseUrl);
        // maximize the window
        driver.manage().window().maximize();
        // implicit the time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        // print the title of the page
        System.out.println("Print the title of the page :" + driver.getTitle());
        // print the current url
        System.out.println("The Current Url is : " + driver.getCurrentUrl());
        // print the  page source
        System.out.println("page source is : " + driver.getPageSource());
        // enter the username into the userNameField
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys("tomsmith");
        // enter the password into passwordField
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SuperSecretPassword!");
        // closing object
        driver.close();
    }
}

