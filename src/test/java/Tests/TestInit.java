package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {

    public WebDriver driver;

    @BeforeMethod
    public void before() {
//        System.setProperty("webdriver.chrome.driver", "C:/Users/user/.cache/selenium/chromedriver/win64/127.0.6533.88");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
    }

    @AfterMethod
        public void quit() {
        this.driver.quit();
    }
}
