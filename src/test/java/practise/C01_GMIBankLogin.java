package practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_GMIBankLogin {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.gmibank.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("(//a[@class='dropdown-toggle nav-link'])[2]")).click();
        driver.findElement(By.xpath("(//*[text()='Sign in'])[1]")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Batch81");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Batch81+", Keys.ENTER);







        //driver.close();
    }



}
