package com.labor.service.impl;

import com.labor.dao.T_teacherDao;
import com.labor.dao.impl.T_teacherDaoImpl;
import com.labor.service.T_teacherService;

public class T_teacherServiceImpl implements T_teacherService {

	private T_teacherDao teacherDao=new T_teacherDaoImpl();
	@Override
	public String fingTeachernameByTeacher_id(int teacher_id) {
		// TODO Auto-generated method stub
		return teacherDao.fingTeachernameByTeacher_id(teacher_id);
	}

}
