package com.design.pattern.singleton;

/**
 * @Description: 懒汉式synchronized2
 * @Author: lh
 * @Date: 2020/9/3 19:49
 * <p>1.双重检查单例</p>
 * <p>2.不添加 volatile 在多线程的情况下，可能会出现空指针问题 </p>
 * <p>3.JVM在实例化对象的时候会进行优化和指令重排序操作,当某个线程获取锁进行实例化时，
 * 其他线程就直接获取实例使用，由于JVM指令重排序的原因，其他线程获取的对象也许不是一个完整的对象，
 * 所以在使用实例的时候就会出现空指针异常问题</p>
 **/
public class Singleton04 {

    private static volatile Singleton04 singleton04;

    private Singleton04() {
    }

    public static synchronized Singleton04 getInstance() {
        if(null == singleton04){
            synchronized(Singleton04.class){
                if (null == singleton04) {
                    singleton04 = new Singleton04();
                }
            }
        }
        return singleton04;
    }

}
