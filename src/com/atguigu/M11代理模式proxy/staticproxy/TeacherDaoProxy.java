package com.atguigu.M11����ģʽproxy.staticproxy;

//�������,��̬����
public class TeacherDaoProxy implements ITeacherDao{
	
	// Ŀ�����ͨ���ӿ����ۺ�
	private ITeacherDao target; 
	
	//������
	public TeacherDaoProxy(ITeacherDao target) {
		this.target = target;
	}

	@Override
	public void teach() {
		System.out.println("��ʼ����  ���ĳЩ�������������� ");//����
		this.target.teach();
		System.out.println("�ύ����������");//����
	}

}
