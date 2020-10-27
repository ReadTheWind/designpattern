package com.design.pattern.strategy;

/**
 * @Description: 字符串比较
 * @Author: lh
 * @Date: 2020/10/27 20:12
 **/
public class StringCompare extends AbstractSorter<StringCompare> {

    private String strValue;

    public StringCompare(String strValue) {
        this.strValue = strValue;
    }

    @Override
    public int compare(StringCompare stringCompare) {
        if (strValue.compareTo(stringCompare.strValue) < 0) {
            return -1;
        } else if (strValue.compareTo(stringCompare.strValue) > 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "StringCompare{" +
                "strValue='" + strValue + '\'' +
                '}';
    }
}
