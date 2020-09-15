package com.atguigu.M11代理模式proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyFactory2 {

	//维护一个目标对象
	private TeacherDao target;
	
	//构造器，传入一个被代理的对象
	public ProxyFactory2(TeacherDao target) {
		this.target = target;
	}
	
	public TeacherDao getProxyInstance() {
		
		TeacherDao cglibProducer = (TeacherDao)Enhancer.create(
	            // 字节码，传递的为类的class文件，一个类中有多个方法，因此要选择其中的一个方法
				target.getClass(),
	            // 用于提供增强的代码
	            new MethodInterceptor() {
	                /**
	                 * 执行对象的任何方法都会经过该方法
	                 * @param proxy   代理对象的引用
	                 * @param method  要加强的方法
	                 * @param args    要加强的方法所需的参数
	                 * @param methodProxy  当前执行方法的代理对象
	                 * @return
	                 * @throws Throwable
	                 */
	                public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
	                	System.out.println("Cglib代理模式 ~~ 开始");
	            		//提供增强的代码
	                    Object returnValue = null;
	                    //1.方法参数
	                    Integer a = (Integer)args[0];
	                    //2.方法名
	                    if("teach".equals(method.getName())) {
	                        // 加强内容
	                        returnValue = method.invoke(target , a + 1);
	                    }
	                    System.out.println("Cglib代理模式 ~~ 提交");
	            		return returnValue;
	                }
	            }
	        );
		return cglibProducer;
	}

	
}



