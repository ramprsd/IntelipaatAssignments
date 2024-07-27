package org.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Module4SearchingElementXPath {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Aaa");
        driver.findElement(By.name("lastname")).sendKeys("Bbb");
        driver.findElement(By.name("reg_email__")).sendKeys("AaaBbb@mail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("AaaBbb@mail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Apassword");

        WebElement bDay = driver.findElement(By.name("birthday_day"));
        Select date = new Select(bDay);
        date.selectByValue("2");

        WebElement bMon = driver.findElement(By.name("birthday_month"));
        Select mon = new Select(bMon);
        mon.selectByIndex(1);

        WebElement bYear = driver.findElement(By.name("birthday_year"));
        Select year = new Select(bYear);
        year.selectByVisibleText("2000");

        driver.findElement(By.xpath("//label[text()='Male']")).click();
        driver.findElement(By.name("websubmit")).click();

    }

}
