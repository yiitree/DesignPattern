package com.atguigu.M02工厂模式factory.phone.工厂方法;

public class XiaoMiFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }
}