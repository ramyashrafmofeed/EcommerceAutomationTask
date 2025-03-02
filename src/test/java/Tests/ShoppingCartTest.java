package Tests;

import Pages.ShoppingCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTest extends BaseTest {

    @Test(priority = 5)
    public void testAddProductToCart() {
        ShoppingCartPage cartPage = new ShoppingCartPage(driver);
        cartPage.addProductToCart();
        Assert.assertTrue(cartPage.isProductAdded(), "Product was not added to the cart!");
    }
}