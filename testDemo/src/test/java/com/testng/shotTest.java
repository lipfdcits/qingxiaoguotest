package com.testng;

import ch.qos.logback.core.util.FileUtil;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class shotTest {
    WebDriver driver;
    @BeforeMethod
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\青小果6\\fireFoxDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    //截图
    @Test
    public void shot1(){
        //打开浏览器
        driver.get("https://www.baidu.com");
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,new File("E:\\test1.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //截图
    @Test
    public void shot2() throws InterruptedException {
        driver.get("https://testsaas.qingxiaoguo.com/#/login");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[1]/div/div/div[2]/div/input")).sendKeys("15110403429");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[2]/div/div/div[2]/div/input")).sendKeys("sn1823555394");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[1]")).click();
        Thread.sleep(3000);
        String url=driver.getCurrentUrl();
        Assert.assertEquals(url,"https://testsaas.qingxiaoguo.com/#/clinic/index");
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(file,new File("E:\\test2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void closed() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
