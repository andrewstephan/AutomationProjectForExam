package app.netlify.tests;

import app.netlify.pages.ShopEcommerceLogin;
import app.netlify.pages.ShopEcommerceWithoutEmailLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

import static app.netlify.pages.ShopEcommerceLogin.LOGIN_URL;

public class ShopEcommerceWithoutEmailLoginTest extends MainTest{

    @Test
    public void loginNegativeTest() {
        driver.get(LOGIN_URL);
        ShopEcommerceLogin shopEcommerceLogin = new ShopEcommerceLogin(driver);
        ShopEcommerceWithoutEmailLogin shopEcommerceWithoutEmailLogin = new ShopEcommerceWithoutEmailLogin(driver);
        shopEcommerceLogin.enterEmail("");
        shopEcommerceLogin.enterPassword("admin123");
        shopEcommerceLogin.clickAuthButton();
        Assert.assertTrue(shopEcommerceWithoutEmailLogin.checkErrorMessage());


    }
}
