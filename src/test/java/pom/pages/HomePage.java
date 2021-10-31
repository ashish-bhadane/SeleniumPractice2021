package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.base.BasePage;

public class HomePage extends BasePage {
    private final By storeMenuLink = By.cssSelector("#menu-item-1227");

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void clickStoreLink(){
        driver.findElement(storeMenuLink).click();
    }

}
