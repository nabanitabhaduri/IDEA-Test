package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class googlelogin {

    public static void main(String[] args) {
//      System.out.println("hello");
        System.setProperty("webdriver.chrome.driver","/home/idiosys-0024/Downloads/chromedriver_linux64 (1)/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.gmail.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("nabanitabhaduri7059@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
//        String at = driver.getTitle();
//        String et = "gamil";
//        driver.close();
//        if (at.equalsIgnoreCase(et))
//        {
//            System.out.println("Test Successfull");
//        }
//        else
//        {
//            System.out.println("Test Faliure");
//        }


    }
}
