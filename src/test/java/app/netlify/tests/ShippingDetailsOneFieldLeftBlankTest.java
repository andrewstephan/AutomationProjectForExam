package app.netlify.tests;

import app.netlify.pages.CheckoutWithRandomAndNegativeInputs;
import app.netlify.pages.ShippingDetailsOneFieldLeftBlank;
import org.testng.annotations.Test;

import static app.netlify.pages.ShopEcommerceLogin.LOGIN_URL;

public class ShippingDetailsOneFieldLeftBlankTest extends MainTest{

    @Test
    public void loginTest() {
        driver.get(LOGIN_URL);
        ShippingDetailsOneFieldLeftBlank shippingDetailsOneFieldLeftBlank = new ShippingDetailsOneFieldLeftBlank(driver);
        shippingDetailsOneFieldLeftBlank.enterEmail("admin@admin.com");
        shippingDetailsOneFieldLeftBlank.enterPassword("admin123");
        shippingDetailsOneFieldLeftBlank.clickAuthButton();
        shippingDetailsOneFieldLeftBlank.checkOutButton();
        waitForNumberOfSeconds(2);
        shippingDetailsOneFieldLeftBlank.inputPhone("NUMAR DE TEST");
        waitForNumberOfSeconds(2);
        shippingDetailsOneFieldLeftBlank.inputStreet("Random Street");
        shippingDetailsOneFieldLeftBlank.cityFromRomania("");
        shippingDetailsOneFieldLeftBlank.selectCountryFromDropDownList("Romania");
        waitForNumberOfSeconds(2);
        shippingDetailsOneFieldLeftBlank.submitOrderButton();
        waitForNumberOfSeconds(2);
        shippingDetailsOneFieldLeftBlank.logoutButtonFromOrderPage();


    }
}
