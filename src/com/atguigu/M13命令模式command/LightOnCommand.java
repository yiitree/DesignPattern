package com.atguigu.M13����ģʽcommand;

public class LightOnCommand implements Command {

	//�ۺ�LightReceiver
	LightReceiver light;
	
	//������
	public LightOnCommand(LightReceiver light) {
		super();
		this.light = light;
	}
	
	@Override
	public void execute() {
		//���ý����ߵķ���
		light.on();
	}

	@Override
	public void undo() {
		//���ý����ߵķ���
		light.off();
	}

}
