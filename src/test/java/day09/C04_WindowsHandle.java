package day09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class C04_WindowsHandle {
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
        //driver.close();
    }

    @Test
    public void test1() throws InterruptedException {
            //https://the-internet.herokuapp.com/windows adresine gidin.
            driver.get("https://the-internet.herokuapp.com/windows");
            //Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
            Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Opening a new window']")).isDisplayed());
            //Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
            Assert.assertTrue(driver.getTitle().contains("The Internet"));
            Thread.sleep(1500);
            //Click Here butonuna basın.
            driver.findElement(By.xpath("//*[text()='Click Here']")).click();
            List<String> windowList = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(windowList.get(1));

        /*
        Set<String> windowHandleseti= driver.getWindowHandles();
        System.out.println(windowHandleseti);
        String ikinciSayfaWindowHandleDegeri="";
        for (String each: windowHandleseti) {
            if (!each.equals(ilkSayfaWindowHandleDegeri)){
                ikinciSayfaWindowHandleDegeri=each;
            }
        }
         */

            //Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
            String newHandle=driver.getWindowHandle();
            Thread.sleep(1500);
            Assert.assertEquals(driver.getTitle(),"New Window");
            //Sayfadaki textin “New Window” olduğunu doğrulayın.
            Assert.assertEquals(driver.findElement(By.xpath("//h3")).getText(),"New Window");
            //Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu  doğrulayın.
            driver.switchTo().window(windowList.get(0));
            Assert.assertEquals(driver.getTitle(),"The Internet");


    }
}
