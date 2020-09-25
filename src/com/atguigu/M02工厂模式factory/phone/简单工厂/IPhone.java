package com.atguigu.M02工厂模式factory.phone.简单工厂;

public class IPhone implements Phone {
    public IPhone() {
        this.make();
    }
    @Override
    public void make() {
        System.out.println("make iphone!");
    }
}