package com.company.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageElement {
    WebDriver driver;
    //用户名
    public static By user=By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[1]/div/div/div[2]/div/input");
    //密码
    public static By pwd=By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[2]/div/div/div[2]/div/input");
    //登陆
    public static By login=By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[1]");


}
