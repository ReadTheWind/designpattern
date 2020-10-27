package com.design.pattern.strategy;

/**
 * @Description: 排序
 * @Author: lh
 * @Date: 2020/10/27 19:36
 **/
public class Sorter {

    /**
     * 降序排序方法
     *
     * @param sorters 入参
     */
    public static void sort(AbstractSorter[] sorters) {
        for (int i = 0; i < sorters.length - 1; i++) {
            int minOffSet = i;
            for (int j = 1; j < sorters.length; j++) {
                int cr = sorters[minOffSet].compare(sorters[j]);
                minOffSet = (cr == -1) ? minOffSet : j;
            }

            AbstractSorter newSorter = sorters[i];
            sorters[i] = sorters[minOffSet];
            sorters[minOffSet] = newSorter;
        }
    }

}
