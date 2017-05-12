package com.labor.service.impl;

import com.labor.dao.T_test_studentDao;
import com.labor.dao.impl.T_test_studentDaoImpl;
import com.labor.service.T_test_studentService;

public class T_test_studentServiceImpl implements T_test_studentService{
	private T_test_studentDao test_studentDao=new T_test_studentDaoImpl();

	@Override
	public int findscoreByStudentAndTest_id(int student_id, int test_id) {
		// TODO Auto-generated method stub
		return test_studentDao.findscoreByStudentAndTest_id(student_id, test_id);
	}

}
