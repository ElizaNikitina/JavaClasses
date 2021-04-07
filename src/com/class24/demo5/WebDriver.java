package com.class24.demo5;

public class WebDriver {
    void openWebsite(){
        System.out.println("opening the website");
    }
    void closeWebsite(){
        System.out.println("opening the website");
    }
    void loginWebsite(){
        System.out.println("opening the website");
    }
    void signupWebsite(){
        System.out.println("opening the website");
    }
    void downloadAFileFromWebsite(){
        System.out.println("opening the website");
    }

}

class GoogleChrome extends WebDriver{
    void openWebsite(){
        System.out.println("opening the website in Google Chrome");
    }
    void closeWebsite(){
        System.out.println("opening the website Google Chrome");
    }
    void loginWebsite(){
        System.out.println("opening the website Google Chrome");
    }
    void signupWebsite(){
        System.out.println("opening the website Google Chrome");
    }
    void downloadAFileFromWebsite(){
        System.out.println("opening the website Google Chrome");
    }
}

class  FireFox extends WebDriver{
    void openWebsite(){
        System.out.println("opening the website in FireFox");
    }
    void closeWebsite(){
        System.out.println("opening the website FireFox");
    }
    void loginWebsite(){
        System.out.println("opening the website FireFox");
    }
    void signupWebsite(){
        System.out.println("opening the website FireFox");
    }
    void downloadAFileFromWebsite(){
        System.out.println("opening the website FireFox");
    }
}
