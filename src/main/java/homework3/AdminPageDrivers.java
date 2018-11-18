package homework3;

import homework2.AdminPageObjects;
import infrastructure.config.webdrivermanager.DriverManager;
import org.openqa.selenium.WebDriver;

public class AdminPageLoginMethod {

    public void loginToAdminPanel(WebDriver driver) {

        AdminPageObjects adminPage = new AdminPageObjects(driver);

        adminPage.emailField().sendKeys("webinar.test@gmail.com");
        adminPage.passwordField().sendKeys("Xcg7299bnSmMuRLp9ITw");
        adminPage.submitButton().click();
    }
}
