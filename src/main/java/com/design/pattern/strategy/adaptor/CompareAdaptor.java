package com.design.pattern.strategy.adaptor;

/**
 * @Description: 比较接口
 * @Author: lh
 * @Date: 2020/10/27 19:51
 **/
public interface CompareAdaptor<T> {

    /**
     * 比较方法
     *
     * @param t1 1
     * @param t2 2
     * @return 返回值
     */
    int compare(T t1, T t2);

}
