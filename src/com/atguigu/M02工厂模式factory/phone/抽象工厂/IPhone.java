package com.atguigu.M02����ģʽfactory.phone.���󹤳�;

public class IPhone implements Phone {
    public IPhone() {
        this.make();
    }
    @Override
    public void make() {
        System.out.println("make iphone!");
    }
}