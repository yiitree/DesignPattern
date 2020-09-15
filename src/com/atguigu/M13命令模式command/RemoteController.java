package com.atguigu.M13����ģʽcommand;

public class RemoteController {

	// ������---Ϊһ�����飬��Ϊ�����ԡ���Ƶȵ�
	Command[] onCommands;
	Command[] offCommands;

	// ִ�г��������ÿһ�������һ���������
	Command undoCommand;

	// ����������ɶ԰�ť��ʼ��
	public RemoteController() {
		onCommands = new Command[5];
		offCommands = new Command[5];
		for (int i = 0; i < 5; i++) {
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}
	}

	// ��������ľ�������---�����ǵİ�ť��������Ҫ������
	public void setCommand(int no, Command onCommand, Command offCommand) {
		onCommands[no] = onCommand;
		offCommands[no] = offCommand;
	}

	// ���¿���ť
	public void onButtonWasPushed(int no) { // no 0
		// �ҵ��㰴�µĿ��İ�ť�� �����ö�Ӧ����
		onCommands[no].execute();
		// ��¼��εĲ��������ڳ���
		undoCommand = onCommands[no];
	}

	// ���¹ذ�ť
	public void offButtonWasPushed(int no) { // no 0
		// �ҵ��㰴�µĹصİ�ť�� �����ö�Ӧ����
		offCommands[no].execute();
		// ��¼��εĲ��������ڳ���
		undoCommand = offCommands[no];
	}
	
	// ���³�����ť
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}

}
