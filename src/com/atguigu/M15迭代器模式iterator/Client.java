package com.atguigu.M15迭代器模式iterator;

import java.util.ArrayList;
import java.util.List;

import com.atguigu.M15迭代器模式iterator.信息学院.InfoCollege;
import com.atguigu.M15迭代器模式iterator.计算机学院.ComputerCollege;

public class Client {

	public static void main(String[] args) {
		//创建学院
		List<College> collegeList = new ArrayList<College>();
		
		ComputerCollege computerCollege = new ComputerCollege();
		InfoCollege infoCollege = new InfoCollege();
		
		collegeList.add(computerCollege);
		//collegeList.add(infoCollege);
		
		OutPutImpl outPutImpl = new OutPutImpl(collegeList);
		outPutImpl.printCollege();
	}

}
