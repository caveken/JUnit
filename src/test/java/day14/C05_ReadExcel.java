package day14;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05_ReadExcel {
    @Test
    public void readExcelTest1() throws IOException {
        //-Dosya yolunu bir String degiskene atayalim
        String dosyaYolu = "src/resources/ulkeler.xlsx";
        //-FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fis=new FileInputStream(dosyaYolu);
        //-Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        Workbook workbook= WorkbookFactory.create(fis);
        //-WorkbookFactory.create(fileInputStream)
        //-sayfa 2'ye gidip satir sayisinin 6, kullanilan satir sayisinin ise 3 oldugunu test edin
        int sonSatir=workbook.getSheet("Sayfa2").getLastRowNum();
        System.out.println(sonSatir);
        int expectedLastRow=6;
        Assert.assertEquals(expectedLastRow,sonSatir+1);
        int kullanilanStir=workbook.getSheet("Sayfa2").getPhysicalNumberOfRows();
        int expectedSatir=4;
        Assert.assertEquals(expectedSatir,kullanilanStir);


    }
}
