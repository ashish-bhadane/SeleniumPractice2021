package pom;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pom.base.BaseTest;
import pom.pages.*;

public class SeleniumTest extends BaseTest {

    @Test
    public void guestCheckoutDirectTransfer() throws InterruptedException {

        driver.get("https://askomdch.com");
        HomePage homePage = new HomePage(driver);
        StorePage storePage = new StorePage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        homePage.clickStoreLink();
        Thread.sleep(2000);
        storePage.enterSearchText("blue");
        storePage.clickOnSearchButton();
        Assert.assertEquals(storePage.getTitle(),"Search results: “blue”");
        storePage.clickOnAddToCart("Blue Shoes");
        Thread.sleep(2000);
        storePage.clickOnViewCartBtn();
        Thread.sleep(2000);

        cartPage.clickCheckoutBtn();
        Thread.sleep(2000);

        Assert.assertEquals(checkoutPage.getheading(),"Checkout");
        checkoutPage.enterFirstName("TestFirstName");
        checkoutPage.enterLastName("TestLastName");
        checkoutPage.enterBillingAddress("Talegaon, Pune");
        checkoutPage.enterCity("Pune");
        checkoutPage.enterPostCode("90021");
        checkoutPage.enterEmail("abc@xyz.com");
        checkoutPage.clickPlaceorder();
        Thread.sleep(2000);
        Assert.assertEquals(checkoutPage.getSuccessMsg(), "Thank you. Your order has been received.");
    }
    @Test
    public void loginAndCheckoutDirectTransfer() throws InterruptedException {

        driver.get("https://askomdch.com");
        HomePage homePage = new HomePage(driver);
        StorePage storePage = new StorePage(driver);
        CartPage cartPage = new CartPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        homePage.clickStoreLink();
        Thread.sleep(2000);
        storePage.enterSearchText("blue");
        storePage.clickOnSearchButton();
        Assert.assertEquals(storePage.getTitle(),"Search results: “blue”");
        storePage.clickOnAddToCart("Blue Shoes");
        Thread.sleep(2000);
        storePage.clickOnViewCartBtn();
        Thread.sleep(2000);

        cartPage.clickCheckoutBtn();
        Thread.sleep(2000);

        cartPage.navigateToLogin();
        Thread.sleep(1000);

        loginPage.enterUserName("abdemo1");
        loginPage.enterPassword("Password-1");
        loginPage.login();
        Thread.sleep(1000);

        checkoutPage.enterFirstName("TestFirstName");
        checkoutPage.enterLastName("TestLastName");
        checkoutPage.enterBillingAddress("Talegaon, Pune");
        checkoutPage.enterCity("Pune");
        checkoutPage.enterPostCode("90021");
        checkoutPage.enterEmail("abdemo1@xyz.com");
        Thread.sleep(1000);
        checkoutPage.clickPlaceorder();
        Thread.sleep(3000);
        Assert.assertEquals(checkoutPage.getSuccessMsg(), "Thank you. Your order has been received.");
    }
}
