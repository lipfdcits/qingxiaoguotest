package com.company.service;

import com.company.page.pageElement;
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


    @Test(dataProvider = "data1")
    public void action(String user,String pwd) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\青小果6\\fireFoxDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://testsaas.qingxiaoguo.com");
        driver.findElement(pageElement.user).clear();
        driver.findElement(pageElement.user).sendKeys(user);
        driver.findElement(pageElement.pwd).clear();
        driver.findElement(pageElement.pwd).sendKeys(pwd);
        driver.findElement(pageElement.login).click();
        Thread.sleep(3000);
        driver.quit();
    }


    @DataProvider(name="data1")
    public Object[][] data(){
        return new Object[][]{
                {"15110403429","123456"},
                {"15110403429","123123"}
        };
    }


}
