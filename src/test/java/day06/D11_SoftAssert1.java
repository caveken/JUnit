package day06;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBaseBeforeAfter;

public class D11_SoftAssert1 extends TestBaseBeforeAfter {
    @Test
    public void name() throws InterruptedException {

    //    Yeni bir Class Olusturun : D11_SoftAssert1
        //1. “https:// hepsiburada .com/” Adresine gidin
        driver.get("https://hepsiburada.com");

        //2. Basliginin “ Turkiye’nin En Buyuk Alisveris Sitesi " icerdigini dogrulayin
        Assert.assertFalse(driver.getTitle().contains("Turkiye’nin En Buyuk Alisveris Sitesi"));
        //3. search kutusuna araba yazip arattirin
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("araba", Keys.ENTER);
        Thread.sleep(3000);
        //4. bulunan sonuc sayisini yazdirin
        System.out.println(driver.findElement(By.cssSelector("b[class='searchResultSummaryBar-AVnHBWRNB0_veFy34hco']")).getText());
        //5. sonuc yazisinin "araba" icerdigini dogrulayin
        String expectedText="araba";
        String actualText=driver.findElement(By.xpath("(//*[@class='searchResultSummaryBar-AVnHBWRNB0_veFy34hco'])[1]")).getText();
        Assert.assertTrue(expectedText.equals(actualText));
        //6. Sonuc yazisinin “oto” kelimesi icermedigini dogrulayin
        Assert.assertFalse(driver.findElement(By.xpath("//div[@class='searchResultSummaryBar-CbyZhv5896ASVcYBLKmx']")).getText().contains("oto"));

}}
