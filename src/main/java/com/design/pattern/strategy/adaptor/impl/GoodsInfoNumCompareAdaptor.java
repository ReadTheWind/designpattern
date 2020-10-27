package com.design.pattern.strategy.adaptor.impl;

import com.design.pattern.strategy.adaptor.CompareAdaptor;
import com.design.pattern.strategy.bean.GoodsInfo;

/**
 * @Description: 商品数量比较器
 * @Author: lh
 * @Date: 2020/10/27 21:03
 **/
public class GoodsInfoNumCompareAdaptor implements CompareAdaptor<GoodsInfo> {

    @Override
    public int compare(GoodsInfo t1, GoodsInfo t2) {
        if (t1.getGoodsNum() > t2.getGoodsNum()) {
            return 1;
        } else if (t1.getGoodsNum() < t2.getGoodsNum()) {
            return -1;
        }
        return 0;
    }
}
