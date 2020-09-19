package com.atguigu.M19解释器模式interpreter.解释器;

import java.util.HashMap;

import com.atguigu.M19解释器模式interpreter.Expression;
/**
 * 减法解释器
 */
public class SubExpression extends SymbolExpression {

	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	//求出left 和 right 表达式相减后的结果
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) - super.right.interpreter(var);
	}
}
