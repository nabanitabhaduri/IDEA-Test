package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class easybuy {
    public static void main(String[] args) {
        try {
            System.setProperty("webdriver.chrome.driver", "/home/idiosys-0024/Downloads/chromedriver_linux64 (1)/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://easybuy.idiosys.co.in");

           // driver.findElement(By.id("navbarDropdown")).click(); //Shop
           // driver.findElement(By.linkText("Contact Us")).click(); //Contact Us


            driver.findElement(By.className("login-section-wrap")).click(); // Login
           // Thread.sleep(1000*10);
          //  WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
           //         .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3"));

          //  WebElement search = driver.findElement(By.id("search_term_btn"));
           // search.sendKeys("test");


            // driver.findElement(By.className("abcRioButtonContentWrapper")).click();
          //  WebElement signinGoogle = driver.findElement(By.id("my-signin2"));

           // System.out.println(signinGoogle.isDisplayed());

        } catch (Exception e) {
            System.out.println(e);

        }


    }
}