package Tests;

import Pages.LoginPage;
import Pages.ExcelUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

public class LoginTest extends BaseTest {

    @Test(priority = 3)
    public void testValidLogin() throws IOException {
        driver.get("https://ecommerce.tealiumdemo.com/customer/account/login/");
        LoginPage loginPage = new LoginPage(driver);

        String filePath = "src/test/resources/EcommerceAutomationData.xlsx";
        String email = ExcelUtil.getCellData(filePath, "Sheet2", 1, 0);
        String password = ExcelUtil.getCellData(filePath, "Sheet2", 1, 1);

        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLogin();

        Assert.assertTrue(loginPage.isLoginSuccessful(), "Login failed!");
    }

    @Test(priority = 4)
    public void testInvalidLogin() {
        driver.get("https://ecommerce.tealiumdemo.com/customer/account/login/");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail("MailNotRegistered@mail.com");
        loginPage.enterPassword("WrongPass123");
        loginPage.clickLogin();

        Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Error message not displayed!");
    }
}
