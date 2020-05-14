package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class day1 {

    @Test
    public void openFireFox(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\青小果6\\fireFoxDriver\\geckodriver.exe");
        System.setProperty("webdriver,firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        WebDriver webDriver = new FirefoxDriver();
    }

    @Test
    public void openFF2(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\青小果6\\fireFoxDriver\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
    }

    @Test
    public void openChrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\青小果6\\fireFoxDriver\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
    }

    @Test
    public void openIE(){
        System.setProperty("webdriver.ie.driver","C:\\Users\\青小果6\\fireFoxDriver\\IEDriverServer.exe");
        WebDriver webDriver=new InternetExplorerDriver();
    }

    @Test
    public void openEdge(){
        System.setProperty("webdriver.edge.driver","C:\\Users\\青小果6\\fireFoxDriver\\msedgedriver.exe");
        WebDriver wendriver=new EdgeDriver();
    }
}
