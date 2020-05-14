package qingxiaoguo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestGrid2 {
    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\青小果6\\fireFoxDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @DataProvider(name="data")
    public Object[][] data(){
        return new Object[][]{
                {"chrome","15110403429","123123"},
                {"ie","15110403429","123456"}
        };
    }

//    @Test(dataProvider = "data")
//    public void login(String user,String pwd){
//        driver.get("https://testsaas.qingxiaoguo.com");
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[1]/div/div/div[2]/div/input")).sendKeys(user);
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[2]/div/div/div[2]/div/input")).sendKeys(pwd);
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[1]")).click();
//    }

    @Test(dataProvider = "data")
    public void login1(String browser, String user,String pwd) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc=null;
        if(browser.equals("chrome")){
            dc=DesiredCapabilities.chrome();
        }else if(browser.equals("ie")){
            dc=DesiredCapabilities.internetExplorer();
        }else {
            System.out.println("输入错误");
        }
        driver=new RemoteWebDriver(new URL("http://192.168.0.113:4444/wd/hub"),dc);
        driver.get("https://testsaas.qingxiaoguo.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[1]/div/div/div[2]/div/input")).sendKeys(user);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[2]/div/div/div[2]/div/input")).sendKeys(pwd);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[1]")).click();

        Thread.sleep(5000);
        driver.quit();
    }



}
