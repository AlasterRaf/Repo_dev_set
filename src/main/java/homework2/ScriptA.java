package homework2;

import infrastructure.config.logger.TestLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScriptA {

    public static void main(String[] args) {

        TestLogger logger = new TestLogger();
        WebDriver driver = new ChromeDriver();
        AdminPageObjects adminPage = new AdminPageObjects(driver);

        logger.log("Open admin website");
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminLogin&token=d251f363cceb5a849cb7330938c64dea");

        logger.log("Enter email");
        adminPage.emailField().sendKeys("webinar.test@gmail.com");

        logger.log("Enter password");
        adminPage.passwordField().sendKeys("Xcg7299bnSmMuRLp9ITw");

        logger.log("Click submit button");
        adminPage.submitButton().click();

        logger.log("Click employee name dropdown toggle");
        adminPage.employeeNameDropdownToggle().click();

        logger.log("Click logout link");
        adminPage.logoutLink().click();

        logger.log("Close the browser");
        driver.quit();
    }
}
