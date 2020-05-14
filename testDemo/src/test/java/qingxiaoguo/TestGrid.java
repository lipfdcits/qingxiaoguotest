package qingxiaoguo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestGrid {

//    @Test
//    public void testChrome() throws MalformedURLException, InterruptedException {
//        DesiredCapabilities dc = DesiredCapabilities.firefox();
//        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.113:4444/wd/hub"),dc);
//        driver.get("https://www.baidu.com");
//        Thread.sleep(10000);
//        driver.quit();
//    }

    @DataProvider(name="data1")
    public Object[][] test1(){
        return new Object[][]{
                {"chrome"},
                {"internet explorer"}
        };
    }

    @Test(dataProvider = "data1")
    public void testGrid(String browser) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc=null;
        if(browser.equals("chrome")){
            dc=DesiredCapabilities.chrome();
        }else if(browser.equals("internet explorer")){
            dc=DesiredCapabilities.internetExplorer();
        }else {
            System.out.println("error");
        }
        WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.113:4444/wd/hub"),dc);
        driver.get("https://www.baidu.com");
        Thread.sleep(5000);
        driver.quit();

    }


}
