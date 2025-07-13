package pages.EmployeeListPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeListPage {

    private WebDriver driver;

    // Locators
    private By searchNameField = By.xpath("//label[text()='Employee Name']/../following-sibling::div//input");
    private By searchButton = By.xpath("//button[@type='submit']");
    private By resultRow = By.xpath("//div[@class='oxd-table-body']//div[contains(@class,'oxd-table-card')]");

    public EmployeeListPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchEmployee(String employeeName) {
        driver.findElement(searchNameField).sendKeys(employeeName);
        driver.findElement(searchButton).click();
    }

    public boolean isEmployeeFound() {
        return driver.findElements(resultRow).size() > 0;
    }
}
