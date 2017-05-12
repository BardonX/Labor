package com.labor.service.impl;

import com.labor.dao.T_teacher_courseDao;
import com.labor.dao.impl.T_teacher_courseDaoImpl;
import com.labor.service.T_teacher_courseService;

public class T_teacher_courseServiceImpl implements T_teacher_courseService {
	private T_teacher_courseDao teacher_courseDao=new T_teacher_courseDaoImpl();

	@Override
	public int findTeacheridByCourse_id(int course_id) {
		// TODO Auto-generated method stub
		return teacher_courseDao.findTeacheridByCourse_id(course_id);
	}

}
