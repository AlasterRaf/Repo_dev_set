package homework3;

import homework2.AdminPageObjects;
import infrastructure.config.logger.TestLogger;
import infrastructure.config.webdrivermanager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class Script {

    public static void main(String[] args) throws InterruptedException {

        AdminPageDrivers adminPageDriver = new AdminPageDrivers();
        TestLogger logger = new TestLogger();
        WebDriver driver = DriverManager.getDriver("chrome");
        AdminPageObjects adminPage = new AdminPageObjects(driver);


        logger.log("Open admin website");
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0");

        logger.log("Log in to the Admin Panel");
        adminPageDriver.loginToAdminPanel(driver);

        logger.log("Click on Categories");
        adminPageDriver.hoverMouseOnMenuItem(driver);
        adminPage.categoriesSubMenuItem().click();

        logger.log("Click Add New Category button");
        adminPage.addNewCategoryButton().click();

        logger.log("Add new category and save it");
        adminPage.categoryNameField().sendKeys(adminPageDriver.categoryName());
        adminPage.saveNewCategoryButton().click();

        logger.log("Check success message");
        assertTrue(adminPage.successMessage().isDisplayed());

        logger.log("Filter categories by name");
        adminPage.searcByNameField().sendKeys(adminPageDriver.categoryName());
        adminPage.searcByNameButton().click();

        logger.log("Check filter results");
        assertTrue(adminPage.searcByNameElement().isDisplayed());

        Thread.sleep(5000);

        logger.log("Close the browser");
        driver.quit();
    }
}
