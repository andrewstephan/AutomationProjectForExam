package app.netlify.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    protected WebDriver driver;

    public static String BASE_URL = "https://qa-practice.netlify.app/";

    public MainPage(WebDriver driver){PageFactory.initElements(driver, this);}
}
