package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class quanjuwaitTest {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser1() throws InterruptedException {
        //打开浏览器
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\青小果6\\fireFoxDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //输入网址
        driver.get("https://testsaas.qingxiaoguo.com/#/login");
        driver.manage().window().maximize();
        //查找输入框元素,输入用户名和密码
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[1]/div/div/div[2]/div/input")).sendKeys("15110403429");

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[2]/div/div/div[2]/div/input")).sendKeys("123456");

        //点击登陆
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[1]")).click();


    }

//    @Test
//    public void openBrowser2() throws InterruptedException {
//        //校验页面跳转
//        String url = driver.getCurrentUrl();
//        //Assert.assertEquals(url, "https://testsaas.qingxiaoguo.com/#/clinic/index");
//
//        //医院选择
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[1]/div[2]/div/div/div/div[1]")).click();
//
//        //校验地址
//        String url1 = driver.getCurrentUrl();
//        //Assert.assertEquals(url1,"https://testsaas.qingxiaoguo.com/#/cashier/cashMain");
//        //1.点击系统设置
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[8]/li/div")).click();
//
//        //2.点击诊所管理
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[8]/li/ul/div[1]/a/li")).click();
//
//        //3.点击排班设置
//        driver.findElement(By.id("tab-scheduling")).click();
//
//        //4.选择排班时间
//        driver.findElement(By.xpath("//*[@id=\"pane-scheduling\"]/div/div/div[2]/div[3]/table/tbody/tr[6]/td[7]/div/span")).click();
//
//        //点击排班时间
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[5]")).click();
//
//        //5.点击“接诊”
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[4]/div/div[2]/div/div[1]/div/label[1]/span[2]")).click();
//
//        //6.点击接诊诊室
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[4]/div/div[2]/div/form/div[2]/div/div[2]/div/div/input")).click();
//
//        //7.选择诊室
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li")).click();
//
//        //8.输入人数
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[4]/div/div[2]/div/form/div[3]/div/div[2]/div/input")).clear();
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[4]/div/div[2]/div/form/div[3]/div/div[2]/div/input")).sendKeys("40");
//
//        //9.点击确定
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[4]/div/div[2]/div/div[2]/button[1]")).click();
//
//        //点击挂号
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[1]/li/ul/div[2]/a/li")).click();
//
//        //点击医生，出现下拉框
//        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[2]/div[2]/div/input")).click();
//
//        //选择医生
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[6]")).click();
//
//        //选择日期
//        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[1]/div/div[3]/div/div/div[1]/div[4]/div[2]")).click();
//        //输入姓名
//        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[2]/form/div[1]/div/div/div[1]/div[1]/input")).sendKeys("漩涡鸣人");
//
//        //点击性别，出现下拉框
//        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[2]/form/div[2]/div/div/div/div[1]/input")).click();
//
//        //选择性别--------------------------------------------------------------------------------------------------------
//        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[1]")).click();
//
//        //输入年龄--------------------------------------------------------------------------------------------------------
//        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[2]/form/div[3]/div[2]/div/div/input")).sendKeys("25");
//
//        //输入身份证号
//        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[2]/form/div[4]/div/div/div/input")).sendKeys("140481199606054876");
//
//        //输入手机号码
//        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[2]/form/div[5]/div/div/div/input")).sendKeys("13845678953");
//
//        //点击收款
//        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[4]/button")).click();
//        //点击确定/取消
//        //driver.findElement(By.xpath("//*[@id=\"moneyConfirm\"]/div[1]/div/div[3]/span/button[1]")).click();
//        driver.findElement(By.xpath("//*[@id=\"moneyConfirm\"]/div[1]/div/div[3]/span/button[2]")).click();
//        //提示支付成功，点击关闭
//        //driver.findElement(By.xpath("//*[@id=\"moneySuccess\"]/div[1]/div/div[3]/span/button")).click();
//
//    }

    @AfterMethod
    public void closed() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
