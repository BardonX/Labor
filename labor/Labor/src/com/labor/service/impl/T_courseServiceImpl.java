package com.labor.service.impl;

import java.util.List;

import com.labor.dao.T_courseDao;
import com.labor.dao.impl.T_courseDaoImpl;
import com.labor.service.T_courseService;

public class T_courseServiceImpl implements T_courseService {
	private T_courseDao courseDao=new T_courseDaoImpl();

	@Override
	public String findTimeLocation_1ByCourse_id(int Course_id) {
	
		return courseDao.findTimeLocation_1ByCourse_id(Course_id);
	}

	@Override
	public String findTimeLocation_2ByCourse_id(int Course_id) {

		return courseDao.findTimeLocation_2ByCourse_id(Course_id);
	}

	@Override
	public String findTimeLocation_3ByCourse_id(int Course_id) {

		return courseDao.findTimeLocation_3ByCourse_id(Course_id);
	}

	@Override
	public String findCourseNameByCourse_id(int Course_id) {
		// TODO Auto-generated method stub
		return courseDao.findCourseNameByCourse_id(Course_id);
	}

	@Override
	public String findCreditByCourse_id(int Course_id) {
		// TODO Auto-generated method stub
		return courseDao.findCreditByCourse_id(Course_id);
	}

	@Override
	public List<List<String>> findElective_courseByeg4(String eg4) {
		// TODO Auto-generated method stub
		return courseDao.findElective_courseByeg4(eg4);
	}

}
