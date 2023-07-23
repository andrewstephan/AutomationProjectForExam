package app.netlify.tests;

import app.netlify.pages.CheckoutWithRandomAndNegativeInputs;
import app.netlify.pages.ShopEcommerceLogin;
import org.testng.annotations.Test;

import static app.netlify.pages.ShopEcommerceLogin.LOGIN_URL;

public class CheckoutWithRandomAndNegativeInputsTest extends MainTest{

    @Test
    public void loginTest() {
        driver.get(LOGIN_URL);
        CheckoutWithRandomAndNegativeInputs checkoutWithRandomAndNegativeInputs = new CheckoutWithRandomAndNegativeInputs(driver);
        checkoutWithRandomAndNegativeInputs.enterEmail("admin@admin.com");
        checkoutWithRandomAndNegativeInputs.enterPassword("admin123");
        checkoutWithRandomAndNegativeInputs.clickAuthButton();
        checkoutWithRandomAndNegativeInputs.checkOutButton();
        waitForNumberOfSeconds(2);
        checkoutWithRandomAndNegativeInputs.inputPhone("NUMAR DE TEST");
        waitForNumberOfSeconds(2);
        checkoutWithRandomAndNegativeInputs.inputStreet("Random Street");
        checkoutWithRandomAndNegativeInputs.cityFromRomania("Random City");
        checkoutWithRandomAndNegativeInputs.selectCountryFromDropDownList("Romania");
        waitForNumberOfSeconds(2);
        checkoutWithRandomAndNegativeInputs.submitOrderButton();
        waitForNumberOfSeconds(2);
        checkoutWithRandomAndNegativeInputs.logoutButtonFromOrderPage();


    }
}
