package app.netlify.tests;

import app.netlify.pages.ShopEcommerceLogin;
import org.testng.annotations.Test;

import static app.netlify.pages.ShopEcommerceLogin.LOGIN_URL;

public class ShopEcommerceWithoutEmailLoginTest extends MainTest{

    @Test
    public void loginNegativeTest() {
        driver.get(LOGIN_URL);
        ShopEcommerceLogin shopEcommerceLogin = new ShopEcommerceLogin(driver);
        shopEcommerceLogin.enterEmail("");
        shopEcommerceLogin.enterPassword("admin123");
        shopEcommerceLogin.clickAuthButton();


    }
}
