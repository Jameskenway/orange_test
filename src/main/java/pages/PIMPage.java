package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMPage extends BasePage {
    private By addEmployeeTab = By.linkText("Add Employee");
    private By employeeListTab = By.linkText("Employee List");

    public PIMPage(WebDriver driver) {
        super(driver);
    }

    public void openAddEmployee() {
        click(addEmployeeTab);
    }

    public void openEmployeeList() {
        click(employeeListTab);
    }
}
