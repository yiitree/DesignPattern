package com.atguigu.D01设计原则principle.C03依赖倒转原则inversion.improve;

public class DependecyInversion {
	public static void main(String[] args) {
		//客户端无需改变
		Person person = new Person();
		
		IReceiver receiver = new Email();
		person.receive(receiver);
		
		person.receive(new Email());
		person.receive(new WeiXin());
	}
}
// 有点类似于方法重载

class Person {
	//这里我们是对接口的依赖
	public void receive(IReceiver receiver) {
		System.out.println(receiver.getInfo());
	}
}

//定义接口
// 相当于一个缓冲层
interface IReceiver {
	public String getInfo();
}

// 邮箱
class Email implements IReceiver {
	public String getInfo() {
		return "电子邮件信息: hello,world";
	}
}

// 微信
class WeiXin implements IReceiver {
	public String getInfo() {
		return "微信信息: hello,ok";
	}
}


