package com.atguigu.M15������ģʽiterator;

import java.util.ArrayList;
import java.util.List;

import com.atguigu.M15������ģʽiterator.��ϢѧԺ.InfoCollege;
import com.atguigu.M15������ģʽiterator.�����ѧԺ.ComputerCollege;

public class Client {

	public static void main(String[] args) {
		//����ѧԺ
		List<College> collegeList = new ArrayList<College>();
		
		ComputerCollege computerCollege = new ComputerCollege();
		InfoCollege infoCollege = new InfoCollege();
		
		collegeList.add(computerCollege);
		//collegeList.add(infoCollege);
		
		OutPutImpl outPutImpl = new OutPutImpl(collegeList);
		outPutImpl.printCollege();
	}

}
