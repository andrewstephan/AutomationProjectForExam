package app.netlify.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ShopEcommerceLogin extends MainPage{

    public static final String LOGIN_URL = BASE_URL+"auth_ecommerce.html";

    public ShopEcommerceLogin(WebDriver driver){super (driver);}

    @FindBy(id = "sidebarCollapse") WebElement sideBar;
    @FindBy(id = "email") private WebElement emailInput;
    @FindBy(id = "password") private WebElement passwordInput;
    @FindBy(id = "submitLoginBtn") private WebElement loginButton;
    @FindBy(id = "logout") private WebElement logoutButton;

    public void sideBarX(){sideBar.click();}

    public void enterEmail(String email){emailInput.sendKeys(email);}

    public void enterPassword(String password){passwordInput.sendKeys(password);}

    public void clickAuthButton(){loginButton.click();}
    public void logoutButtonFromOrderPage(){logoutButton.click();}

    public boolean logoutOutIsDisplayed(){return logoutButton.isDisplayed();}



}
