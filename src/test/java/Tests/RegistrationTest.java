package Tests;

import Pages.RegistrationPage;
import Pages.ExcelUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

public class RegistrationTest extends BaseTest {

    @Test (priority = 1)
    public void testUserRegistration() throws IOException {
        RegistrationPage registrationPage = new RegistrationPage(driver);

        // Define Excel file path
        String filePath = "src/test/resources/EcommerceAutomationData.xlsx";

        // Read data from Excel
        String firstName = ExcelUtil.getCellData(filePath, "Sheet1", 1, 0);
        String middleName = ExcelUtil.getCellData(filePath, "Sheet1", 1, 1);
        String lastName = ExcelUtil.getCellData(filePath, "Sheet1", 1, 2);
        String email = ExcelUtil.getCellData(filePath, "Sheet1", 1, 3);
        String password = ExcelUtil.getCellData(filePath, "Sheet1", 1, 4);

        // Execute test case
        registrationPage.registerUser(firstName, middleName, lastName, email, password);

        // Validate successful registration
        Assert.assertTrue(registrationPage.isRegistrationSuccessful(), "Registration failed!");
    }
    @Test (priority = 2)
    public void testInvalidEmailFormat() {
        RegistrationPage registrationPage = new RegistrationPage(driver);

        registrationPage.registerUser("John", "Michael", "Doe", "iuuhyu.com", "Pass@1234");

        String emailError = registrationPage.getEmailErrorMessage();
        Assert.assertEquals(emailError, "Please enter a valid email address. For example johndoe@domain.com.");
    }
}
