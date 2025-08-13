package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddEmployeePage extends BasePage {
    private By firstName = By.name("firstName");
    private By lastName = By.name("lastName");
    private By saveBtn = By.xpath("//button[@type='submit']");

    public AddEmployeePage(WebDriver driver) {
        super(driver);
    }

    public void addEmployee(String fName, String lName) {
        type(firstName, fName);
        type(lastName, lName);
        click(saveBtn);
    }
}
