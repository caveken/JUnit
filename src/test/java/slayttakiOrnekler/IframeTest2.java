package slayttakiOrnekler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.T;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

import java.time.Duration;
import java.util.List;

public class IframeTest2 extends TestBaseBeforeAfter {
    /*
    ●Bir class olusturun: IframeTest 02
     */
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void test() throws InterruptedException {
        //1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/");

        //2) sayfadaki iframe sayısını bulunuz.
        List<WebElement> frameList = driver.findElements(By.xpath("//iframe"));
        System.out.println("frameList.size() = " + frameList.size());

        //3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        driver.switchTo().frame(1);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@aria-label='Oynat']")).click();

        //4) ilk iframe'den çıkıp ana sayfaya dönünüz
        driver.switchTo().parentFrame();
    }

    @Test
    public void test2() {

    //5) ikinci iframe'deki (Jmeter Made Easy) linke (https://www.guru99.com/live selenium project.html) tıklayınız
        //parent frame'e geri dönemiyor
        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.switchTo().frame(2);

        //WebElement jMeter = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
        //JavascriptExecutor jse = (JavascriptExecutor) driver;
        //jse.executeScript("arguments[0].scrollIntoView(true);",jMeter);
        //Carrers butonuna js ile click yapalım
        //jse.executeScript("arguments[0].click();",jMeter);
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//img[@src='Jmeter720.png']"))).click().perform();
        driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();

        driver.findElement(By.xpath("(//img[@class='custom-logo'])[2]")).click();
    }
}
