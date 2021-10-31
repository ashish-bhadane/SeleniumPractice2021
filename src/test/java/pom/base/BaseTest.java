package pom.base;

import pom.factory.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new DriverManager().initializeDriver();
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
