package com.atguigu.M02工厂模式factory.phone.抽象工厂;

public class MiPhone implements Phone {
    public MiPhone() {
        this.make();
    }
    @Override
    public void make() {
        System.out.println("make xiaomi phone!");
    }
}
