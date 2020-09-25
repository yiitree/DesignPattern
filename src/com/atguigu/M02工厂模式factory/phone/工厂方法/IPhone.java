package com.atguigu.M02工厂模式factory.phone.工厂方法;

public class IPhone implements Phone {
    public IPhone() {
        this.make();
    }
    @Override
    public void make() {
        System.out.println("make iphone!");
    }
}