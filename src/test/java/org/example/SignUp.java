package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUp {

    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

    driver.get("https://demo.automationtesting.in/Register.html");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Harish");
    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kulkarni");
    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("harish@phonepe.com");
    driver.findElement(By.xpath("(//input[@name='radiooptions'])[1]")).click();
    driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
    driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
    WebElement ele1=driver.findElement(By.id("Skills"));
    Select select1= new Select(ele1);
    select1.selectByVisibleText("Android");
    WebElement ele2=driver.findElement(By.id("yearbox"));
    Select select2=new Select(ele2);
    select2.selectByValue("1993");
    WebElement ele3=driver.findElement(By.className("form-control ng-dirty ng-valid-parse ng-valid ng-valid-required ng-touched"));
    Select select3=new Select(ele3);
    select3.selectByValue("June");
    WebElement ele4=driver.findElement(By.id("daybox"));
    Select select4=new Select(ele4);
    select4.selectByValue(("27"));
    driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Harish@1234");
    driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Harish@1234");
}

}
