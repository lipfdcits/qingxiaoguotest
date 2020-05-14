package qingxiaoguo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class wangyizhuce {
    WebDriver driver;
    @BeforeMethod
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\青小果6\\fireFoxDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closed() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void addTest(){
        driver.get("https://mail.163.com/");
        driver.findElement(By.linkText("注册新帐号")).click();
        String handle = driver.getWindowHandle();
        for(String handles:driver.getWindowHandles()){
            if (handles.equals(handle)){
                continue;
            }else {
                driver.switchTo().window(handles);
            }

        }
        driver.findElement(By.id("username")).sendKeys("454545454545");
    }
}
