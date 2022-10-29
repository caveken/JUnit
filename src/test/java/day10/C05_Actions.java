package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

import javax.swing.*;
import java.awt.*;

public class C05_Actions extends TestBaseBeforeAfter {
    @Test
    public void test1() throws InterruptedException {
        /*
        * Yeni bir class olusturalim: MouseActions2
        https://demoqa.com/droppable adresine gidelim
        “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
        “Drop here” yazisi yerine “Dropped!” oldugunu test edin

         */
        driver.get("https://demoqa.com/droppable");
        WebElement dragMe=driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement dropHere=driver.findElement(By.xpath("(//*[@id='droppable'])[1]"));
        Actions actions=new Actions(driver);// tasıma oldugu için actions clası cagrılır istenirse parent clasa da konabilir
        actions.dragAndDrop(dragMe,dropHere).perform();// her actions komutundan sonra perform mutlaka
        Thread.sleep(1500);
        String actualDropped=driver.findElement(By.xpath("//*[text()='Dropped!']")).getText();
        String expectedDropped="Dropped!";
        Assert.assertEquals(expectedDropped,actualDropped);



    }



}
