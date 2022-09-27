package day13;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

import java.util.List;
import java.util.Set;

public class C01_cookies extends TestBaseBeforeAfter {
    @Test
    public void test1() {
        //1-Amazon anasayfaya gidin
        driver.get("https://amazon.com");
        //-tum cookie’leri listeleyin
        Set<Cookie> allCookie = driver.manage().getCookies();
        System.out.println(allCookie);
        int sayac = 1;
        for (Cookie w:allCookie) {
            System.out.println(sayac+". cookie : "+w);
            System.out.println(sayac+". name : "+w.getName());
            System.out.println(sayac+". value : "+w.getValue());
            sayac++;
        }
        //3-Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        int cookieSayisi = allCookie.size();
        Assert.assertTrue(cookieSayisi>5);
        //4-ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
        for (Cookie w:allCookie) {
            if (w.getName().equals("i18n-prefs")){
                Assert.assertEquals("USD",w.getValue());
            }
        }
        //5-ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie  olusturun ve sayfaya ekleyin
        Cookie yeniCookie = new Cookie("en sevdigim cookie","cikolatali");
        driver.manage().addCookie(yeniCookie);
        allCookie = driver.manage().getCookies();
        sayac = 1;
        for (Cookie w:allCookie) {
            System.out.println(sayac+". cookie : "+w);
            System.out.println(sayac+". name : "+w.getName());
            System.out.println(sayac+". value : "+w.getValue());
            sayac++;
        }
        //6-eklediginiz cookie’nin sayfaya eklendigini test edin
        Assert.assertTrue(allCookie.contains(yeniCookie));
        //7-ismi skin olan cookie’yi silin ve silindigini test edin
        driver.manage().deleteCookieNamed("skin");



                allCookie = driver.manage().getCookies();
        sayac = 1;
        for (Cookie w:allCookie) {
            System.out.println(sayac+". cookie : "+w);
            System.out.println(sayac+". name : "+w.getName());
            System.out.println(sayac+". value : "+w.getValue());
            sayac++;
        }
        Assert.assertFalse(allCookie.contains("skin"));
        //8-tum cookie’leri silin ve silindigini test edin
        driver.manage().deleteAllCookies();
        allCookie = driver.manage().getCookies();
        Assert.assertTrue(allCookie.isEmpty());


    }

}
