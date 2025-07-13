package pages.DashboardPage;

import base.Locator;
import base.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static pages.DashboardPage.DashboardLabels.*;

public class DashboardPage {

    private final WebDriver driver;

    // Locators
    private final By pimMenuLocator = By.xpath(Locator.parseLocator(Locators.LEFT_MENU_TAB, PIM));
    private final By addEmployeeOptionLocator = By.xpath(Locator.parseLocator(Locators.TOP_MENU_TAB, ADD_EMPLOYEE));
    private final By employeeListOptionLocator = By.xpath(Locator.parseLocator(Locators.TOP_MENU_TAB, EMPLOYEE_LIST));

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void goToAddEmployee() {
        driver.findElement(pimMenuLocator).click();
        driver.findElement(addEmployeeOptionLocator).click();
    }

    public void goToEmployeeList() {
        driver.findElement(pimMenuLocator).click();
        driver.findElement(employeeListOptionLocator).click();
    }
}
