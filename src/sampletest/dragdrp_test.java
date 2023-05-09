package sampletest;

import java.awt.Dimension;

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

import java.sql.Date;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.util.List;

import java.util.ListIterator;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;


public class dragdrp_test {

    public static void main(String[] args) throws InterruptedException, IOException {

        DateFormat dfor = new SimpleDateFormat("dd/MM/yy HH:mm:ss");

        Calendar obj = Calendar.getInstance();

        String date = dfor.format(obj.getTime());

        date = date.replaceAll("/", "_");

        date = date.replaceAll(" ", "_");

        date = date.replaceAll(":", "_");

        System.out.println(date);

        System.setProperty("webdriver.chrome.driver","/home/idiosys-0024/Downloads/chromedriver_linux64 (1)/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/droppable/");

//Thread.sleep(10000);

//WebElement on which drag and drop operation needs to be performed

        WebElement from = driver.findElement(By.id("draggable"));

//WebElement to which the above object is dropped

        WebElement to = driver.findElement(By.id("droppable"));

//Creating object of Actions class to build composite actions

        Actions act = new Actions(driver);

//Performing the drag and drop action

        act.dragAndDrop(from, to).build().perform();

    }
}