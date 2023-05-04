package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin{

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","/home/idiosys-0024/Downloads/chromedriver_linux64 (1)/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("nabanitabhaduri7059@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("1234");
        //driver.findElement(By.name("login"));
        WebElement login = driver.findElement(By.name("login"));
        login.submit();
    }
}
