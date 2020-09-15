package com.atguigu.M03ԭ��ģʽprototype.���deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepProtoType implements Serializable, Cloneable{
	
	//String ����
	public String name; 
	// ��������
	public DeepCloneableTarget deepCloneableTarget;
	
	public DeepProtoType() {
		super();
	}
	
	//��� - ��ʽ 1 ʹ��clone ����
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object deep = null;
		// ������ɶԻ�����������(����)��String�Ŀ�¡
		deep = super.clone(); 
		// ���������͵����ԣ����е�������
		DeepProtoType deepProtoType = (DeepProtoType)deep;
		deepProtoType.deepCloneableTarget  = (DeepCloneableTarget)deepCloneableTarget.clone();
		return deepProtoType;
	}
	
	//��� - ��ʽ2 ͨ����������л�ʵ�� (�Ƽ�)
	public Object deepClone() {
		
		// �ֽ�����
		ByteArrayInputStream bis = null;
		// ��������
		ObjectInputStream ois = null;
		// �ֽ����
		ByteArrayOutputStream bos = null;
		// �������
		ObjectOutputStream oos = null;
		
		try {
			//���л�
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this); //��ǰ��������Զ������ķ�ʽ��������л���
			
			//�����л�
			bis = new ByteArrayInputStream(bos.toByteArray());// �Ѷ����ٶ�����
			ois = new ObjectInputStream(bis);
			DeepProtoType copyObj = (DeepProtoType)ois.readObject();
			return copyObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			//�ر���
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
	}
	
}
