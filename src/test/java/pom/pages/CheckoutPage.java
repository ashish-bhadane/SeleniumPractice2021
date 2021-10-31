package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pom.base.BasePage;

public class CheckoutPage extends BasePage {
    private final By checkoutHeading = By.xpath("//h1");
    private final By firstNameTxtBx = By.cssSelector("#billing_first_name");
    private final By lastNameTxtBx = By.cssSelector("#billing_last_name");
    private final By addressTxtBx = By.cssSelector("#billing_address_1");
    private final By cityTxtBx = By.cssSelector("#billing_city");
    private final By postCode = By.id("billing_postcode");
    private final By emailTxt = By.id("billing_email");
    private final By placeOrderBtn = By.id("place_order");
    private final By successMsg = By.cssSelector(".woocommerce-notice");

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    public void enterFirstName(String firstName){
        driver.findElement(firstNameTxtBx).clear();
        driver.findElement(firstNameTxtBx).sendKeys(firstName);
    }
    public void enterLastName(String lastName){
        driver.findElement(lastNameTxtBx).clear();
        driver.findElement(lastNameTxtBx).sendKeys(lastName);
    }
    public void enterBillingAddress(String address){
        driver.findElement(addressTxtBx).clear();
        driver.findElement(addressTxtBx).sendKeys(address);
    }
    public void enterCity(String city){
        driver.findElement(cityTxtBx).clear();
        driver.findElement(cityTxtBx).sendKeys(city);
    }
    public void enterPostCode(String postcode){
        driver.findElement(postCode).clear();
        driver.findElement(postCode).sendKeys(postcode);
    }
    public void enterEmail(String email){
        driver.findElement(emailTxt).clear();
        driver.findElement(emailTxt).sendKeys(email);
    }
    public void clickPlaceorder(){
        driver.findElement(placeOrderBtn).click();
    }
    public String getheading(){
        return driver.findElement(checkoutHeading).getText();
    }
    public String getSuccessMsg(){
        return driver.findElement(successMsg).getText();
    }
}

