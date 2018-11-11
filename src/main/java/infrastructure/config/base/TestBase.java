package infrastructure.config.base;

import infrastructure.config.logger.TestLogger;
import infrastructure.config.webdrivermanager.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class TestBase {

    private WebDriverManager wdm;
    protected WebDriver browser;
    protected TestLogger logger;

    @Before
    public void setUp() {
        logger = new TestLogger();
        wdm = new WebDriverManager();
        browser = wdm.getAvailableWebDriver();

        logger.log("Open website");
        browser.manage().window().maximize();
        beforeTest();
    }

    @After
    public void cleanUp() {
        afterTest();

        logger.log("Close browser");
        wdm.destroy(browser);
    }

    protected void beforeTest() {}

    protected void afterTest() {}
}
