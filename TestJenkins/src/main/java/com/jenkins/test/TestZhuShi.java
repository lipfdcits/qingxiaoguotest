package com.jenkins.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestZhuShi {
    @BeforeTest
    public void test1(){
        System.out.println("这是@BeforeTest");
    }
    @AfterTest
    public void test2(){
        System.out.println("这是@AfterTest");
    }
    @Test
    public void test3(){
        System.out.println("这是@Test1");
    }
    @Test
    public void test4(){
        System.out.println("这是@Test2");
    }
    @Test
    public void test5(){
        System.out.println("这是@Test3");
    }


}
