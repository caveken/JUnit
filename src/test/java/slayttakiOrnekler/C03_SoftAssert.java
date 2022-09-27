package slayttakiOrnekler;

import com.github.javafaker.Faker;
import day09.C02_WindowHandle;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

import java.util.ArrayList;
import java.util.List;

public class C03_SoftAssert extends TestBaseBeforeAfter {
    @Test
    public void test1() throws InterruptedException {

       //Yeni bir Class Olusturun : C03_SoftAssert
       //1. “http://zero.webappsecurity.com/” Adresine gidin
        driver.get("http://zero.webappsecurity.com/");
        String webappsecurityWindowHandle= driver.getWindowHandle();

        //2. Sign in butonuna basin
        driver.findElement(By.xpath("//*[@id='signin_button']")).click();

        //3. Login kutusuna “username” yazin
        Actions actions=new Actions(driver);
        Faker faker=new Faker();
        String login=faker.name().firstName();
        driver.findElement(By.cssSelector("input[id='user_login']")).sendKeys(login);

        //4. Password kutusuna “password” yazin
        String password=faker.internet().password();
        driver.findElement(By.cssSelector("input[id='user_password']")).sendKeys(password, Keys.ENTER);
        Thread.sleep(3000);

        //5. Sign in tusuna basin
        //driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
        Thread.sleep(3000);

        //6. Online banking menusu icinde Pay Bills sayfasina gidin
        driver.switchTo().window(webappsecurityWindowHandle);
        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        driver.findElement(By.xpath("//*[@id='pay_bills_link']")).click();
       //7. “Purchase Foreign Currency” tusuna basin
        driver.findElement(By.linkText("Purchase Foreign Currency")).click();
       //8. “Currency” drop down menusunden Eurozone’u secin
       //9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
       //10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
       //"Select One"One", "Australia ( dollar)", "Canada ( dollar)",,"Switzerland ( franc)",,"China
       //        ( yuan)",,"Denmark ( krone)",,"Eurozone ( euro)",,"Great Britain ( pound)",,"Hong Kong
       //( dollar)",,"Japan ( yen)",,"Mexico ( peso)",,"Norway ( krone)",,"New Zealand
       //( dollar)",,"Sweden ( krona)",,"Singapore ( dollar)",,"Thailand (















    }
}
