package seleniumDevObjeOrnekler;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.bytebuddy.matcher.ElementMatchers.is;

/***
 * Tests login feature
 */
public class TestLogin {

    @Test
    public void testLogin() {
        WebDriver driver = null;
        SignInPage signInPage = new SignInPage(driver);
        HomePage homePage = signInPage.loginValidUser("userName", "password");
        Assert.assertTrue(homePage.getMessageText().equals("Hello userName"));
    }

}