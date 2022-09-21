package day11;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBaseBeforeAfter;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C04_FileExists  {
    @Test
    public void test1() {
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        String dosyaYolu="C:\\Users\\cavid\\Desktop\\Yeni Metin Belgesi.txt";
        System.out.println(Files.exists(Paths.get(dosyaYolu)));
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

        // bir web sitesinden indirdiğimiz yada windows içinde oluşturduğumuz dosyanın indiğini yada
        // orda olduğunu test edebilmem için o dosyanın üzerine shift tuşuna basılı olarak sağ click
        // yapıp dosyanın yolunu kopyalayıp bir String değişkene atarız ve dosyayı doğrulamak için
        // Assert.assertTrue(Files.exists(Paths.get(dosyaYolu))); bu methodu kullanirim




    }
}
