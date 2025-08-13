package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DashboardPage extends BasePage {
    private By pimMenu = By.xpath("//span[normalize-space()='PIM']");
    private By userMenu = By.cssSelector(".oxd-userdropdown-tab");
    private By logoutBtn = By.xpath("//a[normalize-space()='Logout']");

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public void goToPIM() {
        Actions actions = new Actions(driver);
        actions.moveToElement(find(pimMenu)).click().perform();
    }

    public void logout() {
        click(userMenu);
        click(logoutBtn);
    }
}
