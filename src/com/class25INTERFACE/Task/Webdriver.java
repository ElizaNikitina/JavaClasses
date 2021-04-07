package com.class25INTERFACE.Task;

public interface Webdriver {

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}

interface TakeScreenshot{
    void takePicture();

    static void takeSelfie(){
        System.out.println("I can take a selfie");
    }

    default void takePanorama(){
        System.out.println("I can take a panorama picture");
    }

}

class ChromeDriver implements Webdriver, TakeScreenshot{

    @Override
    public void openBrowser() {
        System.out.println("to open browser use method .navigate() or .get()");
    }

    @Override
    public void closeBrowser() {
        System.out.println("to close browser use method .close() or .quit()");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("to maximize window use method .manage().window().fullscreen()");
    }

    @Override
    public void findElement() {
        System.out.println("to find element use any locator");
    }

    @Override
    public void takePicture() {
        System.out.println("Use TakeScreenshot interface");
    }
}

class FirefoxDriver implements Webdriver{

    @Override
    public void openBrowser() {
        System.out.println("to open browser use method .navigate() or .get()");
    }

    @Override
    public void closeBrowser() {
        System.out.println("to close browser use method .close() or .quit()");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("to maximize window use method .manage().window().fullscreen()");
    }

    @Override
    public void findElement() {
        System.out.println("to find element use any locator");
    }
}
