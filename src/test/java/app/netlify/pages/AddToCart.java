package app.netlify.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends MainPage{

    public static final String LOGIN_URL = BASE_URL+"auth_ecommerce.html";

    public AddToCart(WebDriver driver){super(driver);}



    @FindBy(id = "email") private WebElement emailInput;
    @FindBy(id = "password") private WebElement passwordInput;
    @FindBy(id = "submitLoginBtn") private WebElement loginButton;
    @FindBy(xpath = "//*[@id=\"prooood\"]/section[2]/div/div[1]/div/button") private WebElement addToCartPhone;
    @FindBy(xpath = "//*[@id=\"prooood\"]/section[1]/div[2]/div/div[2]/button") private WebElement removeElement;
    @FindBy(xpath = "//*[@id=\"prooood\"]/section[2]/div/div[2]/div/button") private WebElement addAnotherPhoneToCart;
    @FindBy(xpath = "//*[@id=\"prooood\"]/section[1]/button") private WebElement checkOut;
    @FindBy(id ="phone") private WebElement intPhone;
    @FindBy(name = "street") private WebElement streetInput;
    @FindBy(name = "city") private WebElement cityInput;
    @FindBy(id = "countries_dropdown_menu") private WebElement selectCountry;
    @FindBy(id = "submitOrderBtn") private WebElement submitOrder;
    @FindBy(id = "logout") private WebElement logoutButton;

    public void enterEmail(String email){emailInput.sendKeys(email);}

    public void enterPassword(String password){passwordInput.sendKeys(password);}

    public void clickAuthButton(){loginButton.click();}
    public void clickAddToCart(){addToCartPhone.click();}
    public void clickRemoveToCart(){removeElement.click();}
    public void clickAddToCartAnotherPhone(){addAnotherPhoneToCart.click();}
    public boolean checkOutButtonIsThere(){return checkOut.isDisplayed();}
    public void checkOutButton(){checkOut.click();}
    public void inputPhone(String phone){intPhone.sendKeys(phone);}
    public void inputStreet(String street){streetInput.sendKeys(street);}
    public void cityFromRomania(String city){cityInput.sendKeys(city);}
    public void selectCountryFromDropDownList(String countrier_dropdown_menu){selectCountry.sendKeys(countrier_dropdown_menu);}
    public void submitOrderButton(){submitOrder.click();}
    public void logoutButtonFromOrderPage(){logoutButton.click();}

}

