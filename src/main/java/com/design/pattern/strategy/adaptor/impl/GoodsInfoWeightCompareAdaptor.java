package com.design.pattern.strategy.adaptor.impl;

import com.design.pattern.strategy.adaptor.CompareAdaptor;
import com.design.pattern.strategy.bean.GoodsInfo;

/**
 * @Description: 商品重量比较
 * @Author: lh
 * @Date: 2020/10/27 20:59
 **/
public class GoodsInfoWeightCompareAdaptor implements CompareAdaptor<GoodsInfo> {

    @Override
    public int compare(GoodsInfo t1, GoodsInfo t2) {
        if (t1.getGoodsWeigh() > t2.getGoodsWeigh()) {
            return 1;
        } else if (t1.getGoodsWeigh() < t2.getGoodsWeigh()) {
            return -1;
        }
        return 0;
    }
}
