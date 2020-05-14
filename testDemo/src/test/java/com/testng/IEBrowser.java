package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.xml.bind.Element;
import java.util.List;


public class IEBrowser {
    WebDriver driver;

    @BeforeMethod
    public void openIE(){
        //打开ie浏览器
        System.setProperty("webdriver.ie.driver","C:\\Users\\青小果6\\fireFoxDriver\\IEDriverServer.exe");
        driver=new InternetExplorerDriver();
        //进入百度首页
        driver.get("https://www.baidu.com");
        //校验百度网址
        String url=driver.getCurrentUrl();
        Assert.assertEquals(url,"https://www.baidu.com/");
        System.out.println("校验成功");
    }


    @Test
    public void actionIE() throws InterruptedException {

        //设置浏览器大小500*500
        Dimension dimension=new Dimension(500,500);
        driver.manage().window().setSize(dimension);
        Thread.sleep(3000);
        //浏览器最大化
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //刷新浏览器
        driver.navigate().refresh();
        //网页后退
        driver.navigate().back();
        Thread.sleep(3000);
        //网页前进
        driver.navigate().forward();
        Thread.sleep(3000);
        //查找元素并输出
        WebElement element=driver.findElement(By.xpath(";l"));
        String text=element.getText();
        System.out.println(text);

    }

    @Test
    public void findElement(){
        List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"u1\"]/a"));
        for (int i = 0; i < list.size(); i++) {
            String text=list.get(i).getText();
            System.out.println(text);
        }
    }

    @AfterMethod
    public void closed(){
        //关闭浏览器
        driver.quit();
    }
}
