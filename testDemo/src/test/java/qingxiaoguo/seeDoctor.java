package qingxiaoguo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class seeDoctor {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        //打开浏览器
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\青小果6\\fireFoxDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //输入网址
        driver.get("https://testsaas.qingxiaoguo.com");
        //最大化
        driver.manage().window().maximize();
        //输入用户名
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/form/div[1]/div/div/div[2]/div/input")).sendKeys("15110403429");
        //输入密码
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/form/div[2]/div/div/div[2]/div/input")).sendKeys("123456");
        //点击登陆
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div/div[1]")).click();
        //选择医院
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[1]/div[2]/div/div/div/div[2]")).click();

    }

    @AfterMethod
    public void closed() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void action() throws InterruptedException {
        //点击医生区
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[2]/li/div")).click();
        //点击今日就诊
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[1]/div[1]/div/ul/div[2]/li/ul/div[1]/a/li")).click();
        Thread.sleep(2000);
        //点击快速就诊
        driver.findElement(By.xpath("//*[@id=\"doctorMain\"]/div[1]/div/div[1]/div")).click();
        //填写姓名
        driver.findElement(By.xpath("//*[@id=\"pane-record\"]/form/div[1]/div[2]/div[1]/div/div/div/div[1]/input")).sendKeys("胡一菲");
        //填写年龄
        driver.findElement(By.xpath("//*[@id=\"pane-record\"]/form/div[1]/div[2]/div[3]/div[2]/div/div/input")).sendKeys("28");
        //填写身份证号
        driver.findElement(By.xpath("//*[@id=\"pane-record\"]/form/div[1]/div[2]/div[4]/div/div/div/input")).sendKeys("140481199305084821");
        //填写电话
        driver.findElement(By.xpath("//*[@id=\"pane-record\"]/form/div[1]/div[3]/div[1]/div/div/div/div[1]/input")).sendKeys("15110403521");
        //填写主诉
        driver.findElement(By.xpath("//*[@id=\"pane-record\"]/form/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input")).sendKeys("感冒");

        //选择发病日期,出现下拉框
        driver.findElement(By.xpath("//*[@id=\"pane-record\"]/form/div[2]/div[1]/div[2]/div[2]/div/div/div/input")).click();
                                     //*[@id="pane-record"]/form/div[2]/div[1]/div[2]/div[2]/div/div/div/input

        boolean table = driver.findElement(By.xpath("/html/body/div[2]")).isDisplayed();
        System.out.println(table);
        //选择日期
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/table[1]/tbody/tr[4]/td[4]/div/span")).click();

        //点击诊断信息，出现下拉框
        driver.findElement(By.xpath("//*[@id=\"pane-record\"]/form/div[2]/div[1]/div[6]/div/div/div/div/div[1]/input")).click();
        //选择诊断信息
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/ul/ul[4]/li[2]/ul/li[1]")).click();
        //点击保存
        driver.findElement(By.xpath("//*[@id=\"pane-record\"]/form/div[2]/div[1]/div[8]/button")).click();
        System.out.println("保存完成");
    }

}
