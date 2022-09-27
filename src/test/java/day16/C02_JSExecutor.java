package day16;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

public class C02_JSExecutor extends TestBaseBeforeAfter {
    @Test
    public void test1() {
        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");
        //Aşağıdaki carrers butonunu görünceye kadar js ile scroll yapalım
        WebElement carrers = driver.findElement(By.xpath("//*[text()='Careers']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);",carrers);
        //Carrers butonuna js ile click yapalım
        jse.executeScript("arguments[0].click();",carrers);
        //amazon gibi profesyonel sitelerde actions ile yapılıp daha küçük siteler için
        // actions ile yapılamayan durumlarda kurtarıcıdır jse

        //Actions actions=new Actions(driver);
        //actions.moveToElement(careers).perform();
        //actions.click(careers).perform();

    }
}
