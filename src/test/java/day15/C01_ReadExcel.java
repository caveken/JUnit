package day15;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C01_ReadExcel {
    @Test
        public void readExcelTest1() throws IOException {
            //-Dosya yolunu bir String degiskene atayalim
            String dosyaYolu = "src/resources/ulkeler.xlsx";
            //-FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
            FileInputStream fis=new FileInputStream(dosyaYolu);
            //-Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
            Workbook workbook= WorkbookFactory.create(fis);
            String tablo;
            for (int i=0;i<workbook.getSheet("Sayfa1").getLastRowNum();i++){
                for (int j=0;j<workbook.getSheet("Sayfa1").getRow(i).getLastCellNum();j++){
                    String actualData=workbook.getSheet("Sayfa1")
                            .getRow(i)
                            .getCell(j)
                            .getStringCellValue();
                    System.out.print(actualData);

                }

            }


    }
}
