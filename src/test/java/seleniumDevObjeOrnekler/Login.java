package seleniumDevObjeOrnekler;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.tagName;

/***
 * Tests login feature
 */
public class Login {

    public void testLogin() {
        // fill login data on sign-in page

        WebDriver driver = null;
        driver.findElement(By.name("user_name")).sendKeys("userName");
        driver.findElement(By.name("password")).sendKeys("my supersecret password");
        driver.findElement(By.name("sign-in")).click();

        // verify h1 tag is "Hello userName" after login
        driver.findElement(tagName("h1")).isDisplayed();
        Assert.assertEquals(driver.findElement(tagName("h1")).getText(),("Hello userName"));
    }
}