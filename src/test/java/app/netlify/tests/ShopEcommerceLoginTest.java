package app.netlify.tests;

import app.netlify.pages.MainPage;
import app.netlify.pages.ShopEcommerceLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

import static app.netlify.pages.ShopEcommerceLogin.LOGIN_URL;

public class ShopEcommerceLoginTest extends MainTest {

    @Test
    public void loginTest() {
        driver.get(LOGIN_URL);
        ShopEcommerceLogin shopEcommerceLogin = new ShopEcommerceLogin(driver);
        shopEcommerceLogin.sideBarX();
        waitForNumberOfSeconds(2);
        shopEcommerceLogin.enterEmail("admin@admin.com");
        shopEcommerceLogin.enterPassword("admin123");
        shopEcommerceLogin.clickAuthButton();
        waitForNumberOfSeconds(2);
        Assert.assertTrue(shopEcommerceLogin.logoutOutIsDisplayed());
        shopEcommerceLogin.logoutButtonFromOrderPage();

        String checkLoginUrl = "https://qa-practice.netlify.app/auth_ecommerce.html";
        Assert.assertEquals(checkLoginUrl, driver.getCurrentUrl());




    }
}
