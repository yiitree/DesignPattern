package com.atguigu.M19������ģʽinterpreter.������;

import java.util.HashMap;

import com.atguigu.M19������ģʽinterpreter.Expression;
/**
 * ����������
 */
public class SubExpression extends SymbolExpression {

	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	//���left �� right ���ʽ�����Ľ��
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) - super.right.interpreter(var);
	}
}
