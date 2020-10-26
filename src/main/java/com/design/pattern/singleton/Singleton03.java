package com.design.pattern.singleton;

/**
 * @Description: 懒汉式synchronized
 * @Author: lh
 * @Date: 2020/9/3 19:46
 * <p>保证了线程安全，但性能下降</p>
 **/
public class Singleton03 {

    private static Singleton03 singleton03;

    private Singleton03() {
    }

    public static synchronized Singleton03 getInstance() {
        if (null == singleton03) {
            singleton03 = new Singleton03();
        }
        return singleton03;
    }

//    public static synchronized Singleton03 getInstance() {
//        if (null == singleton03) {
//            //缩小同步代码块提升效率，实际并未锁住，会出现多个实例
//            synchronized (Singleton03.class) {
//                singleton03 = new Singleton03();
//            }
//        }
//        return singleton03;
//    }

}
