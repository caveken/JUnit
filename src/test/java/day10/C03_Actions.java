package day10;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

import javax.swing.*;

public class C03_Actions extends TestBaseBeforeAfter {
    @Test
    public void test1(){
        // 1 Amazon sayfasina gidelim
        //2 Account menusunden create a list linkine tiklayalim
        driver.get("https://amazon.com");
        WebElement accountList=driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(accountList).perform();
        driver.findElement(By.xpath("//*[text()='Create a List']")).click();



    }

}
