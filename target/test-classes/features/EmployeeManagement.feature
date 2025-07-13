# Feature file
Feature: Employee Management

  Scenario: Login and search for an employee
    Given I am on the OrangeHRM login page
    When I login with username and password
    And I navigate to Add Employee section
    And I navigate to Employee List section
    And I search for employee named "Linda"
    Then I should see employee details displayed
