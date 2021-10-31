package pom;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pom.base.BaseTest;

public class SeleniumTest extends BaseTest {

    @Test
    public void guestCheckoutDirectTransfer() throws InterruptedException {

        driver.get("https://askomdch.com");
        driver.findElement(By.cssSelector("#menu-item-1227")).click();
        driver.findElement(By.id("woocommerce-product-search-field-0")).sendKeys("Blue");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[value='Search']")).click();
        Thread.sleep(2000);
        Assert.assertEquals
                (driver.findElement(By.cssSelector(".woocommerce-products-header__title.page-title")).getText(),"Search results: “Blue”");
        driver.findElement(By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[title='View cart']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".checkout-button")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath("//h1")).getText(),"Checkout");
        driver.findElement(By.cssSelector("#billing_first_name")).sendKeys("testFirstName");
        driver.findElement(By.cssSelector("#billing_last_name")).sendKeys("testLastName");
        driver.findElement(By.cssSelector("#billing_address_1")).sendKeys("Talegaon, Pune");
        driver.findElement(By.cssSelector("#billing_city")).sendKeys("Tinseltown");
        driver.findElement(By.id("billing_postcode")).sendKeys("90011");
        driver.findElement(By.id("billing_email")).sendKeys("x@yz.com");
        driver.findElement(By.id("place_order")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.cssSelector(".woocommerce-notice")).getText(),
                "Thank you. Your order has been received.");
    }
    @Test
    public void loginAndCheckoutDirectTransfer() throws InterruptedException {

        driver.get("https://askomdch.com");
        driver.findElement(By.cssSelector("#menu-item-1227")).click();
        driver.findElement(By.id("woocommerce-product-search-field-0")).sendKeys("Blue");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[value='Search']")).click();
        Thread.sleep(2000);
        Assert.assertEquals
                (driver.findElement(By.cssSelector(".woocommerce-products-header__title.page-title")).getText(),"Search results: “Blue”");
        driver.findElement(By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[title='View cart']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".checkout-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".showlogin")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#username")).sendKeys("abdemo1");
        driver.findElement(By.cssSelector("#password")).sendKeys("Password-1");
        driver.findElement(By.cssSelector("button[value='Login']")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.findElement(By.xpath("//h1")).getText(),"Checkout");
        driver.findElement(By.cssSelector("#billing_first_name")).sendKeys("testFirstName");
        driver.findElement(By.cssSelector("#billing_last_name")).sendKeys("testLastName");
        driver.findElement(By.cssSelector("#billing_address_1")).sendKeys("Talegaon, Pune");
        driver.findElement(By.cssSelector("#billing_city")).sendKeys("Tinseltown");
        driver.findElement(By.id("billing_postcode")).sendKeys("90011");
        driver.findElement(By.id("billing_email")).clear();
        driver.findElement(By.id("billing_email")).sendKeys("abdemo1@xyz.com");
        driver.findElement(By.id("place_order")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.cssSelector(".woocommerce-notice")).getText(),
                "Thank you. Your order has been received.");
    }
}
