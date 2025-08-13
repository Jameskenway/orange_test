package tests;

import base.BaseTest;
import pages.LoginPage;
import pages.DashboardPage;
import pages.PIMPage;
import pages.AddEmployeePage;
import pages.EmployeeListPage;

public class OrangeHRMTest extends BaseTest {

    public static void main(String[] args) {
        OrangeHRMTest test = new OrangeHRMTest();
        test.runTest();
    }

    public void runTest() {
        try {
            // Start browser
            setUp();

            // Step 1 - Login
            LoginPage loginPage = new LoginPage(driver);
            loginPage.open();
            loginPage.login("Admin", "admin123");

            // Step 2 - Go to PIM
            DashboardPage dashboard = new DashboardPage(driver);
            dashboard.goToPIM();

            // Step 3 - Add employees
            PIMPage pimPage = new PIMPage(driver);
            pimPage.openAddEmployee();

            AddEmployeePage addEmp = new AddEmployeePage(driver);
            String[][] employees = {
                {"John", "Doe"},
                {"Jane", "Smith"},
                {"Mike", "Brown"}
            };

            for (String[] emp : employees) {
                addEmp.addEmployee(emp[0], emp[1]);
                dashboard.goToPIM();
                pimPage.openAddEmployee();
            }

            // Step 4 - Verify employees
            pimPage.openEmployeeList();
            EmployeeListPage empList = new EmployeeListPage(driver);
            for (String[] emp : employees) {
                empList.verifyEmployee(emp[0]);
            }

            // Step 5 - Logout
            dashboard.logout();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close browser
            tearDown();
        }
    }
}
