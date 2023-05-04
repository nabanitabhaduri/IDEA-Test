package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class helloworld_test
{
    public static void main(String[] args) {
        try {
            System.setProperty("webdriver.chrome.driver", "/home/idiosys-0024/Downloads/chromedriver_linux64 (1)/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://fakoapp.com/login");

            WebElement username = driver.findElement(By.name("email"));
            username.clear();
            username.sendKeys("naba6@mailinator.com");

            WebElement password = driver.findElement(By.name("password"));
            password.clear();
            password.sendKeys("123456");

            //driver.wait(1000*10);

            WebElement login = driver.findElement(By.id("login-form"));
            login.submit();

//            WebElement hoverable = driver.findElement(By.className("dropdown"));//           System.out.println(hoverable.getText());
//            new Actions(driver)
//                    .moveToElement(hoverable)
//                    .perform();

            //          List<WebElement> logout = driver.findElements(By.tagName("a"));
//            for (WebElement element : logout) {
//                System.out.println("Paragraph text:" + element.getText());
//            }
        //    System.out.println("logout:" + logout.get(0).getText());

//            logout.click();
            //driver.close();
            //driver.quit();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
