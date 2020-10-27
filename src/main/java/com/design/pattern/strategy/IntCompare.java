package com.design.pattern.strategy;

/**
 * @Description: 整数比较
 * @Author: lh
 * @Date: 2020/10/27 19:51
 **/
public class IntCompare extends AbstractSorter<IntCompare> {

    /**
     * 值
     */
    private Integer integerValue;

    public IntCompare(Integer integerValue) {
        this.integerValue = integerValue;
    }

    @Override
    public int compare(IntCompare o) {
        if (integerValue.compareTo(o.integerValue) < 0) {
            return -1;
        } else if (integerValue.compareTo(o.integerValue) > 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "IntCompare{" +
                "integerValue=" + integerValue +
                '}';
    }
}
