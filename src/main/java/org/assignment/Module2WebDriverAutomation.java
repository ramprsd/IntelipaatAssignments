package org.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Module2WebDriverAutomation {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        Module2WebDriverAutomation.browserInvocation();
    }

    public static void browserInvocation() throws InterruptedException {

        driver = new ChromeDriver();
//        driver = new EdgeDriver();
//        driver = new FirefoxDriver();
        driver.navigate().to("https://www.google.co.in/");
        Thread.sleep(5000);

        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
