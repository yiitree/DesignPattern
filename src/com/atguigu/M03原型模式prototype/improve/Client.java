package com.atguigu.M03ԭ��ģʽprototype.improve;



public class Client {

	public static void main(String[] args) {
		
		System.out.println("ԭ��ģʽ��ɶ���Ĵ���");
		Sheep sheep = new Sheep("tom", 1, "��ɫ");
		sheep.friend = new Sheep("jack", 2, "��ɫ");
		
		Sheep sheep2 = (Sheep)sheep.clone(); //��¡
		Sheep sheep3 = (Sheep)sheep.clone(); //��¡
		Sheep sheep4 = (Sheep)sheep.clone(); //��¡
		Sheep sheep5 = (Sheep)sheep.clone(); //��¡
		
		System.out.println("sheep =" + sheep + "sheep.friend=" + sheep.friend.hashCode() + "sheep=" + sheep.hashCode());
		
		System.out.println("sheep2 =" + sheep2 + "sheep2.friend=" + sheep2.friend.hashCode() +"sheep2=" +sheep2.hashCode());
		System.out.println("sheep3 =" + sheep3 + "sheep3.friend=" + sheep3.friend.hashCode() + "sheep3="+sheep3.hashCode());
		System.out.println("sheep4 =" + sheep4 + "sheep4.friend=" + sheep4.friend.hashCode() + "sheep4="+sheep4.hashCode());
		System.out.println("sheep5 =" + sheep5 + "sheep5.friend=" + sheep5.friend.hashCode() + "sheep5="+sheep5.hashCode());
	}

}
