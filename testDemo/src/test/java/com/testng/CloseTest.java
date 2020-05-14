package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseTest {
    @Test
    public void openChrome() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\青小果6\\fireFoxDriver\\chromedriver.exe");
        WebDriver webdriver=new ChromeDriver();
        Thread.sleep(5000);
        webdriver.close();
    }
    @Test
    public void openChrome1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\青小果6\\fireFoxDriver\\chromedriver.exe");
        WebDriver webdriver=new ChromeDriver();
        Thread.sleep(5000);
        webdriver.quit();
    }
}
