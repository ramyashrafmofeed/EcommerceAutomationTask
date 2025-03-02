package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends BasePage {

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    private By accessoriesMenu = By.xpath("//a[contains(text(),'Accessories')]");
    private By shoesSubcategory = By.xpath("//a[contains(text(),'Shoes')]");
    private By filterPrice = By.xpath("//button[@data-filter='price']");
    private By selectProduct = By.xpath("//a[contains(text(),'Dorian Shoes')]");
    private By selectColor = By.id("color-option");
    private By selectSize = By.id("size-option");
    private By addToCartButton = By.id("add-to-cart");
    private By successMessage = By.xpath("//div[contains(text(),'has been added to your cart')]");

    public void addProductToCart() {
        driver.findElement(accessoriesMenu).click();
        driver.findElement(shoesSubcategory).click();
        driver.findElement(filterPrice).click();
        driver.findElement(selectProduct).click();
        driver.findElement(selectColor).click();
        driver.findElement(selectSize).click();
        driver.findElement(addToCartButton).click();
    }

    public boolean isProductAdded() {
        return driver.findElement(successMessage).isDisplayed();
    }
}
