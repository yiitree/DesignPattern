package com.atguigu.M14访问者模式visitor.意见;

import com.atguigu.M14访问者模式visitor.人员.Man;
import com.atguigu.M14访问者模式visitor.人员.Woman;

public class Success extends Action {

	@Override
	public void getManResult(Man man) {
		System.out.println(" 男人给的评价该歌手很成功 !");
	}

	@Override
	public void getWomanResult(Woman woman) {
		System.out.println(" 女人给的评价该歌手很成功 !");
	}

}
