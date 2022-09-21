package day11;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBaseBeforeAfter;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C05_FileExists extends TestBaseBeforeAfter {
    @Test
    public void test1() {
        /*
1-Tests packagenin altina bir class oluşturalim : C04_FileDownload
2-Iki tane metod oluşturun : isExist( ) ve downloadTest( )
3-downloadTest ( ) metodunun icinde aşağıdaki testi yapalim:
4-https://the-internet.herokuapp.com/download adresine gidelim.
5-test.txt dosyasını indirelim
6-Ardından isExist( )  methodunda dosyanın başarıyla indirilip indirilmediğini test edelim
 */
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//*[text()='test.txt']")).click();
        String dosyaYolu="C:\\Users\\cavid\\Downloads\\test (3).txt";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
        System.out.println(Files.exists(Paths.get(dosyaYolu)));
    }
}
