package com.atguigu.M14访问者模式visitor;

import com.atguigu.M14访问者模式visitor.人员.Man;
import com.atguigu.M14访问者模式visitor.人员.Woman;
import com.atguigu.M14访问者模式visitor.意见.Fail;
import com.atguigu.M14访问者模式visitor.意见.Success;
import com.atguigu.M14访问者模式visitor.意见.Wait;

public class Client {

	public static void main(String[] args) {
		//创建ObjectStructure
		ObjectStructure objectStructure = new ObjectStructure();
		
		objectStructure.attach(new Man());
		objectStructure.attach(new Woman());
	
		System.out.println("=======成功========");
		Success success = new Success();
		objectStructure.display(success);
		
		System.out.println("=======失败========");
		Fail fail = new Fail();
		objectStructure.display(fail);
		
		System.out.println("=======待定========");
		Wait wait = new Wait();
		objectStructure.display(wait);
	}

}
