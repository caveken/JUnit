package day07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBaseBeforeAfter;

public class DependsOnTest extends TestBaseBeforeAfter {
    @Test
    public void test1() throws InterruptedException {

        //  bir class oluşturun: D ependsOnTest
        //  https://www. amazon . adresine gidin.
        driver.get("https://www.amazon.com");
        //. Test : Amazon ana sayfaya gittiginizi test edin
        Assert.assertTrue(driver.getCurrentUrl().contains("amazon"));
        //. Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin arama yapin ve aramanizin gerceklestigini Test
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella", Keys.ENTER);
        //. Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin $16.83 oldugunu test edin
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@class='a-section aok-relative s-image-square-aspect'])[1]")).click();


    }
}
