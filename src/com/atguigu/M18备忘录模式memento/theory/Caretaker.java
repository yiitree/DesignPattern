package com.atguigu.M18备忘录模式memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责管理备忘录对象
 * 一个具体对象对应一类备忘录对象
 * Caretaker负责这类对象的所有备忘录对象
 * @author 77270
 *
 */
public class Caretaker {
	
	//在List 集合中会有很多的备忘录对象
	private List<Memento> mementoList = new ArrayList<Memento>();
	
	public void add(Memento memento) {
		mementoList.add(memento);
	}
	
	//获取到第index个Originator 的 备忘录对象(即保存状态)
	public Memento get(int index) {
		return mementoList.get(index);
	}
}
