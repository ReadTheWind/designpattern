package com.design.pattern.strategy.abstractSimple;

import com.design.pattern.strategy.bean.IntCompare;
import com.design.pattern.strategy.bean.StringCompare;

/**
 * 策略基于 compareable 分析
 * @Description: 策略测试
 * @Author: lh
 * @Date: 2020/10/27 19:35
 **/
public class StrategyTest {

    // 并非策略模式，只是抽象了一层，相对写死的版本比较灵活
    public static void main(String[] args) {
        IntCompare intCompare = new IntCompare(3);
        IntCompare intCompare2 = new IntCompare(1);
        IntCompare intCompare3 = new IntCompare(2);
        AbstractSorter<IntCompare>[] intCompareAbstractSorter = new AbstractSorter[]{intCompare, intCompare2, intCompare3};
        Sorter.sort(intCompareAbstractSorter);
        for (AbstractSorter abstractSorter:intCompareAbstractSorter) {
            System.out.println(abstractSorter.toString());
        }

        StringCompare stringCompare = new StringCompare("3");
        StringCompare stringCompare2 = new StringCompare("1");
        StringCompare stringCompare3 = new StringCompare("2");
        AbstractSorter<StringCompare>[] strCompareAbstractSorter = new AbstractSorter[]{stringCompare, stringCompare2, stringCompare3};
        Sorter.sort(strCompareAbstractSorter);
        for (AbstractSorter abstractSorter:strCompareAbstractSorter) {
            System.out.println(abstractSorter.toString());
        }
    }

}
