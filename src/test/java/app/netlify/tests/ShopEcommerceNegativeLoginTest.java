package app.netlify.tests;

import app.netlify.pages.ShopEcommerceLogin;
import org.testng.annotations.Test;

import static app.netlify.pages.ShopEcommerceLogin.LOGIN_URL;

public class ShopEcommerceNegativeLoginTest extends MainTest{

    @Test
    public void loginNegativeTest() {
        driver.get(LOGIN_URL);
        ShopEcommerceLogin shopEcommerceLogin = new ShopEcommerceLogin(driver);
        shopEcommerceLogin.enterEmail("admin@admin.com");
        shopEcommerceLogin.enterPassword("admin12345");
        shopEcommerceLogin.clickAuthButton();


    }
}
