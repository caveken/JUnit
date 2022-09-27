package day13;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

import java.util.List;

public class C03_WebTables extends TestBaseBeforeAfter {
    @Test
    public void test1() {

        //Bir önceki class'daki adrese gidelim
        driver.get("https://www.hotelmycamp.com/admin/HotelRoomAdmin");

        //Login() methodunu kullanarak sayfaya giriş yapalım
        login();

    }

    private void login() {

        Actions actions=new Actions(driver);
        WebElement userName=driver.findElement(By.xpath("//*[@id='UserName']"));
        actions.click(userName).
                sendKeys("manager").
                sendKeys(Keys.TAB).
                sendKeys("Manager1!").
                sendKeys(Keys.ENTER).perform();
        //input olarak verilen satır sayısı ve sutun sayısına sahip cell'deki text'i yazdıralım

        int satir = 3;
        int sutun = 4;

        System.out.println(driver.findElement(By.xpath("//tbody//tr[3]//td[4]")).getText());

        List<WebElement> priceBasligi=driver.findElements(By.xpath("//tbody//tr//td[6]"));
        for (WebElement e:priceBasligi) {
            System.out.println(e.getText());

        }


    }
}

