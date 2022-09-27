package day16;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

import java.io.File;
import java.io.IOException;

public class C01_GetScreenShotWE extends TestBaseBeforeAfter {
    @Test
    public void test() throws IOException {
        driver.get("https://amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nuttella"+ Keys.ENTER);
        WebElement aramaSonucu=driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        File nutellaAramaSonucu=aramaSonucu.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(nutellaAramaSonucu,new File("target//ekranGoruntusuWE/WebESS.jpeg"));




    }
}
