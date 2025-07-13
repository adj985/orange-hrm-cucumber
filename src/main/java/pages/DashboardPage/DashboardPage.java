package pages.DashboardPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    private WebDriver driver;

    // Locators
    private By pimMenu = By.xpath("//span[text()='PIM']");
    private By addEmployeeOption = By.xpath("//a[text()='Add Employee']");
    private By employeeListOption = By.xpath("//a[text()='Employee List']");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToAddEmployee() {
        driver.findElement(pimMenu).click();
        driver.findElement(addEmployeeOption).click();
    }

    public void goToEmployeeList() {
        driver.findElement(pimMenu).click();
        driver.findElement(employeeListOption).click();
    }
}
