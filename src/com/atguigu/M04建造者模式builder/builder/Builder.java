package com.atguigu.M04建造者模式builder.builder;

/**
 * @Author: 鏇剧澘
 * @Date: 2020/9/9 19:56
 */
public abstract class Builder {

    public abstract void BuildPartA();        //浜у搧鐨凙閮ㄤ欢
    public abstract void BuildPartB();        //浜у搧鐨凚閮ㄤ欢
    public abstract Product getResult();      //鑾峰彇浜у搧寤洪�犲悗缁撴灉

}
