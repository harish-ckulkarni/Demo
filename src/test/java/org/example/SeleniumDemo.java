package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {



    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/account/about/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@class='h-c-header__cta-li-link h-c-header__cta-li-link--secondary button-standard-mobile']")).click();
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Harish");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kulkarni");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("HarishPhonePe2016");
        driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Phonepe@1234");
        driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("Phonepe@1234");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();

    }
}













