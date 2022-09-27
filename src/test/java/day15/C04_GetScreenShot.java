package day15;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBaseBeforeAfter;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_GetScreenShot extends TestBaseBeforeAfter {
    @Test
    public void test1() throws IOException {
        driver.get("https://amazon.com");
        TakesScreenshot ts=(TakesScreenshot) driver;


        File tumSyfaResmi=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(tumSyfaResmi,new File("target/ekranGoruntusu/AllPage"+tarih+".jpeg"));
    }
}
