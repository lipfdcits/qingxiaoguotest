package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BrowserActions {
    WebDriver webdriver;


    /**
     * 打开百度，等待5秒，然后关闭浏览器
     */
    @Test
    public void actions() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\青小果6\\fireFoxDriver\\chromedriver.exe");
        webdriver = new ChromeDriver();
        webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webdriver.get("https://www.baidu.com");

        webdriver.quit();
    }

    @Test
    public void openFireFox() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\青小果6\\fireFoxDriver\\geckodriver.exe");
        webdriver = new FirefoxDriver();
        webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webdriver.get("https://www.baidu.com");

        webdriver.quit();
    }

    @Test
    public void openIE() throws InterruptedException {
        System.setProperty("webdriver.ie.driver", "C:\\Users\\青小果6\\fireFoxDriver\\IEDriverServer.exe");
        webdriver = new InternetExplorerDriver();
        webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webdriver.get("https://www.baidu.com");

        webdriver.quit();
    }

    @Test
    public void openEdge() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\青小果6\\fireFoxDriver\\msedgedriver.exe");
        webdriver = new EdgeDriver();
        webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webdriver.get("https://www.baidu.com");

        webdriver.quit();
    }


}
