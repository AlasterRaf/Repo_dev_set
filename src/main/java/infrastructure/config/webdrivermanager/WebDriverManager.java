package infrastructure.config.webdrivermanager;

import infrastructure.config.config.ConfigurationManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {

    public WebDriver getAvailableWebDriver(){

        String testBrowser = ConfigurationManager.getInstance().getTestBrowser().toLowerCase();

        switch (testBrowser) {
            case "chrome":
                return new ChromeDriver();
            case  "firefox":
                return new FirefoxDriver();
            default:
                throw new RuntimeException("This browser is not supported");
        }
    }


    public void destroy (WebDriver browser) {
        if (browser != null) {
            browser.quit();
        }
        System.out.println(browser + "was closed");
    }
}
