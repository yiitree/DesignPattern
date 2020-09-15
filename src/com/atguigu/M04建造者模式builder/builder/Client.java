package com.atguigu.M04建造者模式builder.builder;

/**
 * @Author: 鏇剧澘
 * @Date: 2020/9/9 19:57
 */
public class Client {

    public static void main(String[] args) {

        Director director = new Director();
        Builder builder1 = new ConcreteBuilder();
        Builder builder2 = new ConcreteBuilder1();

        //鎸囨尌鑰呯敤ConcreteBuilder1鐨勬柟娉曟潵寤洪�犱骇鍝�
        director.Construct(builder1);
        Product product1 = builder1.getResult();
        product1.show();

        //鎸囨尌鑰呯敤ConcreteBuilder2鐨勬柟娉曟潵寤洪�犱骇鍝�
        director.Construct(builder2);
        Product product2 = builder2.getResult();
        product2.show();

    }

}
