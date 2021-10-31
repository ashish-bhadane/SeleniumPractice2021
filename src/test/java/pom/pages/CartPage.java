package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.base.BasePage;

public class CartPage extends BasePage {
    private final By checkoutBtn = By.cssSelector(".checkout-button");
    private final By loginBtn = By.cssSelector(".showlogin");

    public CartPage(WebDriver driver) {
        super(driver);
    }
    public void clickCheckoutBtn(){
        driver.findElement(checkoutBtn).click();
    }

    public void navigateToLogin() {
        driver.findElement(loginBtn).click();
    }
}
