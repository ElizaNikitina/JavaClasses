package com.class24.demo5;

public class WebsiteTester {
    public static void main(String[] args) {
        WebDriver webDriver=new FireFox();
        webDriver.openWebsite();
        webDriver.signupWebsite();
        webDriver.downloadAFileFromWebsite();
        webDriver.closeWebsite();

       /* WebDriver[] webDriverArray={new GoogleChrome(),new FireFox()};
        for (WebDriver webdriver:webDriverArray
             )    {
            webdriver.openWebsite();
            webdriver.signupWebsite();
            webdriver.downloadAFileFromWebsite();
            webdriver.closeWebsite();

        }*/









       /* FireFox fireFox=new FireFox();
        fireFox.openWebsite();
        fireFox.signupWebsite();
        fireFox.downloadAFileFromWebsite();
        fireFox.closeWebsite();

        GoogleChrome googleChrome=new GoogleChrome();
        googleChrome.openWebsite();
        googleChrome.signupWebsite();
        googleChrome.downloadAFileFromWebsite();
        googleChrome.closeWebsite();*/

    }
}
