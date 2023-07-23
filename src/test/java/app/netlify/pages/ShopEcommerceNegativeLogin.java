package app.netlify.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import static app.netlify.pages.ShopEcommerceLogin.LOGIN_URL;

public class ShopEcommerceNegativeLogin extends MainPage{

    public ShopEcommerceNegativeLogin(WebDriver driver){super (driver);}

    @FindBy(id = "email") private WebElement emailInput;
    @FindBy(id = "password") private WebElement passwordInput;
    @FindBy(id = "submitLoginBtn") private WebElement loginButton;

    public void enterEmail(String email){emailInput.sendKeys(email);}
    public void enterPassword(String password){passwordInput.sendKeys(password);}
    public void clickAuthButton(){loginButton.click();}
}
