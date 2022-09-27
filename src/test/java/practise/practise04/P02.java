package practise.practise04;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBaseBeforeAfter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class P02 extends TestBaseBeforeAfter {
    @Test
    public void test() throws FileNotFoundException {
        //Verify that we have pom.xml file in our project => please try in 4 min s
        String dosyaYolu="C:\\Users\\cavid\\IdeaProjects\\com.Batch81JUnit\\pom.xml";
        FileInputStream fis = new FileInputStream(dosyaYolu);

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

    }
}
