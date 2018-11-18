package homework3;

import homework2.AdminPageObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AdminPageDrivers {

    public void loginToAdminPanel(WebDriver driver) {

        AdminPageObjects adminPage = new AdminPageObjects(driver);

        adminPage.emailField().sendKeys("webinar.test@gmail.com");
        adminPage.passwordField().sendKeys("Xcg7299bnSmMuRLp9ITw");
        adminPage.submitButton().click();
    }

    public void hoverMouseOnMenuItem(WebDriver driver) {
        Actions action = new Actions(driver);
        AdminPageObjects adminPage = new AdminPageObjects(driver);

        action.moveToElement(adminPage.catalogMenuItem()).perform();
    }

    public String categoryName() {
        return "New category for Roman";
    }

}
