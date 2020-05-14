package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class EdgeBrowser {
    WebDriver driver;

    @BeforeMethod
    public void openEdge(){
        //打开浏览器
        System.setProperty("webdriver.edge.driver","C:\\Users\\青小果6\\fireFoxDriver\\msedgedriver.exe");
        driver = new EdgeDriver();
        //进入百度
        driver.get("https://testsaas.qingxiaoguo.com");
    }

    @Test
    public void actionEdge() throws InterruptedException {

        //设置网页大小（800*800）
        Dimension dimension= new Dimension(800,800);
        driver.manage().window().setSize(dimension);
        //网页最大化
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //网页刷新
        driver.navigate().refresh();
        Thread.sleep(3000);
        //网页后退
        driver.navigate().back();
        Thread.sleep(3000);
        //网页前进
        driver.navigate().forward();
        Thread.sleep(3000);
        //校验网页
        String url=driver.getCurrentUrl();
        Assert.assertEquals(url,"https://www.baidu.com/");
        System.out.println("校验一致");
        //查询单个元素并展示
        WebElement element=driver.findElement(By.xpath("//*[@id=\"s-user-setting-menu\"]/div/a[3]"));
        String text=element.getText();
        System.out.println(text);
    }

    @Test
    public void findElements() throws InterruptedException {
        List<WebElement> list= driver.findElements(By.xpath("//*[@id=\"s-top-left\"]/a"));
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            String text=list.get(i).getText();
            System.out.println(text);
        }
        Thread.sleep(3000);
    }

    @AfterMethod
    public void closed(){
        //关闭网页
        driver.quit();
    }
}
