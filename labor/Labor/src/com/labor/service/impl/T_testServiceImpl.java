package com.labor.service.impl;

import com.labor.dao.T_testDao;
import com.labor.dao.impl.T_testDaoImpl;
import com.labor.service.T_testService;

public class T_testServiceImpl implements T_testService{
	private T_testDao testDao=new T_testDaoImpl();

	@Override
	public String findAverageByCourse_id(int course_id) {
		// TODO Auto-generated method stub
		return testDao.findAverageByCourse_id(course_id);
	}

	@Override
	public int findTestidByCourse_id(int course_id) {
		// TODO Auto-generated method stub
		return testDao.findTestidByCourse_id(course_id);
	}

}
