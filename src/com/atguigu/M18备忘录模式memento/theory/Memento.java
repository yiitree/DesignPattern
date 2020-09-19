package com.atguigu.M18备忘录模式memento.theory;

/**
 * 备忘录对象（用于保存原始对象的状态）
 */
public class Memento {
	
	private String state;

	//构造器
	public Memento(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}
	
}
