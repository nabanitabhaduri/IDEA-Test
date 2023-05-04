package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.out;

public class googlesearch
{
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","/home/idiosys-0024/Downloads/chromedriver_linux64 (1)/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Flower");
        driver.findElement(By.name("btnK")).submit();
        WebElement FirstDiv = driver.findElement(By.id("rcnt"));
        //System.out.println();(FirstDiv.getClass());
        driver.findElement(new By.ByClassName("TbwUpd NJjxre")).click();

    }
}
