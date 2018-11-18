package infrastructure.config.webdrivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    public static WebDriver getDriver (String browser) {
        switch (browser) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//resources//geckodriver.exe");
                return new FirefoxDriver();
            case "chrome":
            default:
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//resources//chromedriver.exe");
                return new ChromeDriver();
            }

    }
}
