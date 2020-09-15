package com.atguigu.M04建造者模式builder.builder;

/**
 * @Author: 鏇剧澘
 * @Date: 2020/9/9 19:58
 */
public class Product {

    String a = "";

    public void add(String a) {
        this.a += a;
    }

    public void show() {
        System.out.println(a);
    }
}
