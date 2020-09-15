package com.atguigu.M11����ģʽproxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyFactory2 {

	//ά��һ��Ŀ�����
	private TeacherDao target;
	
	//������������һ��������Ķ���
	public ProxyFactory2(TeacherDao target) {
		this.target = target;
	}
	
	public TeacherDao getProxyInstance() {
		
		TeacherDao cglibProducer = (TeacherDao)Enhancer.create(
	            // �ֽ��룬���ݵ�Ϊ���class�ļ���һ�������ж�����������Ҫѡ�����е�һ������
				target.getClass(),
	            // �����ṩ��ǿ�Ĵ���
	            new MethodInterceptor() {
	                /**
	                 * ִ�ж�����κη������ᾭ���÷���
	                 * @param proxy   ������������
	                 * @param method  Ҫ��ǿ�ķ���
	                 * @param args    Ҫ��ǿ�ķ�������Ĳ���
	                 * @param methodProxy  ��ǰִ�з����Ĵ������
	                 * @return
	                 * @throws Throwable
	                 */
	                public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
	                	System.out.println("Cglib����ģʽ ~~ ��ʼ");
	            		//�ṩ��ǿ�Ĵ���
	                    Object returnValue = null;
	                    //1.��������
	                    Integer a = (Integer)args[0];
	                    //2.������
	                    if("teach".equals(method.getName())) {
	                        // ��ǿ����
	                        returnValue = method.invoke(target , a + 1);
	                    }
	                    System.out.println("Cglib����ģʽ ~~ �ύ");
	            		return returnValue;
	                }
	            }
	        );
		return cglibProducer;
	}

	
}



