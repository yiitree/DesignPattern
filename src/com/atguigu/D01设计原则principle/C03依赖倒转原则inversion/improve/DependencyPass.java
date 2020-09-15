package com.atguigu.D01设计原则principle.C03依赖倒转原则inversion.improve;

/**
 *  依赖传递
 * @author 77270
 *
 */
public class DependencyPass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ChangHong changHong = new ChangHong();
		
		//1、通过接口传递
//		OpenAndClose openAndClose = new OpenAndClose();
//		openAndClose.open(changHong);
		
		//2、通过构造器进行依赖传递
//		OpenAndClose openAndClose = new OpenAndClose(changHong);
//		openAndClose.open();
		
		//3、通过setter方法进行依赖传递
//		OpenAndClose openAndClose = new OpenAndClose();
//		openAndClose.setTv(changHong);
//		openAndClose.open();

	}
}

 // 方式1： 通过接口传递实现依赖
 // TV
// interface ITV {
//	 public void play();
// }
// 
// class ChangHong implements ITV {
//	@Override
//	public void play() {
//		// TODO Auto-generated method stub
//		System.out.println("长虹电视机，打开");
//	}
// }
// 
// // 开关
// interface IOpenAndClose {
//	 public void open(ITV tv); //抽象方法,接收接口
// }
// 
// class OpenAndClose implements IOpenAndClose{
//	 public void open(ITV tv){
//		 tv.play();
//	 }
// }

// 方式2: 通过构造方法依赖传递
// interface IOpenAndClose {
//	 public void open(); //抽象方法
// }
// 
// interface ITV { //ITV接口
//	 public void play();
// }
// 
// class OpenAndClose implements IOpenAndClose{
//	 
//	 public ITV tv; //成员
//	 
//	 public OpenAndClose(ITV tv){ //构造器
//		 this.tv = tv;
//	 }
//	 public void open(){
//		 this.tv.play();
//	 }
// }

// 方式3 , 通过setter方法传递
interface ITV { // ITV接口
	public void play();
}

class ChangHong implements ITV {
	public void play() {
		System.out.println("长虹电视机，打开");
	}
}

interface IOpenAndClose {
	public void open(); // 抽象方法
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
