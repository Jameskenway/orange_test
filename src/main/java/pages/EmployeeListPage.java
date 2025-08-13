package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;
import org.openqa.selenium.WebElement;

public class EmployeeListPage extends BasePage {
    private By employeeNames = By.xpath("//div[@role='row']/div[3]");

    public EmployeeListPage(WebDriver driver) {
        super(driver);
    }

    public boolean verifyEmployee(String name) {
        List<WebElement> namesList = driver.findElements(employeeNames);
        for (WebElement el : namesList) {
            if (el.getText().equalsIgnoreCase(name)) {
                System.out.println("Name Verified: " + name);
                return true;
            }
        }
        return false;
    }
}
