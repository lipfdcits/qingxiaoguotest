package qingxiaoguo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testClick {
    WebDriver webDriver;

    @BeforeMethod
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\青小果6\\fireFoxDriver\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://www.baidu.com");
        webDriver.manage().window().maximize();
    }

    @AfterMethod
    public void closed() throws InterruptedException {
        Thread.sleep(3000);
        webDriver.quit();
    }

    @Test
    public void contextClick() {
        //定位点击的元素
        WebElement element = webDriver.findElement(By.id("su"));
        //new一个Action对象
        Actions builds = new Actions(webDriver);
        builds.contextClick(element).perform();
    }

    @Test
    public void contextClick2() {
        //定位点击的元素
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"qrcode\"]/div/div[2]/p[1]"));
        //new一个Action对象
        Actions builder = new Actions(webDriver);
        //用这个对象对网页元素进行操作
        builder.doubleClick(element).perform();
    }

    @Test
    public void moveToElement() {
        WebElement element = webDriver.findElement(By.name("tj_briicon"));
        Actions builder = new Actions(webDriver);
        builder.moveToElement(element).perform();
    }

    @Test
    public void moveToOtherElement(){
        WebElement element=webDriver.findElement(By.linkText("使用百度前必读"));
        WebElement otherElement=webDriver.findElement(By.id("kw"));
        Actions builder= new Actions(webDriver);
        builder.clickAndHold(element).moveToElement(otherElement).release(otherElement);
    }

}
