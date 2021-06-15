//package com.class25INTERFACE.Task;
//
//public interface Webdriver {
//
//    void openBrowser();
//    void closeBrowser();
//    void maximizeWindow();
//    void findElement();
//
//    String getTitle();
//
//}
//
//interface TakeScreenshot{
//    void takePicture();
//
//    static void takeSelfie(){
//        System.out.println("I can take a selfie");
//    }
//
//    default void takePanorama(){
//        System.out.println("I can take a panorama picture");
//    }
//
//}
//
//class ChromeDriver implements Webdriver, TakeScreenshot{
//
//    @Override
//    public void openBrowser() {
//        System.out.println("Chrome to open browser use method .navigate() or .get()");
//    }
//
//    @Override
//    public void closeBrowser() {
//        System.out.println("Chrome to close browser use method .close() or .quit()");
//    }
//
//    @Override
//    public void maximizeWindow() {
//        System.out.println("Chrome to maximize window use method .manage().window().fullscreen()");
//    }
//
//    @Override
//    public void findElement() {
//        System.out.println("Chrome to find element use any locator");
//    }
//
//    @Override
//    public String getTitle() {
//        String getTitle = "Chrome";
//        return getTitle;
//    }
//
//    @Override
//    public void takePicture() {
//        System.out.println("Use TakeScreenshot interface");
//    }
//}
//
//class FirefoxDriver implements Webdriver{
//
//    @Override
//    public void openBrowser() {
//        System.out.println("Firefox to open browser use method .navigate() or .get()");
//    }
//
//    @Override
//    public void closeBrowser() {
//        System.out.println("Firefox to close browser use method .close() or .quit()");
//    }
//
//    @Override
//    public void maximizeWindow() {
//        System.out.println("Firefox to maximize window use method .manage().window().fullscreen()");
//    }
//
//    @Override
//    public void findElement() {
//        System.out.println("Firefox to find element use any locator");
//    }
//
//    @Override
//    public String getTitle() {
//        String getTitle = "Firefox";
//        return getTitle;
//    }
//}
//
// class Test{
//     public static void main(String[] args) {
//         Webdriver []  browserArray = {new ChromeDriver(), new FirefoxDriver()};
//
//         for(Webdriver browser: browserArray){
//             browser.openBrowser();
//             browser.openBrowser();
//             browser.findElement();
//             browser.getTitle();
//             browser.maximizeWindow();
//             System.out.println("---------");
//         }
//     }
//
//}
