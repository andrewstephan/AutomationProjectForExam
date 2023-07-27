package app.netlify.tests;

import app.netlify.pages.AddToCart;
import app.netlify.pages.ShopEcommerceLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

import static app.netlify.pages.ShopEcommerceLogin.LOGIN_URL;

public class AddToCartTest extends MainTest{

    @Test
    public void loginTest() {
        driver.get(LOGIN_URL);
        AddToCart addToCart = new AddToCart(driver);
        addToCart.enterEmail("admin@admin.com");
        addToCart.enterPassword("admin123");
        addToCart.clickAuthButton();
        addToCart.clickAddToCart();
        waitForNumberOfSeconds(2);
        addToCart.clickRemoveToCart();
        waitForNumberOfSeconds(2);
        addToCart.clickAddToCartAnotherPhone();
        waitForNumberOfSeconds(2);
        Assert.assertTrue(addToCart.checkOutButtonIsThere());
        addToCart.checkOutButton();
        addToCart.inputPhone("1234567890");
        addToCart.inputStreet("Eroilor");
        addToCart.cityFromRomania("Cluj");
        addToCart.selectCountryFromDropDownList("Romania");
        addToCart.submitOrderButton();
        waitForNumberOfSeconds(2);
        addToCart.logoutButtonFromOrderPage();

        String messageAfterSubmit = "Congrats! Your order of $236.12 has been registered and will be shipped to Eroilor, Cluj - Romania.";
        String expectedMessage = "Congrats! Your order of $236.12 has been registered and will be shipped to Eroilor, Cluj - Romania.";
        Assert.assertEquals(messageAfterSubmit, expectedMessage);






    }


}
