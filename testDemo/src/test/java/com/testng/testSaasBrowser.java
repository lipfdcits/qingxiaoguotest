package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testSaasBrowser {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() throws InterruptedException {
        //打开浏览器
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\青小果6\\fireFoxDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        //输入网址
        driver.get("https://testsaas.qingxiaoguo.com/#/login");
        driver.manage().window().maximize();
        //查找输入框元素,输入用户名和密码
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[1]/div/div/div[2]/div/input")).sendKeys("15110403429");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[2]/div/div/div[2]/div/input")).sendKeys("123456");
        Thread.sleep(3000);
        //点击登陆
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[1]")).click();
        Thread.sleep(3000);
        //校验页面跳转
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://testsaas.qingxiaoguo.com/#/clinic/index");
        //医院选择
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[1]/div[2]/div/div/div/div[1]")).click();
        Thread.sleep(3000);
        //校验地址
        String url1 = driver.getCurrentUrl();
        Assert.assertEquals(url1,"https://testsaas.qingxiaoguo.com/#/cashier/cashMain");

    }

    @Test
    public void openTestSaas() throws InterruptedException {

        //点击预约挂号
        driver.findElement(By.className("btnGuahao")).click();
        Thread.sleep(1000);
        //网页后退
        driver.navigate().back();
        Thread.sleep(3000);
        //点击代收款数字
        driver.findElement(By.xpath("//*[@id=\"cashMain\"]/div[1]/div[1]/div[2]/div/div[1]/p[2]")).click();
        Thread.sleep(3000);
        //网页后退
        driver.navigate().back();
        Thread.sleep(3000);
        //点击待退款数据
        driver.findElement(By.xpath("//*[@id=\"cashMain\"]/div[1]/div[1]/div[3]/div/div[1]/p[2]")).click();
        Thread.sleep(3000);
        //网页后退
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[2]/li/div")).click();
        Thread.sleep(3000);
    }

    @Test
    public void saasTest() throws InterruptedException {

        //点击“医生区”
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[2]/li/div")).click();
        Thread.sleep(3000);
        //点击“窗口区”
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[3]/li/div")).click();
        Thread.sleep(3000);
        //点击库存管理
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[4]/li/div")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[5]/li/div")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[6]/li/div")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[7]/li/div")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[8]/li/div")).click();
        Thread.sleep(3000);
    }

    @Test
    public void testDoctor() throws InterruptedException {
        //点击“医生区”
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[2]/li/div")).click();
        Thread.sleep(3000);
        //点击“今日就诊”
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[2]/li/ul/div[1]/a/li")).click();
        Thread.sleep(3000);
    }
    //不接诊
    @Test
    public void testDoctorJob1() throws InterruptedException {
        //1.点击系统设置
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[8]/li/div")).click();
        Thread.sleep(3000);
        //2.点击诊所管理
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[8]/li/ul/div[1]/a/li")).click();
        Thread.sleep(3000);
        //3.点击排班设置
        driver.findElement(By.id("tab-scheduling")).click();
        Thread.sleep(3000);
        //4.选择排班时间
        driver.findElement(By.xpath("//*[@id=\"pane-scheduling\"]/div/div/div[2]/div[3]/table/tbody/tr[6]/td[7]/div/span")).click();
        Thread.sleep(3000);
        //点击排班时间
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[5]/div")).click();
        Thread.sleep(3000);
        //5.点击“不接诊”
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[4]/div/div[2]/div/div[1]/div/label[2]")).click();
        Thread.sleep(3000);
        //6.点击确定
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[4]/div/div[2]/div/div[2]/button[1]")).click();
        Thread.sleep(3000);
    }

    //接诊，排班成功
    @Test
    public void testDoctorJob2() throws InterruptedException {
        //1.点击系统设置
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[8]/li/div")).click();
        Thread.sleep(3000);
        //2.点击诊所管理
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[8]/li/ul/div[1]/a/li")).click();
        Thread.sleep(3000);
        //3.点击排班设置
        driver.findElement(By.id("tab-scheduling")).click();
        Thread.sleep(3000);
        //4.选择排班时间
        driver.findElement(By.xpath("//*[@id=\"pane-scheduling\"]/div/div/div[2]/div[3]/table/tbody/tr[6]/td[7]/div/span")).click();
        Thread.sleep(3000);
        //点击排班时间
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[5]")).click();
        Thread.sleep(3000);
        //5.点击“接诊”
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[4]/div/div[2]/div/div[1]/div/label[1]/span[2]")).click();
        Thread.sleep(3000);
        //6.点击接诊诊室
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[4]/div/div[2]/div/form/div[2]/div/div[2]/div/div/input")).click();
        Thread.sleep(3000);
        //7.选择诊室
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li")).click();
        Thread.sleep(3000);
        //8.输入人数
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[4]/div/div[2]/div/form/div[3]/div/div[2]/div/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[4]/div/div[2]/div/form/div[3]/div/div[2]/div/input")).sendKeys("40");
        Thread.sleep(3000);
        //9.点击确定
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[4]/div/div[2]/div/div[2]/button[1]")).click();
        Thread.sleep(1000);
        //点击挂号
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[1]/li/ul/div[2]/a")).click();
        Thread.sleep(3000);
        //选择医生
        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[2]/div[2]/div/input")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[6]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[1]/div/div[3]/div/div/div[1]/div[4]/div[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[2]/form/div[1]/div/div/div[1]/div[1]/input")).sendKeys("暴君");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[2]/form/div[2]/div/div/div/div[1]/input")).click();
        Thread.sleep(3000);
        //--------------------------------------------------------------------------------------------------------
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/ul/li[1]")).click();
        Thread.sleep(1000);
        //--------------------------------------------------------------------------------------------------------
        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[2]/form/div[3]/div[2]/div/div/input")).sendKeys("25");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[2]/form/div[4]/div/div/div/input")).sendKeys("140481199606054877");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[2]/form/div[5]/div/div/div/input")).sendKeys("13845678954");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[4]/button")).click();
    }

    @Test
    public void testDoctorJob3() throws InterruptedException {
        //点击挂号
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[1]/li/ul/div[2]/a")).click();
        Thread.sleep(3000);
        //选择医生
        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[2]/div[2]/div/input")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[6]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[1]/div/div[3]/div/div/div[1]/div[4]/div[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[2]/form/div[1]/div/div/div[1]/div[1]/input")).sendKeys("暴君");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[2]/form/div[2]/div/div/div/div[1]/input")).click();
        Thread.sleep(3000);
        //--------------------------------------------------------------------------------------------------------
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/ul/li[1]")).click();
        Thread.sleep(1000);
        //--------------------------------------------------------------------------------------------------------
        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[2]/form/div[3]/div[2]/div/div/input")).sendKeys("25");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[2]/form/div[4]/div/div/div/input")).sendKeys("140481199606054877");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[3]/div[2]/form/div[5]/div/div/div/input")).sendKeys("13845678954");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"docRegistered\"]/div[1]/div/div[4]/button")).click();
    }



    @AfterMethod
    public void closed() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


}
