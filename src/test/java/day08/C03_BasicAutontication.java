package day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_BasicAutontication {
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void tearDown() {
        driver.close();
    }
    /*
    *   Bir class olusturun : BasicAuthentication
        https://the-internet.herokuapp.com/basic_auth sayfasina gidin
        asagidaki yontem ve test datalarini kullanarak authentication’i yapin
        Html komutu : https://username:password@URL
        Username    : admin
        password    : admin
        Basarili sekilde sayfaya girildigini dogrulayin
        *
        *
        End user’lar icin tasarlanmayan uygulamalarda(Ornegin API
        sorgularinda) bu authentication HTML komutlari ile de yapilabilir.
        https://username:password@URL
        Bu authentication’i yapabilmek icin uygulama
        nin kullanicilara authentication’i nasil yapacagina dair
        bilgilendirme yapmis olmasi gerekir.
        Ornegin asagidaki uygulama icin authentication asagidaki gibi yapilabilir.

    * */

    @Test
    public void test1(){
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");//click yapmadan otomatik olarak autantication ı atlar
                                                                                //sonraki girislerde tekrar istemez
        Assert.assertTrue(driver.findElement(By.xpath("//h3")).isDisplayed());
    }
}
