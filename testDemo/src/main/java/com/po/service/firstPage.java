package com.po.service;

import com.po.page.element;
import com.po.page.firsePageElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class firstPage {

//    @BeforeTest
//    public void openBrowser(){
//
//
//    }

    @Test(dataProvider = "data1")
    public void login(String browser, String users,String pwds) throws InterruptedException, MalformedURLException {
        DesiredCapabilities dc=null;

        if (browser.equals("chrome")){
            dc=DesiredCapabilities.chrome();
        }else if(browser.equals("ie")){
            dc=DesiredCapabilities.internetExplorer();
        }else {
            System.out.println("输入错误");
        }

        WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.113:4444/wd/hub/"),dc);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://testsaas.qingxiaoguo.com");
        driver.findElement(element.user).sendKeys(users);
        driver.findElement(element.pwd).sendKeys(pwds);
        driver.findElement(element.button).click();
        driver.findElement(firsePageElement.yiyuan).click();
        driver.findElement(firsePageElement.guahao).click();
        driver.findElement(firsePageElement.shoukuan).click();
        Thread.sleep(5000);
        driver.quit();
    }

    @Test(dataProvider = "data2")
    public void test(String browser, String users,String pwds) throws InterruptedException, MalformedURLException {
        DesiredCapabilities dc=null;

        if (browser.equals("chrome")){
            dc=DesiredCapabilities.chrome();
        }else if(browser.equals("ie")){
            dc=DesiredCapabilities.internetExplorer();
        }else {
            System.out.println("输入错误");
        }

        WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.113:4444/wd/hub/"),dc);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://testsaas.qingxiaoguo.com");
        driver.findElement(element.user).sendKeys(users);
        driver.findElement(element.pwd).sendKeys(pwds);
        driver.findElement(element.button).click();
        driver.findElement(firsePageElement.yiyuan).click();
        driver.findElement(firsePageElement.guahao).click();
        driver.findElement(firsePageElement.shoukuan).click();
        Thread.sleep(5000);
        driver.quit();
    }

    @DataProvider(name = "data1")
    public Object[][] data1(){
        return new Object[][]{
                {"chrome","18435143346","123456"},
                {"ie","15110403429","123456"}
        };
    }

    @DataProvider(name ="data2")
    public Object[][] data2(){
        return new Object[][]{
                {"ie","15834195177","123456"},
                {"chrome","15652918835","123456"}
        };
    }

}
