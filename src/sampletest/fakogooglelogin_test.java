package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fakogooglelogin_test
{
    public static void main(String[] args) {
    try{
        System.setProperty("webdriver.chrome.driver","/home/idiosys-0024/Downloads/chromedriver_linux64 (1)/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fakoapp.com/login#");

 //       System.out.println("before");
          driver.findElement(By.className("btn-text")).click();

          //       Thread.sleep(1000*10);
//        identifierId
 //       System.out.println("after");
       // WebElement username = driver.findElement(By.className("whsOnd zHQkBf"));
       // username.sendKeys("naba5@mailinator.com");
//        driver.findElement(By.id("identifierId")).sendKeys("naba5@mailinator.com");
       // driver.findElement(By.id("V67aGc")).click();

    }catch (Exception e) {
        System.out.println(e);
    }

}
}
