package com.design.pattern.singleton;

import org.springframework.util.Assert;

/**
 * @Description: 测试
 * @Author: lh
 * @Date: 2020/9/3 19:29
 **/
public class Test {

    public static void main(String[] args) {
        Singleton01 singleton01 = Singleton01.getInstance();
        Singleton01 singleton001 = Singleton01.getInstance();
        Assert.isTrue(singleton01.equals(singleton001));


        Singleton02 singleton02 = Singleton02.getInstance();
        Singleton02 singleton002 = Singleton02.getInstance();
        Assert.isTrue(singleton02.equals(singleton002));


    }
}
