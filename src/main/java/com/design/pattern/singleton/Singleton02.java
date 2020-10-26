package com.design.pattern.singleton;

/**
 * @Description: 懒汉式
 * @Author: lh
 * @Date: 2020/9/3 19:34
 * <p>虽然达到按需实例化，但存在线程不安全问题</p>
 **/
public class Singleton02 {

    private static Singleton02 singleton02;

    private Singleton02() {
    }

    public static Singleton02 getInstance() {
        if (null == singleton02) {
            singleton02 = new Singleton02();
        }
        return singleton02;
    }


//复现线程问题
//    public static  Singleton02 getInstance(){
//        if(null == singleton02){
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            singleton02= new Singleton02();
//        }
//        return singleton02;
//    }
//
//
//
//    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            new Thread(() -> {
//                Singleton02 singleton02 = Singleton02.getInstance();
//                System.out.println(singleton02.hashCode());
//            }).start();
//        }
//    }

}
