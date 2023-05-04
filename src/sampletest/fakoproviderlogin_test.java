package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fakoproviderlogin_test
{
    public static void main(String[] args) {
        try{
            System.setProperty("webdriver.chrome.driver","/home/idiosys-0024/Downloads/chromedriver_linux64 (1)/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://fakoapp.com/provider/login");

            WebElement providername = driver.findElement(By.name("email"));
            providername.sendKeys("naba1@mailinator.com");

            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("123456");

            WebElement login = driver.findElement(By.className("login"));
            //login.clear();
            login.click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


