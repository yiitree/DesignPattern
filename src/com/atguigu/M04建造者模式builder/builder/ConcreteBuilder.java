package com.atguigu.M04建造者模式builder.builder;

/**
 * @Author: 鏇剧澘
 * @Date: 2020/9/9 19:57
 */
public class ConcreteBuilder extends Builder {

    private Product product = new Product();

    //璁剧疆浜у搧闆朵欢
    @Override
    public void BuildPartA() {
        product.add("閮ㄤ欢A");
    }

    @Override
    public void BuildPartB() {
        product.add("閮ㄤ欢B");
    }

    //缁勫缓涓�涓骇鍝�
    @Override
    public Product getResult() {
        return product;
    }

}
