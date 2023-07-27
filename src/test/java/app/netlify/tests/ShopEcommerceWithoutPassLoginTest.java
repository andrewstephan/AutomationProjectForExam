package app.netlify.tests;

import app.netlify.pages.ShopEcommerceLogin;
import app.netlify.pages.ShopEcommerceWithoutPassLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

import static app.netlify.pages.ShopEcommerceLogin.LOGIN_URL;

public class ShopEcommerceWithoutPassLoginTest extends MainTest{
    @Test
    public void loginNegativeTest() {
        driver.get(LOGIN_URL);
        ShopEcommerceLogin shopEcommerceLogin = new ShopEcommerceLogin(driver);
        ShopEcommerceWithoutPassLogin shopEcommerceWithoutPassLogin = new ShopEcommerceWithoutPassLogin(driver);
        shopEcommerceLogin.enterEmail("admin@admin.com");
        shopEcommerceLogin.enterPassword("");
        shopEcommerceLogin.clickAuthButton();
        Assert.assertTrue(shopEcommerceWithoutPassLogin.checkErrorMessage());


    }
}
