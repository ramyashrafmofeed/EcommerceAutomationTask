package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage {

    // Constructor
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    private By firstNameField = By.id("firstname");

    private By middleNameField = By.id("middlename");

    private By lastNameField = By.id("lastname");
    private By emailField = By.id("email_address");
    private By passwordField = By.id("password");
    private By confirmPasswordField = By.id("confirmation");
    private By submitButton = By.xpath("//button[@title='Register']");
    private By successMessage = By.xpath("//span[contains(text(),'Thank you for registering')]");

    private By emailError = By.id("advice-validate-email-email_address");


    // Actions
    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void enterMiddleName(String middlename) {
        driver.findElement(middleNameField).sendKeys(middlename);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }

    public void clickCreateAccount() {
        driver.findElement(submitButton).click();
    }

    // Full registration method

    public String getEmailErrorMessage() {
        return driver.findElement(emailError).getText();
    }
    public void registerUser(String firstName, String middleName, String lastName, String email, String password) {
        enterFirstName(firstName);
        enterMiddleName(middleName);
        enterLastName(lastName);
        enterEmail(email);
        enterPassword(password);
        enterConfirmPassword(password);
        clickCreateAccount();
    }

    // Success validation
    public boolean isRegistrationSuccessful() {
        return driver.findElement(successMessage).isDisplayed();
    }
}
