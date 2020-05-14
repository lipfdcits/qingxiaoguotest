package com.po.page;

import org.openqa.selenium.By;

public class element {
    //定位用户名输入框
    public static By user=By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[1]/div/div/div[2]/div/input");
    //定位密码输入框
    public static By pwd=By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[2]/div/div/div[2]/div/input");
    //定位登陆按钮
    public static By button=By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[1]");
}
