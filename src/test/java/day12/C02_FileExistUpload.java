package day12;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

public class C02_FileExistUpload extends TestBaseBeforeAfter {

    @Test
    public void test1() {
        //https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");


        //chooseFile butonuna basalim
        WebElement dosyaSec = driver.findElement(By.xpath("//*[@id='file-upload']"));
        /*
        Dosyasec butonuna direk click yapamayabiliriz çünkü windows'a müdahaleye izin vermeyebilir
        Bu yüzden Dosyasec butonunu direk locate edip sendKeys() methodu ile string değişkene atadığımız dosya yolumuzu
        göndeririz.
         */
        //Yuklemek istediginiz dosyayi secelim.
        dosyaSec.sendKeys("C:\\Users\\cavid\\Desktop\\Yeni Metin Belgesi.txt");


        //Upload butonuna basalim.
        driver.findElement(By.cssSelector("#file-submit")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='panel text-center']")).isDisplayed());
    }
}
