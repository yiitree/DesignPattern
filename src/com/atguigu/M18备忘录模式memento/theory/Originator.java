package com.atguigu.M18����¼ģʽmemento.theory;

/**
 * ԭʼ����
 */
public class Originator {

	private String state;//״̬��Ϣ
	
	//��дһ�����������Ա���һ��״̬���� Memento
	//��˱�дһ������������ Memento
	public Memento saveStateMemento() {
		return new Memento(state);
	}
	
	//ͨ������¼���󣬻ָ�״̬
	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
