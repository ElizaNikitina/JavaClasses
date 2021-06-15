package com.utils;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {


    public static WebDriver driver;

    public static void setUp(){

        ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        switch (ConfigsReader.getProperty("browser").toLowerCase()){

            case "chrome":
                System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
                driver = new ChromeDriver();
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
                driver = new FirefoxDriver();
                break;

            case "msedge":
                System.setProperty("webdriver.edge.driver", Constants.MSEDGE_DRIVER_PATH);
                driver = new EdgeDriver();
                break;
            default:
                throw  new RuntimeException("Browser is not supported");
        }

        driver.get(ConfigsReader.getProperty("url"));
    }

    public static void tearDown(){

        if(driver!=null){
            driver.quit();
        }
    }
}
