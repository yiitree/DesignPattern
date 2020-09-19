package com.atguigu.M19������ģʽinterpreter.������;

import java.util.HashMap;

import com.atguigu.M19������ģʽinterpreter.Expression;


/**
 * �����Ľ�����
 * @author Administrator
 *
 */
public class VarExpression extends Expression {

	// key=a,key=b,key=c
	private String key; 

	public VarExpression(String key) {
		this.key = key;
	}

	// var ����{a=10, b=20}
	// interpreter ���� �������ƣ����ض�Ӧֵ
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}
}
