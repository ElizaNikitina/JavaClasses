package com.class32ExcelReading;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginToHrms {
    public  static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {

        String filePath=System.getProperty("user.dir")+"/config/homeWork.properties";
        FileInputStream fis=new FileInputStream(filePath);

        Properties prop=new Properties();
        prop.load(fis);
        String browser=prop.getProperty("browser");

       // WebDriver driver = new ChromeDriver();
       // WebDriver driver=null; Local variable has to be initialize

        switch(browser.toLowerCase()) {

            case "chrome":
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
                driver=new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
                driver = new FirefoxDriver();
                break;
        }

        driver.get(prop.getProperty("url"));
        Thread.sleep(3000);

        driver.close();
    }
}