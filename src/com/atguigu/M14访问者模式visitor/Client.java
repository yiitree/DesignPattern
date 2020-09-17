package com.atguigu.M14������ģʽvisitor;

import com.atguigu.M14������ģʽvisitor.��Ա.Man;
import com.atguigu.M14������ģʽvisitor.��Ա.Woman;
import com.atguigu.M14������ģʽvisitor.���.Fail;
import com.atguigu.M14������ģʽvisitor.���.Success;
import com.atguigu.M14������ģʽvisitor.���.Wait;

public class Client {

	public static void main(String[] args) {
		//����ObjectStructure
		ObjectStructure objectStructure = new ObjectStructure();
		
		objectStructure.attach(new Man());
		objectStructure.attach(new Woman());
	
		System.out.println("=======�ɹ�========");
		Success success = new Success();
		objectStructure.display(success);
		
		System.out.println("=======ʧ��========");
		Fail fail = new Fail();
		objectStructure.display(fail);
		
		System.out.println("=======����========");
		Wait wait = new Wait();
		objectStructure.display(wait);
	}

}
