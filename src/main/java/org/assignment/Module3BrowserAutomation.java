package org.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;

public class Module3BrowserAutomation {

    public static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        Module3BrowserAutomation.browserInvocation();

        Module3BrowserAutomation.clickKnowMore();

    }
    private static void browserInvocation() {


//            driver = new EdgeDriver();
//            driver = new FirefoxDriver();
        driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

    }

    private static void clickKnowMore(){

        driver.switchTo().frame("login_page");
        driver.findElement(By.partialLinkText("Know")).click();

        ArrayList<String> wh= new ArrayList<String>(driver.getWindowHandles());

        System.out.println(wh);

        driver.switchTo().window(wh.get(1));
        System.out.println(driver.getTitle());

        driver.switchTo().window(wh.get(0));
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
