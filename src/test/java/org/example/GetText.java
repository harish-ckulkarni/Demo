package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https:www.google.com");
        driver.manage().window().maximize();
        WebElement ele=driver.findElement(By.xpath("(//a[@class='gb_d'])[1]"));
        System.out.println("Title is:"  + ele.getText());
        driver.quit();
    }
}
