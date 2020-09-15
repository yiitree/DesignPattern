package com.atguigu.M09外观模式facade;

import com.atguigu.M09外观模式facade.设备.DVDPlayer;
import com.atguigu.M09外观模式facade.设备.Popcorn;
import com.atguigu.M09外观模式facade.设备.Projector;
import com.atguigu.M09外观模式facade.设备.Screen;
import com.atguigu.M09外观模式facade.设备.Stereo;
import com.atguigu.M09外观模式facade.设备.TheaterLight;

/**
 * 外观类
 * 知道有哪些子系统，负责处理请求
 * @author 77270
 *
 */
public class HomeTheaterFacade {
	
	//定义各个子系统对象
	private TheaterLight theaterLight;
	private Popcorn popcorn;
	private Stereo stereo;
	private Projector projector;
	private Screen screen;
	private DVDPlayer dVDPlayer;
	
	//构造器
	public HomeTheaterFacade() {
		super();
		this.theaterLight = TheaterLight.getInstance();
		this.popcorn = Popcorn.getInstance();
		this.stereo = Stereo.getInstance();
		this.projector = Projector.getInstance();
		this.screen = Screen.getInstance();
		this.dVDPlayer = DVDPlayer.getInstanc();
	}

	// 操作分成 4 步
	// 准备
	public void ready() {
		popcorn.on();
		popcorn.pop();
		screen.down();
		projector.on();
		stereo.on();
		dVDPlayer.on();
		theaterLight.dim();
	}
	// 播放
	public void play() {
		dVDPlayer.play();
	}
	// 暂停
	public void pause() {
		dVDPlayer.pause();
	}
	// 结束
	public void end() {
		popcorn.off();
		theaterLight.bright();
		screen.up();
		projector.off();
		stereo.off();
		dVDPlayer.off();
	}
	
}
