package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.base.BasePage;

public class LoginPage extends BasePage {
    private final By userName = By.cssSelector("#username");
    private final By password = By.cssSelector("#password");
    private final By loginBtn = By.cssSelector("button[value='Login']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void enterUserName(String username){
        driver.findElement(userName).sendKeys(username);//abdemo1
    }
    public void enterPassword(String passwordtxt){
        driver.findElement(password).sendKeys(passwordtxt);//Password-1
    }
    public void login(){
        driver.findElement(loginBtn).click();
    }
}
