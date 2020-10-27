package com.design.pattern.strategy.adaptor.impl;

import com.design.pattern.strategy.adaptor.CompareAdaptor;
import com.design.pattern.strategy.bean.IntCompare;

/**
 * @Description: int  比较器
 * @Author: lh
 * @Date: 2020/10/27 20:52
 **/
public class IntCompareAdaptor implements CompareAdaptor<IntCompare> {
    @Override
    public int compare(IntCompare t1, IntCompare t2) {
        if (t1.getIntegerValue() > t2.getIntegerValue()) {
            return 1;
        } else if (t1.getIntegerValue() < t2.getIntegerValue()) {
            return -1;
        }
        return 0;
    }
}
