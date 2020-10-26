package com.design.pattern.singleton;

/**
 * @Description: 静态内部类
 * @Author: lh
 * @Date: 2020/9/3 20:06
 * <P>1.JVM 保证线程安全单例，JVM 加载一个实例只加载一次</P>
 * <P>2.加载外部类时不会加载内部类，实现懒加载</P>
 * <p>3.比较完美</p>
 **/
public class Singleton05 {

    private Singleton05() {
    }

    private static class Singleton05Holder {
        private final static Singleton05 singleton05 = new Singleton05();
    }

    public static Singleton05 getInstance() {
        return Singleton05Holder.singleton05;
    }

}
