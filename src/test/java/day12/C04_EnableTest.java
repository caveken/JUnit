package day12;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBaseBeforeAfter;

import java.time.Duration;

public class C04_EnableTest extends TestBaseBeforeAfter {
    @Test
    public void isEnabled() {
        /*
        Bir class olusturun : EnableTest
        Bir metod olusturun : isEnabled()
        https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        Textbox’in etkin olmadigini(enabled) dogrulayın
        Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
        “It’s enabled!” mesajinin goruntulendigini dogrulayın.
        Textbox’in etkin oldugunu(enabled) dogrulayın.
         */

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        Assert.assertFalse(driver.findElement(By.xpath("//*[@type='text']")).isEnabled());
        driver.findElement(By.xpath("(//*[@type='button'])[2]")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='text']")));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='message']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@type='text']")).isEnabled());

    }
}
