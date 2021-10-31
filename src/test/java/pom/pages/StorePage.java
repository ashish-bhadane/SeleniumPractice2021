package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pom.base.BasePage;

public class StorePage extends BasePage {
    private final By searchField = By.id("woocommerce-product-search-field-0");
    private final By searchBtn = By.cssSelector("button[value='Search']");
    private final By storePageTitle= By.cssSelector(".woocommerce-products-header__title.page-title");
    private final By viewCart = By.cssSelector("a[title='View cart']");

    public StorePage(WebDriver driver) {
        super(driver);
    }
    public void enterSearchText(String searchText){
        driver.findElement(searchField).sendKeys(searchText);
    }
    public void clickOnSearchButton(){
        driver.findElement(searchBtn).click();
    }
    public String getTitle(){
        return driver.findElement(storePageTitle).getText();
    }
    private By getAddToCartBtn(String productName){
        return By.cssSelector("a[aria-label='Add “"+productName+"” to your cart']");
    }
    public void clickOnAddToCart(String productName){
        By addToCart = getAddToCartBtn(productName);
        driver.findElement(addToCart).click();

    }
    public void clickOnViewCartBtn(){
        driver.findElement(viewCart).click();
    }
}
