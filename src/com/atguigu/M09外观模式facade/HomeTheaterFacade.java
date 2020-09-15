package com.atguigu.M09���ģʽfacade;

import com.atguigu.M09���ģʽfacade.�豸.DVDPlayer;
import com.atguigu.M09���ģʽfacade.�豸.Popcorn;
import com.atguigu.M09���ģʽfacade.�豸.Projector;
import com.atguigu.M09���ģʽfacade.�豸.Screen;
import com.atguigu.M09���ģʽfacade.�豸.Stereo;
import com.atguigu.M09���ģʽfacade.�豸.TheaterLight;

/**
 * �����
 * ֪������Щ��ϵͳ������������
 * @author 77270
 *
 */
public class HomeTheaterFacade {
	
	//���������ϵͳ����
	private TheaterLight theaterLight;
	private Popcorn popcorn;
	private Stereo stereo;
	private Projector projector;
	private Screen screen;
	private DVDPlayer dVDPlayer;
	
	//������
	public HomeTheaterFacade() {
		super();
		this.theaterLight = TheaterLight.getInstance();
		this.popcorn = Popcorn.getInstance();
		this.stereo = Stereo.getInstance();
		this.projector = Projector.getInstance();
		this.screen = Screen.getInstance();
		this.dVDPlayer = DVDPlayer.getInstanc();
	}

	// �����ֳ� 4 ��
	// ׼��
	public void ready() {
		popcorn.on();
		popcorn.pop();
		screen.down();
		projector.on();
		stereo.on();
		dVDPlayer.on();
		theaterLight.dim();
	}
	// ����
	public void play() {
		dVDPlayer.play();
	}
	// ��ͣ
	public void pause() {
		dVDPlayer.pause();
	}
	// ����
	public void end() {
		popcorn.off();
		theaterLight.bright();
		screen.up();
		projector.off();
		stereo.off();
		dVDPlayer.off();
	}
	
}
