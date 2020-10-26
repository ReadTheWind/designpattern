package com.design.pattern.singleton;

/**
 * @Description: 饿汉式
 * @Author: lh
 * @Date: 2020/9/3 19:26
 * <p>1.类加载到内存后就实例化一个实例，jvm 保证线程安全</p>
 * <P>2.缺点是不管用到与否，类加载就完成实例化</P>
 * <P>3.简单实用，推荐</P>
 **/
public class Singleton01 {
    private static final Singleton01 INSTANCE = new Singleton01();

    private Singleton01() {
    }

    public static Singleton01 getInstance() {
        return INSTANCE;
    }

}
