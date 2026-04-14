package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        ChromeOptions options = new ChromeOptions();
options.addArguments("--headless");                 // run without UI
options.addArguments("--no-sandbox");              // required in Linux/Jenkins
options.addArguments("--disable-dev-shm-usage");   // avoid memory issues

WebDriver driver = new ChromeDriver(options);
        
        driver.get("https://practicetestautomation.com/practice-test-login/");
        
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.findElement(By.id("username")).sendKeys("student");
        Thread.sleep(2000);
        
        driver.findElement(By.id("password")).sendKeys("Password123");
        Thread.sleep(2000);
        
        driver.findElement(By.id("submit")).click();
    }
}
