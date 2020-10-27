package com.design.pattern.strategy.abstractSimple;

/**
 * @Description: 排序类父类
 * @Author: lh
 * @Date: 2020/10/27 19:37
 **/
public abstract class AbstractSorter<T> {

    /**
     * 排序方法
     *
     * @return 排序结果
     */
    public abstract int compare(T t);

}
