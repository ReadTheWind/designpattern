package com.design.pattern.strategy.bean;

/**
 * @Description: 商品信息
 * @Author: lh
 * @Date: 2020/10/27 20:56
 **/
public class GoodsInfo {

    /**
     * 商品代码
     */
    private String goodsCode;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品重量
     */
    private Integer goodsWeigh;

    /**
     * 商品数量
     */
    private Integer goodsNum;

    public GoodsInfo(String goodsCode, String goodsName, Integer goodsWeigh, Integer goodsNum) {
        this.goodsCode = goodsCode;
        this.goodsName = goodsName;
        this.goodsWeigh = goodsWeigh;
        this.goodsNum = goodsNum;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public Integer getGoodsWeigh() {
        return goodsWeigh;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    @Override
    public String toString() {
        return "GoodsInfo{" +
                "goodsCode='" + goodsCode + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsWeigh=" + goodsWeigh +
                ", goodsNum=" + goodsNum +
                '}';
    }
}
