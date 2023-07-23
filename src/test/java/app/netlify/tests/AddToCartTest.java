package app.netlify.tests;

import app.netlify.pages.AddToCart;
import app.netlify.pages.ShopEcommerceLogin;
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
        addToCart.checkOutButton();
        addToCart.inputPhone("1234567890");
        addToCart.inputStreet("Eroilor");
        addToCart.cityFromRomania("Cluj");
        addToCart.selectCountryFromDropDownList("Romania");
        addToCart.submitOrderButton();
        waitForNumberOfSeconds(2);
        addToCart.logoutButtonFromOrderPage();





    }


}
