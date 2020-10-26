package com.design.pattern.singleton;

/**
 * @Description: 枚举单例
 * @Author: lh
 * @Date: 2020/9/3 20:17
 * <P>1.解决线程安全问题及反序列化问题</P>
 * <P>2.枚举类没构造方法，反射获取不到</P>
 **/
public class Singleton06 {

    private Singleton06() {
    }

    /**
     * 枚举类型是线程安全的，并且只会装载一次
     */
    private enum Singleton {

        INSTANCE;

        private final Singleton06 singleton06;

        Singleton() {
            singleton06 = new Singleton06();
        }

        private Singleton06 getSingleton06() {
            return singleton06;
        }
    }

    private Singleton06 getInstance() {
        return Singleton.INSTANCE.getSingleton06();
    }
}
