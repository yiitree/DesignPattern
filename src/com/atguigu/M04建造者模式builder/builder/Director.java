package com.atguigu.M04建造者模式builder.builder;

/**
 * @Author: 鏇剧澘
 * @Date: 2020/9/9 19:56
 */
public class Director {

    public void Construct(Builder builder) {
        builder.BuildPartA();
        builder.BuildPartB();
    }

}
