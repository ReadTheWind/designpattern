package com.design.pattern.strategy.adaptor;

import com.design.pattern.strategy.adaptor.impl.GoodsInfoNumCompareAdaptor;
import com.design.pattern.strategy.adaptor.impl.IntCompareAdaptor;
import com.design.pattern.strategy.bean.GoodsInfo;
import com.design.pattern.strategy.bean.IntCompare;

/**
 * @Description:
 * @Author: lh
 * @Date: 2020/10/27 20:47
 **/
public class AdaptorTest {

    // 策略模式相对抽象模式比较，比较灵活方便，且满足开闭原则，对扩展开放对修改关闭
    // 灵活选择比较器，也可以使用匿名内部类
    public static void main(String[] args) {
        IntCompare intCompare = new IntCompare(3);
        IntCompare intCompare2 = new IntCompare(1);
        IntCompare intCompare3 = new IntCompare(2);
        IntCompare[] intCompareAbstractSorter = new IntCompare[]{intCompare, intCompare2, intCompare3};
        AdaptorSorter<IntCompare> adaptorSorter = new AdaptorSorter<>();

        adaptorSorter.sort(intCompareAbstractSorter, new IntCompareAdaptor());
        for (IntCompare intCompare1 : intCompareAbstractSorter) {
            System.out.println(intCompare1.toString());
        }
        
        //匿名内部类写法
//        adaptorSorter.sort(intCompareAbstractSorter, new CompareAdaptor<IntCompare>() {
//            @Override
//            public int compare(IntCompare t1, IntCompare t2) {
//                if (t1.getIntegerValue() > t2.getIntegerValue()) {
//                    return 1;
//                } else if (t1.getIntegerValue() < t2.getIntegerValue()) {
//                    return -1;
//                }
//                return 0;
//            }
//        });


        // 同一对象多比较器实现
        GoodsInfo g1 = new GoodsInfo("g1", "商品1", 1, 3);
        GoodsInfo g2 = new GoodsInfo("g2", "商品2", 2, 2);
        GoodsInfo g3 = new GoodsInfo("g3", "商品3", 3, 1);
        GoodsInfo[] goodsInfos = new GoodsInfo[]{g1, g2, g3};
        AdaptorSorter<GoodsInfo> adaptorSorter2 = new AdaptorSorter<>();

        adaptorSorter2.sort(goodsInfos, new GoodsInfoNumCompareAdaptor());
//        adaptorSorter2.sort(goodsInfos, new GoodsInfoWeightCompareAdaptor());
        for (GoodsInfo goodsInfo : goodsInfos) {
            System.out.println(goodsInfo.toString());
        }
    }


}
