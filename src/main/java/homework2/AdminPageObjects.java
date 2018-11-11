package homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AdminPageObjects {

    private WebDriver webDriver;

    public AdminPageObjects(WebDriver webDriver) {
        this.webDriver = webDriver;

        PageFactory.initElements(webDriver, this);
    }

    public WebElement emailField() {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
            return webDriver.findElement(By.id("email"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement passwordField() {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwd")));
            return webDriver.findElement(By.id("passwd"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement submitButton() {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submitLogin")));
            return webDriver.findElement(By.name("submitLogin"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement employeeNameDropdownToggle() {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='employee_avatar_small']")));
            return webDriver.findElement(By.xpath("//span[@class='employee_avatar_small']"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement logoutLink() {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("header_logout")));
            return webDriver.findElement(By.id("header_logout"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement menuItem(String itemText) {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), '" + itemText + "')]")));
            return webDriver.findElement(By.xpath("//span[contains(text(), '" + itemText + "')]"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public void printTitleText() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        Thread.sleep(2000);
        System.out.println(webDriver.getTitle());
    }

    public void refreshPage() {
        webDriver.navigate().refresh();
    }

}
