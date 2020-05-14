package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FireFoxBrowser {
    WebDriver driver;

    @BeforeMethod
    public void openFireFox(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\青小果6\\fireFoxDriver\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.get("https://www.baidu.com/");
    }

    @Test
    public void findElement() throws InterruptedException {

        WebElement element= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/a[4]"));
        String text=element.getText();
        Thread.sleep(3000);
        System.out.println(text);

    }

    @Test
    public void findElements() throws InterruptedException {

        List<WebElement> list= driver.findElements(By.xpath("//*[@id=\"u1\"]/a"));
        for (int i = 0; i < list.size(); i++) {
            String text=list.get(i).getText();
            System.out.println(text);
        }
        System.out.println(list.size());


    }

    @AfterMethod
    public void closed(){
        driver.quit();
    }
}
