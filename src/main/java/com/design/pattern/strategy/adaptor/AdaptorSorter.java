package com.design.pattern.strategy.adaptor;

/**
 * @Description: 适配器比较
 * @Author: lh
 * @Date: 2020/10/27 20:43
 **/
public class AdaptorSorter<T> {

    /**
     * 降序排序方法
     *
     * @param trr            入参
     * @param compareAdaptor 比较器
     */
    public void sort(T[] trr, CompareAdaptor<T> compareAdaptor) {
        for (int i = 0; i < trr.length - 1; i++) {
            int minOffSet = i;
            for (int j = 1; j < trr.length; j++) {
                int cr = compareAdaptor.compare(trr[minOffSet], trr[j]);
                minOffSet = (cr == -1) ? minOffSet : j;
            }

            T newSorter = trr[i];
            trr[i] = trr[minOffSet];
            trr[minOffSet] = newSorter;
        }
    }

}
