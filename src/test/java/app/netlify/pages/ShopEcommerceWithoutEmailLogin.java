package app.netlify.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopEcommerceWithoutEmailLogin extends MainPage {

    public ShopEcommerceWithoutEmailLogin(WebDriver driver){super(driver);}

    @FindBy(id = "email") private WebElement emailInput;
    @FindBy(id = "password") private WebElement passwordInput;
    @FindBy(id = "submitLoginBtn") private WebElement loginButton;
    @FindBy(xpath = "//*[@id=\"message\"]") private WebElement checkErrorMessageFromLoginpage;

    public void enterEmail(String email){emailInput.sendKeys(email);}
    public void enterPassword(String password){passwordInput.sendKeys(password);}
    public void clickAuthButton(){loginButton.click();}
    public boolean checkErrorMessage(){return checkErrorMessageFromLoginpage.getText().contains("Bad credentials! Please try again! Make sure that you've registered.");}
}
