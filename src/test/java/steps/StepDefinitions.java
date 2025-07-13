package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import hooks.Hooks;
import pages.DashboardPage.DashboardPage;
import pages.EmployeeListPage.EmployeeListPage;
import pages.LoginPage.LoginPage;

public class StepDefinitions {

    WebDriver driver = Hooks.driver;
    LoginPage loginPage;
    DashboardPage dashboardPage;
    EmployeeListPage employeeListPage;

    String username = "Admin";
    String password = "admin123";

    @Given("I am on the OrangeHRM login page")
    public void i_am_on_login_page() {

        loginPage = new LoginPage(driver);
    }

    @When("I login with username and password")
    public void i_login_with_credentials() {
        loginPage.login(username, password);
    }

    @And("I navigate to Add Employee section")
    public void i_navigate_to_add_employee() {
        dashboardPage = new DashboardPage(driver);
        dashboardPage.goToAddEmployee();
    }

    @And("I navigate to Employee List section")
    public void i_navigate_to_employee_list() {
        dashboardPage.goToEmployeeList();
        employeeListPage = new EmployeeListPage(driver);
    }

    @And("I search for employee named {string}")
    public void i_search_for_employee(String name) {
        employeeListPage.searchEmployee(name);
    }

    @Then("I should see employee details displayed")
    public void i_should_see_employee_details_displayed() {
        assert employeeListPage.isEmployeeFound() : "Employee not found!";
    }
}
