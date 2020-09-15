package com.atguigu.D01���ԭ��principle.C03������תԭ��inversion.improve;

/**
 *  ��������
 * @author 77270
 *
 */
public class DependencyPass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ChangHong changHong = new ChangHong();
		
		//1��ͨ���ӿڴ���
//		OpenAndClose openAndClose = new OpenAndClose();
//		openAndClose.open(changHong);
		
		//2��ͨ��������������������
//		OpenAndClose openAndClose = new OpenAndClose(changHong);
//		openAndClose.open();
		
		//3��ͨ��setter����������������
//		OpenAndClose openAndClose = new OpenAndClose();
//		openAndClose.setTv(changHong);
//		openAndClose.open();

	}
}

 // ��ʽ1�� ͨ���ӿڴ���ʵ������
 // TV
// interface ITV {
//	 public void play();
// }
// 
// class ChangHong implements ITV {
//	@Override
//	public void play() {
//		// TODO Auto-generated method stub
//		System.out.println("������ӻ�����");
//	}
// }
// 
// // ����
// interface IOpenAndClose {
//	 public void open(ITV tv); //���󷽷�,���սӿ�
// }
// 
// class OpenAndClose implements IOpenAndClose{
//	 public void open(ITV tv){
//		 tv.play();
//	 }
// }

// ��ʽ2: ͨ�����췽����������
// interface IOpenAndClose {
//	 public void open(); //���󷽷�
// }
// 
// interface ITV { //ITV�ӿ�
//	 public void play();
// }
// 
// class OpenAndClose implements IOpenAndClose{
//	 
//	 public ITV tv; //��Ա
//	 
//	 public OpenAndClose(ITV tv){ //������
//		 this.tv = tv;
//	 }
//	 public void open(){
//		 this.tv.play();
//	 }
// }

// ��ʽ3 , ͨ��setter��������
interface ITV { // ITV�ӿ�
	public void play();
}

class ChangHong implements ITV {
	public void play() {
		System.out.println("������ӻ�����");
	}
}

interface IOpenAndClose {
	public void open(); // ���󷽷�
	public void setTv(ITV tv);
}

class OpenAndClose implements IOpenAndClose {
	private ITV tv;

	public void setTv(ITV tv) {
		this.tv = tv;
	}

	public void open() {
		this.tv.play();
	}
}
