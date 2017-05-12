package com.labor.service.impl;

import com.labor.dao.T_studentDao;
import com.labor.dao.impl.T_studentDaoImpl;
import com.labor.service.T_studentService;

public class T_studentServiceImpl implements T_studentService {
	private T_studentDao studentDao=new T_studentDaoImpl();

	@Override
	public String findStudetByStudent_id(int student_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findBalanceByStudent_id(int student_id) {
		return studentDao.findBalanceByStudent_id(student_id);
	}

}
