package slayttakiOrnekler;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.TestBaseBeforeAfter;

import java.util.ArrayList;
import java.util.List;

public class C03_SoftAssert extends TestBaseBeforeAfter {
    @Test
    public void test1() throws InterruptedException {
        /*
        Yeni bir Class Olusturun : C03_SoftAssert
        1. “http://zero.webappsecurity.com/” Adresine gidin
        2. Sign in butonuna basin
        3. Login kutusuna “username” yazin
        4. Password kutusuna “password” yazin
        5. Sign in tusuna basin
        6. Online banking menusu icinde Pay Bills sayfasina gidin
        7. “Purchase Foreign Currency” tusuna basin
        8. “Currency” drop down menusunden Eurozone’u secin
        9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
        10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
        "Select One"One", "Australia ( dollar)", "Canada ( dollar)",,"Switzerland ( franc)",,"China
                ( yuan)",,"Denmark ( krone)",,"Eurozone ( euro)",,"Great Britain ( pound)",,"Hong Kong
        ( dollar)",,"Japan ( yen)",,"Mexico ( peso)",,"Norway ( krone)",,"New Zealand
        ( dollar)",,"Sweden ( krona)",,"Singapore ( dollar)",,"Thailand (
        */
        driver.get("http://zero.webappsecurity.com/");
        driver.findElement(By.xpath("//*[@id='signin_button']")).click();
        driver.findElement(By.cssSelector("input[id='user_login']")).sendKeys("can");
        driver.findElement(By.cssSelector("input[id='user_password']")).sendKeys("cancan");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
        Thread.sleep(3000);














    }
}
