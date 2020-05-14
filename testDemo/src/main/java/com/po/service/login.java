package com.po.service;


import com.po.page.element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class login {
    WebDriver driver;
    @BeforeTest
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\青小果6\\fireFoxDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://testsaas.qingxiaoguo.com");

    }
    @DataProvider(name = "data1")
    public Object[][] data(){
        return new Object[][]{
                {"15110403429","123123"},
                {"15110403","123456"},
                {"15110403429","123456"}
        };
    }


    @Test(dataProvider="data1")
    public void login(String user,String pwd) throws InterruptedException {

        driver.findElement(element.user).clear();
        driver.findElement(element.user).sendKeys(user);
        driver.findElement(element.pwd).clear();
        driver.findElement(element.pwd).sendKeys(pwd);
        driver.findElement(element.button).click();
//        Thread.sleep(3000);
//        driver.quit();
    }

    @AfterTest
    public void closed() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
