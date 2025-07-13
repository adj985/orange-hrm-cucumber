package pages.LoginPage;

import base.Locator;
import base.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static pages.LoginPage.LoginPageLabels.*;

public class LoginPage {

    private final WebDriver driver;

    private final By usernameLocator = By.xpath(Locator.parseLocator(Locators.INPUT, USERNAME));
    private final By passwordLocator = By.xpath(Locator.parseLocator(Locators.INPUT, PASSWORD));
    private final By loginButtonLocator = By.xpath(Locator.parseLocator(Locators.BUTTON, LOGIN));


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    public void enterUsername(String username) {
        if (!driver.findElement(usernameLocator).getText().isEmpty())
            driver.findElement(usernameLocator).clear();
        driver.findElement(usernameLocator).sendKeys(username);

    }

    public void enterPassword(String password) {
        if (!driver.findElement(passwordLocator).getText().isEmpty())
            driver.findElement(passwordLocator).clear();
        driver.findElement(passwordLocator).sendKeys(password);
    }


    public void clickLogin() {
        driver.findElement(loginButtonLocator).click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }

}
