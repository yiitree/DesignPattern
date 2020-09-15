package com.atguigu.M05适配器模式adapter.D03接口适配器interfaceadapter;

public class Client {
	
	public static void main(String[] args) {
		AbsAdapter absAdapter = new AbsAdapter() {
			//只需要去覆盖我们 需要使用 接口方法
			@Override
			public void m1() {
				System.out.println("使用了m1的方法");
			}
		};
		absAdapter.m1();
		
		
		
		Interface4 absAdapter1 = new Interface4() {
			//只需要去覆盖我们 需要使用 接口方法
			@Override
			public void m1() {
				System.out.println("使用了m1的方法");
			}

			@Override
			public void m2() {
			}

			@Override
			public void m3() {
			}

			@Override
			public void m4() {
			}
		};
		absAdapter1.m1();
		
		
	}
}
