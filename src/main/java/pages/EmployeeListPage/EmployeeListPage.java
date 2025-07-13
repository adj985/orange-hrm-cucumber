package pages.EmployeeListPage;

import base.Locator;
import base.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pages.EmployeeListPage.EmployeeListLabels.EMPLOYEE_NAME;
import static pages.EmployeeListPage.EmployeeListLabels.SEARCH;

public class EmployeeListPage {

    private final WebDriver driver;

    // Locators
    private final By searchNameField = By.xpath(Locator.parseLocator(Locators.INPUT_BY_LABEL, EMPLOYEE_NAME));
    private final By searchButton = By.xpath(Locator.parseLocator(Locators.BUTTON, SEARCH));
    private final By resultRow = By.xpath(Locators.RESULT_ROW);

    public EmployeeListPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchEmployee(String employeeName) {
        driver.findElement(searchNameField).sendKeys(employeeName);
        driver.findElement(searchButton).click();
    }

    public boolean isEmployeeFound() {
        return !driver.findElements(resultRow).isEmpty();
    }
}
