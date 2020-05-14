package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class ActionsBrowserTest {
    WebDriver driver;

    @BeforeMethod
    public void openChromeBrowser(){
        //打开chrome
        System.setProperty("webdriver.chrome.driver","C:\\Users\\青小果6\\fireFoxDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://testsaas.qingxiaoguo.com/#/cashier/cashMain");
    }

    @Test
    public void openBrowser() throws InterruptedException {
        //打开百度
        WebElement find = driver.findElement(By.linkText("地图"));
        System.out.println("搜索的元素存在："+find);
        Thread.sleep(3000);
    }

    @Test
    public void opBrowser1() throws InterruptedException {
        String url=driver.getCurrentUrl();
        Assert.assertEquals(url,"https://www.baidu.com/");
        Thread.sleep(3000);
    }

    @Test
    public void openBrowser2(){
        List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"u1\"]/a"));
        for (int i = 0; i < list.size(); i++) {
            String text=list.get(i).getText();
            System.out.println(text);
        }

    }
    @Test
    public void openBrowser3(){
        List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"u1\"]/a"));
        for (int i = 0; i < list.size(); i++) {
            String text=list.get(i).getText();
            System.out.println(text);
        }

    }

    @Test
    public void xpathTest() throws InterruptedException {
        WebElement element= driver.findElement(By.className("login-content-container-btn"));
        String text=element.getText();
        System.out.println("输出："+text);
        Thread.sleep(3000);
    }

    @AfterMethod
    public void closedBrowser(){
        driver.quit();
    }
}
