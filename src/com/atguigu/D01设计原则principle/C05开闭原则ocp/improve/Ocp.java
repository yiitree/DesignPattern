package com.atguigu.D01���ԭ��principle.C05����ԭ��ocp.improve;

public class Ocp {

	public static void main(String[] args) {
		//ʹ�ÿ������ڵ�����
		GraphicEditor graphicEditor = new GraphicEditor();
		graphicEditor.drawShape(new Rectangle());
		graphicEditor.drawShape(new Circle());
		graphicEditor.drawShape(new Triangle());
		graphicEditor.drawShape(new OtherGraphic());
	}

}

//����һ�����ڻ�ͼ���� [ʹ�÷�]
class GraphicEditor {
	//����Shape���󣬵���draw����
	public void drawShape(Shape s) {
		s.draw();
	}
}

//Shape�࣬����
abstract class Shape {
	public abstract void draw();//���󷽷�
}

class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println(" ���ƾ��� ");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println(" ����Բ�� ");
	}
}

//������������
class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println(" ���������� ");
	}
}

//����һ��ͼ��
class OtherGraphic extends Shape {
	@Override
	public void draw() {
		System.out.println(" ��������ͼ�� ");
	}
}
