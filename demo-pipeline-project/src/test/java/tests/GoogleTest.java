package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {

    @Test
    public void testGoogle() {

        // Step 1: Setup driver
        WebDriverManager.chromedriver().setup();

        // Step 2: Add headless options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");   // IMPORTANT
        options.addArguments("--no-sandbox");     // IMPORTANT
        options.addArguments("--disable-dev-shm-usage"); // IMPORTANT

        // Step 3: Launch browser
        WebDriver driver = new ChromeDriver(options);

        // Step 4: Open website
        driver.get("https://www.google.com");

        // Step 5: Print title
        System.out.println("Title: " + driver.getTitle());

        // Step 6: Close browser
        driver.quit();
    }
}