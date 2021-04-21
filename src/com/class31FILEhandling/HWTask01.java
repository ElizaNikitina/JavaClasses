package com.class31FILEhandling;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class HWTask01 {
    //login in facebook using properties file

    public static void main(String[] args) throws IOException, InterruptedException {

        String filePath = "/Users/Eliza/Desktop/IntelllijIDEA/JavaClasses/src/configs/task.properties";
        FileInputStream fis = new FileInputStream(filePath);

        Properties prop = new Properties();
        prop.load(fis);

        String browser = prop.getProperty("browser");
        String url = prop.getProperty("url");
        String userName = prop.getProperty("userName");
        String password = prop.getProperty("password");
        String firstName = prop.getProperty("firstName");
        String lasName = prop.getProperty("lastName");
        String email = prop.getProperty("email");

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();

        driver.switchTo().activeElement();
        driver.findElement(By.xpath("//div[@class='_n3']"));

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstName);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lasName);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(email);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(email);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(password);
        Thread.sleep(3000);


    }
}
